package sistemas;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import controllers.AutenticacaoController;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import play.mvc.Controller;
import controllers.AutenticacaoController;
import sistemas.mensagens.Idioma;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
    private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Usuario usuarioLogado;
	private Idioma idioma = Idioma.PORTUGUES;

	private SistemaUsuarioLogin(){}

	public static SistemaUsuarioLogin getInstance(){
		return INSTANCIA;
	}

	public Usuario efetuaLogin(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Usuario user = SistemaUsuarioCRUD.getInstance().consultaUsuario(login, senha);
		if(user != null) user.setIdioma(SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login")));

		return user;
	}
	
	public void efetuaLogout(){
		getUsuarioLogado(Controller.session().get("login")).save();
	    SISTEMA_CARONA.limpaListaCaronaSolicitadas();
	}
	
	public void cadastrouHorarios(String token){
		if (token != null){
			Usuario usuarioLogado = getUsuarioLogado(token);
			usuarioLogado.cadastrouHorarios();
		}
	}

	public Idioma getIdioma(String token) {
		if (token == null || getUsuarioLogado(token) == null)
			return Idioma.defineIdioma(Controller.session().get("idioma"));
		Usuario user = getUsuarioLogado(token);
		return user.getIdioma();
	}

	public void setIdioma(String token, Idioma idioma) {
		Usuario user = getUsuarioLogado(token);
		user.setIdioma(idioma);
	}
	
	public Usuario getUsuarioLogado (String token){
			return SistemaUsuarioCRUD.getInstance().getUsuarioPorLogin(token);
	}
	


	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}


}
