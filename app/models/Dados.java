package models;

import com.avaje.ebean.Model;

import exceptions.DadosInvalidosException;
import play.data.validation.Constraints;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Dados extends Model{


	@Constraints.Required(message = "Insira um nome válido.")
	@Column
	private String nome;
	
	@Constraints.Required(message = "Insira uma matrícula válida.")
	@Column
	private String matricula;
	
	@Constraints.Required(message = "Insira um email válido.")
	@Column
	private String email;
	
	@Constraints.Required(message = "Insira uma senha válida.")
	@Column
	private String senha;
	
	@Constraints.Required(message = "Insira um número de telefone válido.")
	@Column
	private String numeroDeTelefone;


	public Dados(String matricula, String email, String senha) throws DadosInvalidosException {
		checaExcecoes(matricula, email, senha);
		
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
	}
	
	// Construtor default
	@Inject
	public Dados () {
	}
	
	public Dados(String nome, String matricula, String email, String senha, String numeroDeTelefone) throws DadosInvalidosException{
		checaExcecoes(nome, matricula, email, senha, numeroDeTelefone);
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
		this.numeroDeTelefone = numeroDeTelefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}
	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	private void checaExcecoes(String...dadosPessoais) throws DadosInvalidosException {
		for (int i = 0; i < dadosPessoais.length; i++) {
			if (dadosPessoais[i] == null || dadosPessoais[i].isEmpty())
				throw new DadosInvalidosException();
		}
	}
	
	public String validate () {
		try{
			checaExcecoes(matricula, email, senha);
		} catch (DadosInvalidosException e){
			return new DadosInvalidosException().getMessage();
		}
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dados))
			return false;
		Dados dados = (Dados) obj;
		
		return (matricula.equals(dados.getMatricula()) && senha.equals(dados.getSenha())) ||
				(email.equals(dados.getEmail()) && senha.equals(dados.getSenha()));
	}
	
	@Override
	public String toString() {
		return "Matricula: " + matricula + " Email: " + email + " ";
	}
	

}
