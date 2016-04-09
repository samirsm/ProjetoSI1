package models;

import java.io.File;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class Usuario extends Model {
	private ArrayList<Horario> horarios;
	private Dados dadosUsuario;
	private Carro carro;
	
	public Usuario(Dados dadosPessoais, Carro carro){
		this.dadosUsuario = dadosPessoais;
		this.carro = carro;
		horarios = new ArrayList<Horario>();
	}
	
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	@Id
	private Long id;
	
	public ArrayList<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}

	public Dados getDadosUsuario() {
		return dadosUsuario;
	}

	public void setDadosUsuario(Dados dadosUsuario) {
		this.dadosUsuario = dadosUsuario;
	}

	public Long getId(){
		return id;
	}
	
	public String getEmail(){
		return dadosUsuario.getEmail();
	}
	
	public String getNome(){
		return dadosUsuario.getNome();
	}
	
	public String getNumeroDeTelefone(){
		return dadosUsuario.getNumeroDeTelefone();
	}
	
	public File getFoto() {
		return dadosUsuario.getFoto();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;
		
		Usuario outroUsuario = (Usuario) obj;
		
		return outroUsuario.equals(dadosUsuario);

	}
}
