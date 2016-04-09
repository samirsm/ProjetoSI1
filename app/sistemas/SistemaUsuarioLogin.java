package sistemas;

import models.Usuario;

public class SistemaUsuarioLogin {
	
	private static final SistemaUsuarioLogin INSTANCIA = new SistemaUsuarioLogin();
	private Usuario usuarioLogado;
	
	private SistemaUsuarioLogin(){
	}
	
	public static SistemaUsuarioLogin getInstance(){
		return INSTANCIA;
	}
	
	public Usuario getUsuarioLogado (){
		return usuarioLogado;
	}
	
	public void efetuaLogin(String matricula, String email, String senha){
		usuarioLogado = SistemaUsuarioCRUD.getInstance().consultaUsuario(matricula, email, senha);
	}
	
	public void efetuaLogout(){
		usuarioLogado = null;
	}
}
