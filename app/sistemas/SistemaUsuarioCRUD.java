package sistemas;

import java.util.ArrayList;
import java.util.List;
import models.Dados;
import models.Endereco;
import models.Usuario;

public final class SistemaUsuarioCRUD {
	
	private static final SistemaUsuarioCRUD INSTANCIA = new SistemaUsuarioCRUD();
	private List<Usuario> usuariosAtivados;
	private List<Usuario> usuariosDesativados;
	
	private SistemaUsuarioCRUD(){
		usuariosAtivados = new ArrayList<Usuario>();
		usuariosDesativados = new ArrayList<Usuario>();
	}

	public static SistemaUsuarioCRUD getInstance(){
		return INSTANCIA;
	}
	
	public boolean cadastraUsuario(Dados dadosPessoais, Endereco endereco){
		Usuario novoUsuario = new Usuario(dadosPessoais, endereco);
		return usuariosAtivados.add(novoUsuario);
	}
	
	public boolean desativaUsuario(String matricula, String email, String senha){
		Usuario usuarioASerDesativado = removeUsuario(matricula, email, senha);
		
		return usuariosDesativados.add(usuarioASerDesativado);
	}
	
	public Usuario consultaUsuario(String matricula, String email, String senha){
		return usuariosAtivados.get(buscaIndexUsuario(matricula, email, senha));
	}
	
	private Usuario removeUsuario(String matricula, String email, String senha){
		int indexUsuarioASerRemovido = buscaIndexUsuario(matricula, email, senha);
		
		return usuariosAtivados.remove(indexUsuarioASerRemovido);
	}
	
	
	private int buscaIndexUsuario(String matricula, String email, String senha){
		Dados matriculaSenhaUsuario = new Dados(matricula, email, senha);
		
		for (int i = 0; i < usuariosAtivados.size(); i++) {
			if(usuariosAtivados.get(i).getDadosUsuario().equals(matriculaSenhaUsuario))
				return i;
		}
		
		return -1;
	}
	
	public void atualizaEmail(String usuario, String novoEmail){
		
	}
	
	public void atualizaSenha(String usuario, String senha){
		
	}
	
	public void atualizaDados(String usuario, Dados dados){
		
	}
	
}
