package models;

import javax.persistence.*;
import com.avaje.ebean.Model;
import exceptions.BairroJaCadastradoException;
import exceptions.DadosInvalidosException;
import exceptions.HorarioJaCadastradoException;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.mensagens.Idioma;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Model {
	@Id
	@GeneratedValue
	private Long id;
	@Embedded
	private Dados dadosPessoais;
	@OneToOne
	private Endereco enderecoAlternativo;
	@OneToOne
	private Endereco endereco;
	@Column
	private Integer numeroVagas;
	@OneToMany
	private List<Carona> caronas = new ArrayList<Carona>();
	@OneToMany
	private List<Carona> caronasPendentes = new ArrayList<>();
	@Enumerated(EnumType.STRING)
	private Idioma idioma = Idioma.PORTUGUES;
	@OneToMany
	private List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
	@OneToMany
	private List<Notificacao> notificacoesLidas = new ArrayList<Notificacao>();
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Notificacao> notificacoesNaoLidas = new ArrayList<Notificacao>();
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Horario> horariosIda = new ArrayList<>();
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Horario> horariosVolta = new ArrayList<>();
	@Column
	private boolean horariosCadastrados;

	public static Finder<Long, Usuario> find = new Finder<>(Usuario.class);

	public Usuario(){}
	public Usuario(Dados dados, Endereco endereco, Integer numeroVagas) throws DadosInvalidosException {
		if(endereco == null)
			throw new DadosInvalidosException("O endereco enviado eh invalido.");
		if(numeroVagas == null)
			throw new DadosInvalidosException("O numero de vagas enviado eh invalido.");
		this.numeroVagas = numeroVagas;
		this.dadosPessoais = dados;
		this.setEndereco(endereco);
		this.setEnderecoAlternativo(endereco);
		this.notificacoesNaoLidas = new ArrayList<>();
		//setId();
	}

	public Long getId() {
		return id;
	}

	public String getEnderecoPerfil(){
		return "perfil?id=" + this.getId();
	}

	public static Usuario authenticate(String matricula, String email, String password) {
		Usuario usuario = find.where().eq("email", email).findUnique();
		if (usuario == null) {
			usuario = find.where().eq("matricula", matricula).findUnique();
			if (usuario == null){
				 return null;
			}
		}
		if (password.equals(usuario.getDadosUsuario().getSenha())) {
			return usuario;
		} else {
			return null;
		}
	}

	///// Notificações/////
	public boolean recebeNotificacao(Notificacao notificacao) {
		return notificacoesNaoLidas.add(notificacao);
	}

	public void leNotificacao(Notificacao naoLida) {
		naoLida.setStatus(true);
		notificacoesLidas.add(naoLida);
		notificacoesNaoLidas.remove(naoLida);
	}

	public List<Notificacao> getNotificacoesLidas() {
		return notificacoesLidas;
	}

	public List<Notificacao> getNotificacoesNaoLidas() {
		return notificacoesNaoLidas;
	}

	public void leTodasNotificacoes(){

		notificacoesNaoLidas = new ArrayList<Notificacao>();
	}


	///// Solicitações/////

	public boolean recebeSolicitacao(Solicitacao solicitacao){
		return solicitacoes.add(solicitacao);
	}

	public void removeSolicitacao(Solicitacao solicitacao) {
		solicitacoes.remove(solicitacao);
	}

	public List<Solicitacao> getSolicitacoes() {
		return this.solicitacoes;
	}

	///// FIM Notificacoes /////



	///// caronas ///

	public List<Carona> getCaronas() {
		return caronas;
	}

	public void adicionaCarona(Carona carona) {
		caronas.add(carona);
	}

	private boolean isPossivelDarCarona(Carona carona) {
		return numeroVagas >= carona.getVagasDisponiveis();
	}

	public List<Carona> getCaronasPendentes() {
		return caronasPendentes;
	}

	public boolean adicionaCaronaPendente(Carona carona){
		return caronasPendentes.add(carona);
	}

	public boolean removeCaronaPendente(Carona carona){
		return caronasPendentes.remove(carona);
	}

	///// FIM caronas //////



	///// GETS e SETS de infos /////

	public String getNome() {
		return dadosPessoais.getNome();
	}

	public Dados getDadosUsuario() {
		return dadosPessoais;
	}

	public void setNome(String nome) {
		dadosPessoais.setNome(nome);
	}

	public String getNumeroDeTelefone() {
		return dadosPessoais.getNumeroDeTelefone();
	}

	public void setNumeroDeTelefone(String numeroDeTelefone) {
		dadosPessoais.setNumeroDeTelefone(numeroDeTelefone);
	}

	public String getEmail() {
		return dadosPessoais.getEmail();
	}

	public void setEmail(String email) {
		dadosPessoais.setEmail(email);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEnderecoAlternativo() {
		return enderecoAlternativo;
	}

	public void setEnderecoAlternativo(Endereco endereco) {
		this.enderecoAlternativo = endereco;
	}

	public void addEnderecoAlternativo(Endereco enderecoNovo) throws BairroJaCadastradoException {
		if (enderecoNovo.getBairro().equals(endereco.getBairro())) {
			throw new BairroJaCadastradoException();
		} else
			setEnderecoAlternativo(enderecoNovo);


	}

	public Integer getNumeroVagas() {
		return numeroVagas;
	}

	///// FIM GETS e SETS de infos /////




	/////  Horarios /////

	public List<Horario> getHorariosIda() {
		return horariosIda;
	}

	public List<Horario> getHorariosVolta() {
		return horariosVolta;
	}

	public boolean isHorariosCadastrados() {
		return horariosCadastrados;
	}

	public void cadastrouHorarios() {
		setHorariosCadastrados(true);
	}

	private void setHorariosCadastrados(boolean cadastrouHorarios) {
		horariosCadastrados = cadastrouHorarios;
	}

	public boolean adicionarHorarioIda(String dia, int hora) throws HorarioJaCadastradoException {
		Horario novoHorario = new Horario(dia, hora);
		if (isHorarioLivre(novoHorario))
			return horariosIda.add(novoHorario);
		return false;

	}

	public boolean removeHorarioVolta(String dia, int hora){
		Horario horario = new Horario(dia,hora);
		return removeHorarioVolta(horario);
	}

	public boolean removeHorarioVolta(Horario horario){
		if(horariosVolta.contains(horario)){
			return horariosVolta.remove(horario);
		} else{
			return false;
		}
	}

	public boolean removeHorarioIda(String dia, int hora){
		Horario horario = new Horario(dia,hora);
		return removeHorarioIda(horario);
	}

	public boolean removeHorarioIda(Horario horario){
		if(horariosIda.contains(horario)){
			return horariosIda.remove(horario);
		} else{
			return false;
		}
	}

	public boolean adicionarHorarioIda(Horario horario) throws HorarioJaCadastradoException{
		if(isHorarioLivre(horario))
			return horariosIda.add(horario);
		return false;
	}

	public boolean adicionarHorarioVolta(String dia, int hora) throws HorarioJaCadastradoException {
		Horario novoHorario = new Horario(dia, hora);
		if (isHorarioLivre(novoHorario))
			return horariosIda.add(novoHorario);
		return false;
	}

	public boolean adicionarHorarioVolta(Horario horario) throws HorarioJaCadastradoException {
		if (isHorarioLivre(horario))
			return horariosVolta.add(horario);
		return false;
	}

	private boolean isHorarioLivre(Horario novoHorario) throws HorarioJaCadastradoException {
		for (Horario horario : horariosIda) {
			if (horario.equals(novoHorario))
				throw new HorarioJaCadastradoException();
		}
		for (Horario horario : horariosVolta) {
			if (horario.equals(novoHorario))
				throw new HorarioJaCadastradoException();
		}
		return true;
	}

	/// FIM Horarios /////



	///// Idioma /////

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma id){
		idioma = id;
	}

	/// FIM Idioma /////



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;

		Usuario outroUsuario = (Usuario) obj;

		return outroUsuario.getDadosUsuario().equals(dadosPessoais);

	}

	public String toString() {
		return getNome() + "[" + dadosPessoais.toString() + "]";
	}


}