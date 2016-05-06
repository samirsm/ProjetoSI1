package controllers;

import javax.inject.Inject;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import exceptions.UsuarioCadastradoException;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.data.DynamicForm;
import play.data.FormFactory;
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

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import views.html.*;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private LoggerSistema loggerAutenticacao;
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
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
			return badRequest(e.getMessage());
		}
		
		if (session().get("matricula") == null) {
			loggerAutenticacao.registraAcao(Acao.INFO, session().get("matricula"));
			loggerAutenticacao.registraAcao(Acao.INFO, session().get("email"));
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
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(new DadosInvalidosException().getMessage());
		}
		
		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString());
		
		
		Integer numeroVagas;
		
		try{
			numeroVagas = Integer.parseInt(requestData.get("numeroVagas"));
		} catch (Exception e){
			numeroVagas = new Integer(-1);
		}
        
		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());
		
		try{
			SistemaUsuarioCRUD.getInstance().cadastraUsuario(dadosPessoais, endereco, numeroVagas);
		} catch (UsuarioCadastradoException e){
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(e.getMessage());
		}
		
		loggerAutenticacao.registraAcao(Acao.USUARIO_CADASTRADO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());
		return redirect(routes.HomeController.index());
	}
	
	public Result efetuaLogout(){
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGOUT, SistemaUsuarioLogin.getInstance().getUsuarioLogado().toString());
		
		SistemaUsuarioLogin.getInstance().efetuaLogout();
		
		return redirect(routes.HomeController.index());
	}
	
	// TODO Consertar.
	private Usuario autenticaUsuario() throws DadosInvalidosException, LoginInvalidoException{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String login = requestData.get("matricula");
		String email = login; // O usuário pode digitar um dos dois no mesmo campo
		String senha = requestData.get("senha");
		
		
		if (requestData.hasErrors())
			throw new DadosInvalidosException();

		session().put("matricula", login);
		session().put("email", email);
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(login, email, senha);

		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGIN, usuarioLogado.toString());
		
		//Checagem		
		return usuarioLogado;
	}
	
	private Result verificaPrimeiroAcessoUsuario(Usuario usuario) {
		loggerAutenticacao.registraAcao(Acao.VERIFICA_PRIMEIRO_ACESSO, usuario.toString());
		return redirect(routes.HomeController.index());
	}
}
