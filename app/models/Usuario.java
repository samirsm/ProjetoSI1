package models;

import javax.inject.Inject;
import javax.persistence.*;


import com.avaje.ebean.Model;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import exceptions.BairroJaCadastradoException;
import exceptions.DadosInvalidosException;
import exceptions.HorarioJaCadastradoException;
import sistemas.mensagens.Idioma;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Dados dadosPessoais;
	private Endereco enderecoAlternativo;
	private Endereco endereco;
	private Integer numeroVagas;
	private Integer imagemPerfil = 4;
	private Idioma idioma = Idioma.PORTUGUES;
	private List<Carona> caronas = new ArrayList<Carona>();
	private List<Carona> caronasPendentes = new ArrayList<Carona>();
	private List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();
	private List<Notificacao> notificacoesLidas = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesNaoLidas = new ArrayList<Notificacao>();
	private List<Horario> horarios = new ArrayList<Horario>();
	private boolean horariosCadastrados;
	
	@Inject
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
		id = (long) dados.getMatricula().hashCode();
	}

	public Long getId() {
		return id;
	}

	public String getEnderecoPerfil(){
		return "perfil?id=" + this.getId();
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
	
	public String getPrimeiroNome(){
	  String [] nome = this.getNome().split(" ");
	  return nome[0];
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

	public String getEnderecoImagemPerfil(){
		return "assets/SBAdminTemplate/img/userDefault" + imagemPerfil +".png";
	}
	
	public void setImagemPerfil(Integer n){
      if(n > 6 || n < 1) 
        imagemPerfil = 4;
      imagemPerfil = n;
      
    }
	
	
	///// FIM GETS e SETS de infos /////



	/////  Horarios /////

	public List<Horario> getHorarios() {
		return horarios;
	}

	public List<Horario> getHorariosIda() {
		List<Horario> ida = new ArrayList<>();
		for (Horario h: horarios)
			if (h.getTipo() == TipoCarona.IDA)
				ida.add(h);
		return ida;
	}

	public List<Horario> getHorariosVolta() {
		List<Horario> volta = new ArrayList<>();
		for (Horario h: horarios)
			if (h.getTipo() == TipoCarona.VOLTA)
				volta.add(h);
		return volta;
	}

	public boolean adicionarHorario(Horario novoHorario){
		return horarios.add(novoHorario);
	}

	public boolean adicionarHorario(String dia, int hora, TipoCarona tipo) throws HorarioJaCadastradoException{
		Horario novoHorario = new Horario(dia, hora, tipo);
		if (isHorarioLivre(novoHorario)){
			return adicionarHorario(novoHorario);
		}
		return false;
	}

	public boolean removeHorario(String dia, int hora, TipoCarona tipo){
		Horario horario = new Horario(dia, hora, tipo);
		return removeHorario(horario);
	}

	public boolean removeHorario(Horario horario){
		for (Horario h: horarios) {
			if (h.equals(horario)) {
				return horarios.remove(h);
			}
		}
		return false;
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
	private boolean isHorarioLivre(Horario novoHorario) throws HorarioJaCadastradoException {
		for (Horario horario : horarios) {
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
	
	public void setIdioma(String id){
		switch (id) {
		case "pt":
			setIdioma(Idioma.PORTUGUES);
			break;
		case "es":
			setIdioma(Idioma.ESPANOL);
			break;
		case "en":
			setIdioma(Idioma.ENGLISH);
			break;
		case "it":
			setIdioma(Idioma.ITALIANO);
			break;
		default:
			break;
		}
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
