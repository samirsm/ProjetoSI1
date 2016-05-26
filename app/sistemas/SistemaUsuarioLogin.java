package sistemas;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import controllers.AutenticacaoController;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.mensagens.Idioma;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
    private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Usuario usuarioLogado;
	private static String tokenAuth;
	private static String userTime;
	private Idioma idioma = Idioma.PORTUGUES;

	private SistemaUsuarioLogin(){}
	
	public static SistemaUsuarioLogin getInstance(){
		return INSTANCIA;
	}
	
	public Usuario getUsuarioLogado (){
		return usuarioLogado;
	}
	
	public void efetuaLogin(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		usuarioLogado = Usuario.authenticate(matricula, email, senha);
		tokenAuth = AutenticacaoController.session().get("login");
		userTime = AutenticacaoController.session("userTime");
		if(usuarioLogado != null) usuarioLogado.setIdioma(SistemaUsuarioLogin.getInstance().getIdioma());
	}
	
	public String getTokenAuth(){
		return tokenAuth;
	}
	
	public String getUserTime(){
		return userTime;
	}
	
	public void efetuaLogout(){
		usuarioLogado.save();
	    SISTEMA_CARONA.limpaListaCaronaSolicitadas();
	    tokenAuth = null;
		usuarioLogado = null;
	}
	
	public boolean isLogado(){
	  return usuarioLogado != null;
	
	}
	public void cadastrouHorarios(){
		usuarioLogado.cadastrouHorarios();
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}


}
