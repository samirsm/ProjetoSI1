package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

import exceptions.BairroJaCadastradoException;
import exceptions.HorarioJaCadastradoException;
import exceptions.NumeroDeVagasExcedenteException;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Model {

	private Dados dadosPessoais;
	private Endereco enderecoAlternativo;
	private Endereco endereco;
	private final Integer numeroVagas;
	private List<Notificacao> notificacoesLidas = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesNaoLidas = new ArrayList<Notificacao>();
	private List<Notificacao> solicitacoesDeCarona = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesPassageiro = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesMotorista = new ArrayList<Notificacao>();
	private List<Carona> caronasPassageiro = new ArrayList<>();
	private List<Carona> caronasMotorista = new ArrayList<>();
	private List<Horario> horariosIda = new ArrayList<>();
	private List<Horario> horariosVolta = new ArrayList<>();
	private boolean horariosCadastrados;
	private String idioma = "pt";

	@Id
	private Long id;

	public Usuario(Dados dados, Endereco endereco, Integer numeroVagas) {
		this.numeroVagas = numeroVagas;
		this.dadosPessoais = dados;
		this.setEndereco(endereco);
		this.setEnderecoAlternativo(endereco);
	}

	public boolean notifica(Notificacao notificacao) {
		return notificacoesNaoLidas.add(notificacao);
	}

	public boolean recebeSolicitacao(Notificacao notificacao) {
		return solicitacoesDeCarona.add(notificacao);
	}

	public boolean removeSolicitacao(Notificacao notificacao) {
		return solicitacoesDeCarona.remove(notificacao);
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

	public List<Notificacao> getSolicitacoesDeCarona() {
		return solicitacoesDeCarona;
	}

	public boolean addNotificacaoPassageiro(Notificacao notificacao) {
		return notificacoesPassageiro.add(notificacao);
	}

	public boolean addNotificacaoMotorista(Notificacao notificacao) {
		return notificacoesMotorista.add(notificacao);
	}

	public List<Notificacao> getNotificacaoMotorista() {
		return notificacoesMotorista;
	}

	public List<Notificacao> getNotificacaoPassageiro() {
		return notificacoesPassageiro;
	}

	public List<Horario> getHorariosIda() {
		return horariosIda;
	}

	public List<Horario> getHorariosVolta() {
		return horariosVolta;
	}

	public String getNome() {
		return dadosPessoais.getNome();
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

	public List<Carona> getCaronasPassageiro() {
		return caronasPassageiro;
	}

	public List<Carona> getCaronasMotorista() {
		return caronasMotorista;
	}

	public void adicionaCaronaPassageiro(Carona carona) {
		caronasPassageiro.add(carona);
	}

	public void adicionaCaronaMotorista(Carona carona) throws NumeroDeVagasExcedenteException {
		verificacaoVagasDisponiveis(carona);
		caronasMotorista.add(carona);
	}

	private void verificacaoVagasDisponiveis(Carona carona) throws NumeroDeVagasExcedenteException {
		if (!isPossivelDarCarona(carona))
			throw new NumeroDeVagasExcedenteException();
	}

	private boolean isPossivelDarCarona(Carona carona) {
		return numeroVagas >= carona.getVagasDisponiveis();
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

	public Dados getDadosUsuario() {
		return dadosPessoais;
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

	public Integer getNumeroVagas() {
		return numeroVagas;
	}

	public boolean adicionarHorarioIda(String dia, int hora) throws HorarioJaCadastradoException {
		Horario novoHorario = new Horario(dia, hora);
		if (isHorarioLivre(novoHorario))
			return horariosIda.add(novoHorario);
		return false;

	}

	public boolean adicionarHorarioVolta(String dia, int hora) throws HorarioJaCadastradoException {
		Horario novoHorario = new Horario(dia, hora);
		if (isHorarioLivre(novoHorario))
			return horariosIda.add(novoHorario);
		return false;
	}

	public boolean adicionarHorarioIda(Horario horario) throws HorarioJaCadastradoException {
		if (isHorarioLivre(horario))
			return horariosIda.add(horario);
		return false;
	}

	public boolean adicionarHorarioVolta(Horario horario) throws HorarioJaCadastradoException {
		if (isHorarioLivre(horario))
			return horariosVolta.add(horario);
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;

		Usuario outroUsuario = (Usuario) obj;

		return outroUsuario.getDadosUsuario().equals(dadosPessoais);

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

	public String toString() {
		return getNome() + "[" + dadosPessoais.toString() + "]";
	}

	public void addEnderecoAlternativo(Endereco enderecoNovo) throws BairroJaCadastradoException {
		if (enderecoNovo.getBairro().equals(endereco.getBairro())) {
			throw new BairroJaCadastradoException();
		} else
			setEnderecoAlternativo(enderecoNovo);


	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idi){
		idioma = idi;
	}
}