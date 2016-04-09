package models;

import java.io.File;

import com.avaje.ebean.Model;

public class Dados extends Model{
	private String nome;
	private String matricula;
	private String email;
	private String senha;
	private String numeroDeTelefone;
	private File foto;
	private Endereco endereco;
	
	public Dados(String matricula, String email, String senha){
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
	}
	
	public Dados () {
		this.foto = new File("");
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
	public File getFoto() {
		return foto;
	}
	public void setFoto(File foto) {
		this.foto = foto;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dados))
			return false;
		Dados dados = (Dados) obj;
		
		return (matricula.equals(dados.getMatricula()) && senha.equals(dados.getSenha())) ||
				(email.equals(dados.getEmail()) && senha.equals(dados.getSenha()));
	}
	

}
