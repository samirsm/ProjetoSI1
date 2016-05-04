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

import com.google.common.base.Strings;

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
	static final ConsumerKey KEY = new ConsumerKey("...", "...");
	
	private static final ServiceInfo SERVICE_INFO =
	        new ServiceInfo("https://api.twitter.com/oauth/request_token",
	            "https://api.twitter.com/oauth/access_token",
	            "https://api.twitter.com/oauth/authorize",
	            KEY);
	
	private static final OAuth TWITTER = new OAuth(SERVICE_INFO);
	private final WSClient ws;
	
	@Inject
	public AutenticacaoController (FormFactory formFactory, WSClient ws){
		this.formFactory = formFactory;
		this.ws = ws;
		loggerAutenticacao = new LoggerSistema();
	}

	public Result efetuaLogin(){
		Usuario usuarioLogado = null;
		
		try {
			usuarioLogado = autenticaUsuario();
			if (usuarioLogado == null) 
				throw new LoginInvalidoException();
		} catch (DadosInvalidosException | LoginInvalidoException e) {
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(e.getMessage());
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

	private Usuario autenticaUsuario() throws DadosInvalidosException, LoginInvalidoException{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String matricula = requestData.get("matricula");
		String email = matricula; // O usuário pode digitar um dos dois no mesmo campo
		String senha = requestData.get("senha");
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(matricula, email, senha);
		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGIN, usuarioLogado.toString());
		
		return usuarioLogado;
		
	}

	private Result verificaPrimeiroAcessoUsuario(Usuario usuario) {
		loggerAutenticacao.registraAcao(Acao.VERIFICA_PRIMEIRO_ACESSO, usuario.toString());
		return redirect(routes.HomeController.index());
	}
	
	public Result auth() {
        String verifier = request().getQueryString("oauth_verifier");
        if (Strings.isNullOrEmpty(verifier)) {
            String url = routes.AutenticacaoController.auth().absoluteURL(request());
            RequestToken requestToken = TWITTER.retrieveRequestToken(url);
            saveSessionTokenPair(requestToken);
            return redirect(TWITTER.redirectUrl(requestToken.token));
        } else {
            RequestToken requestToken = getSessionTokenPair().get();
            RequestToken accessToken = TWITTER.retrieveAccessToken(requestToken, verifier);
            saveSessionTokenPair(accessToken);
            return redirect(routes.HomeController.index());
        }
    }
	
	private void saveSessionTokenPair(RequestToken requestToken) {
        session("token", requestToken.token);
        session("secret", requestToken.secret);
    }
	
	private Optional<RequestToken> getSessionTokenPair() {
        if (session().containsKey("token")) {
            return Optional.ofNullable(new RequestToken(session("token"), session("secret")));
        }
        return Optional.empty();
    }
}
