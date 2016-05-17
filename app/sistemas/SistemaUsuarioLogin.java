package sistemas;

import com.avaje.ebean.Model;
import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import models.Usuario;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;

public class SistemaUsuarioLogin {
    private static final SistemaCarona SISTEMA_CARONA = SistemaCarona.getInstance();
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
	
	public void efetuaLogin(String matricula, String email, String senha) throws DadosInvalidosException, LoginInvalidoException{
		usuarioLogado = Usuario.authenticate(email, senha);
		//new LoggerSistema().registraAcao(Acao.ERRO, usuarioLogado.toString());
		//usuarioLogado = SistemaUsuarioCRUD.getInstance().consultaUsuario(matricula, email, senha);
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

}
