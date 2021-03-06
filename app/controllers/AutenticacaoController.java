package controllers;

import javax.inject.Inject;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import exceptions.UsuarioJaExistenteException;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.cache.CacheApi;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.libs.oauth.OAuth;
import play.libs.oauth.OAuth.ConsumerKey;
import play.libs.oauth.OAuth.ServiceInfo;
import play.libs.oauth.OAuth.OAuthCalculator;
import play.libs.oauth.OAuth.RequestToken;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import com.google.common.base.Strings;
import play.mvc.Http.Context;
import play.mvc.Http.Session;

import java.util.Date;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;
import views.html.*;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private LoggerSistema loggerAutenticacao;

	@Inject
	public AutenticacaoController (FormFactory formFactory, CacheApi cache){
		this.formFactory = formFactory;
		loggerAutenticacao = new LoggerSistema();
	}
	
	public Result efetuaLogin(){
		Usuario usuarioLogado = null;

		try {
			usuarioLogado = autenticaUsuario();
			if (usuarioLogado == null)
				throw new LoginInvalidoException();
		} catch (DadosInvalidosException | LoginInvalidoException e) {
			loggerAutenticacao.registraAcao(Acao.INFO, e.getMessage());
			flash("erro", e.getMessage());
			return redirect(routes.HomeController.login());
		}
		loggerAutenticacao.registraAcao(Acao.AUTENTICA_USUARIO, usuarioLogado.toString());

		return verificaPrimeiroAcessoUsuario(usuarioLogado);
	}

	public Result cadastraUsuario() {
		DynamicForm requestData = formFactory.form().bindFromRequest();

		String nome = requestData.get("nome");
		String matricula = requestData.get("matricula");
		String email = requestData.get("email");
		String senha = requestData.get("senha");
		String numeroDeTelefone = requestData.get("numeroDeTelefone");
		String rua = requestData.get("rua");
		String bairro = requestData.get("bairro");
		

		Dados dadosPessoais;
		Endereco endereco;

		try{
			if(requestData.hasErrors())
				throw new Exception();
			dadosPessoais = new Dados(nome, matricula, email, senha, numeroDeTelefone);
			endereco = new Endereco(rua, bairro);
		}catch(Exception e){
			loggerAutenticacao.registraAcao(Acao.ERRO, "divisor de erro - save endereço acima");
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			flash("erro", e.getMessage());
			return redirect(routes.HomeController.login());		
        }

		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString());
		Integer numeroVagas;
		Integer foto = 4;

		try{
			numeroVagas = Integer.parseInt(requestData.get("numeroVagas"));
			foto = Integer.parseInt(requestData.get("foto"));
		} catch (Exception e){
			numeroVagas = new Integer(0);
		}

		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());

		try{

		Usuario user = SistemaUsuarioCRUD.getInstance().cadastraUsuario(dadosPessoais, endereco, numeroVagas);
		user.setImagemPerfil(foto);
		} catch (UsuarioJaExistenteException | DadosInvalidosException e){
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			flash("erro", e.getMessage());

			return redirect(routes.HomeController.login());
		}

		loggerAutenticacao.registraAcao(Acao.USUARIO_CADASTRADO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());

		Idioma idioma =SistemaUsuarioLogin.getInstance().getIdioma(session("login"));
		flash("success", MensagensSistema.CADASTRO_SUCESSO[idioma.ordinal()]);
		return redirect(routes.HomeController.login());
	}
	
	
	public Result efetuaLogout(){
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGOUT, SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login")).toString());
		SistemaUsuarioLogin.getInstance().efetuaLogout();

		session().clear();

		return redirect(routes.HomeController.index());
	}

	private Usuario autenticaUsuario() throws DadosInvalidosException, LoginInvalidoException{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String login = requestData.get("login");
		String senha = requestData.get("senha");

		if (requestData.hasErrors())
			throw new DadosInvalidosException();
		
		session("login", login);
		session("userTime", Long.toString(new Date().getTime()));
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(login, senha);

		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGIN, usuarioLogado.toString());
		return usuarioLogado;
	}
	
	private Result verificaPrimeiroAcessoUsuario(Usuario usuario) {
		loggerAutenticacao.registraAcao(Acao.VERIFICA_PRIMEIRO_ACESSO, usuario.toString());
		return redirect(routes.HomeController.index());
	}
}
