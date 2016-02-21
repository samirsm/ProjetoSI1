package classes;

import tiposUsuarios.TipoUsuario;

public class Usuario {
	private String nome;
	private String matricula;
	private String numeroDeTelefone;
	private String email;
	private String foto;
	private int numeroVagas;
	private TipoUsuario tipo;

	public Usuario(String nome, String matricula, String numeroDeTelefone,
			String email, String foto, int numeroVagas, TipoUsuario tipo) {
		this.nome = nome;
		this.matricula = matricula;
		this.numeroDeTelefone = numeroDeTelefone;
		this.email = email;
		this.foto = foto;
		this.numeroVagas = numeroVagas;
	}

	public Usuario(String nome, String matricula, String numeroDeTelefone,
			String email, String foto, TipoUsuario tipo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.numeroDeTelefone = numeroDeTelefone;
		this.email = email;
		this.foto = foto;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	// Vai receber uns parâmetros que irão definir o que esta acontecendo
	
//	public boolean pedeRecebeCarona(){
//		return tipo.oferecePedeCarona();
//	}
	
}
