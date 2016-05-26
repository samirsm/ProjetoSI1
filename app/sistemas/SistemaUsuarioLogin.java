package sistemas;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import controllers.AutenticacaoController;
import sistemas.mensagens.Idioma;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
    private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Idioma idioma = Idioma.PORTUGUES;

	private SistemaUsuarioLogin(){
	}
	
	public static SistemaUsuarioLogin getInstance(){
		return INSTANCIA;
	}
	
	public Usuario efetuaLogin(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Usuario user = SistemaUsuarioCRUD.getInstance().consultaUsuario(login, senha);
		if(user != null) user.setIdioma(SistemaUsuarioLogin.getInstance().getIdioma());
		
		return user;
	}
	
	public void efetuaLogout(){
	    SISTEMA_CARONA.limpaListaCaronaSolicitadas();
	}
	
	public void cadastrouHorarios(String token){
		if (token != null){
			Usuario usuarioLogado = getUsuarioLogado(token);
			usuarioLogado.cadastrouHorarios();
		}
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	public Usuario getUsuarioLogado (String token){
			return SistemaUsuarioCRUD.getInstance().getUsuarioPorLogin(token);
	}
	


}
