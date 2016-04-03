package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class Usuario extends Model {
	
	private String nome;
	private String matricula;
	private String numeroDeTelefone;
	private String email;
	private String foto;
	private String senha;
	private int numeroVagas;
	private Endereco endereco;
	
	@Id
	private Long id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}
	
	public void setSenha(String novaSenha){
		this.senha = novaSenha;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public Long getId(){
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;
		
		Usuario outroUsuario = (Usuario) obj;
		
		return matricula.equals(outroUsuario.getMatricula()) && senha.equals(outroUsuario.getSenha());
	}
	
	@Override
	public String toString() {
		return nome + " " + matricula + " " + numeroDeTelefone + " " + " " + foto + " " + " " + senha + " " + numeroVagas + " ";
	}
}
