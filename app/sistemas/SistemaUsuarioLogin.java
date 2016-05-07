package sistemas;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import sistemas.mensagens.Idioma;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
    private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Usuario usuarioLogado;
	private Idioma idioma = Idioma.PORTUGUES;
	private Idioma idi;

	
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
		if(usuarioLogado != null) usuarioLogado.setIdioma(SistemaUsuarioLogin.getInstance().getIdioma());
	}
	
	public void efetuaLogout(){
	    SISTEMA_CARONA.limpaListaCaronaSolicitadas();
		usuarioLogado = null;
	}
	
	public boolean isLogado(){
	  return !(usuarioLogado.equals(null));
	
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
