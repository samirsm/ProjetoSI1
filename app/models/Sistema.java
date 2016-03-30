package models;

import java.util.List;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Sistema extends Model {
	
	private Usuario usuarioLogado;
	List<Usuario> usuariosSistema;
	
	public Sistema(Usuario usuarioLogado, List<Usuario> usuariosSistema) {
		this.usuarioLogado = usuarioLogado;
		this.usuariosSistema = usuariosSistema;
	}
	
	// TODO
	public List<Usuario> getListaPassageiros(){
		return null;
	}
	
	// TODO
	public void ofereceCarona(Usuario passageiro){
		
	}
	
}
