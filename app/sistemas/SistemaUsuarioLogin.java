package sistemas;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import play.libs.oauth.OAuth;
import play.libs.oauth.OAuth.ConsumerKey;
import play.libs.oauth.OAuth.OAuthCalculator;
import play.libs.oauth.OAuth.RequestToken;
import play.libs.oauth.OAuth.ServiceInfo;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;

import com.google.common.base.Strings;

import controllers.AutenticacaoController;

import javax.inject.Inject;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
    private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Usuario usuarioLogado;
	private static String tokenAuth;
	
	private SistemaUsuarioLogin(){
	}
	
	public static SistemaUsuarioLogin getInstance(){
		return INSTANCIA;
	}
	
	public Usuario getUsuarioLogado (){
		return usuarioLogado;
	}
	
	public void efetuaLogin(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		usuarioLogado = SistemaUsuarioCRUD.getInstance().consultaUsuario(matricula, email, senha);
		tokenAuth = AutenticacaoController.session().get("matricula");
	}
	
	public String getTokenAuth(){
		return tokenAuth;
	}
	
	public void efetuaLogout(){
	    SISTEMA_CARONA.limpaListaCaronaSolicitadas();
		usuarioLogado = null;
	}
	
	public boolean isLogado(){
	  return usuarioLogado != null;
	
	}
	public void cadastrouHorarios(){
		usuarioLogado.cadastrouHorarios();
	}
}
