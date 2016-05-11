package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

import exceptions.BairroJaCadastradoException;
import exceptions.HorarioJaCadastradoException;
import sistemas.mensagens.Idioma;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Model {

	private Dados dadosPessoais;
	private Endereco enderecoAlternativo;
	private Endereco endereco;
	private final Integer numeroVagas;
    private List<Carona> caronas = new ArrayList<>();

	private List<Carona> caronasPendentes = new ArrayList<>();
    private Idioma idioma = Idioma.PORTUGUES;

	private List<Notificacao> solicitacoes = new ArrayList<Notificacao>();

    private List<Notificacao> notificacoesLidas = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesNaoLidas = new ArrayList<Notificacao>();

	private List<Horario> horariosIda = new ArrayList<>();
	private List<Horario> horariosVolta = new ArrayList<>();
	private boolean horariosCadastrados;


	@Id
	private Long id;

	public Usuario(Dados dados, Endereco endereco, Integer numeroVagas) {
		this.numeroVagas = numeroVagas;
		this.dadosPessoais = dados;
		this.setEndereco(endereco);
		this.setEnderecoAlternativo(endereco);
		setId();
	}

	public Long getId() {
		return id;
	}
	private void setId(){
		double idTemp = Integer.parseInt(dadosPessoais.getMatricula()) * Math.random() * 13;
		idTemp %= 1;
		idTemp *= 100000;
		id = (long) idTemp;
	}
	public String getEnderecoPerfil(){
		return "perfil?id=" + this.getId();
	}


	///// Notificações /////
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

	public boolean recebeSolicitacao(Notificacao solicitacao){
		return solicitacoes.add(solicitacao);
	}

	public void removeSolicitacao(Notificacao solicitacao) {
		solicitacoes.remove(solicitacao);
	}

	public List<Notificacao> getSolicitacoes() {
		List<Notificacao> soli = new ArrayList<>();
		for(int i = 0; i< notificacoesNaoLidas.size(); i++){
			if(notificacoesNaoLidas.get(i).getTipo() == TipoNotificacao.PEDIDO)
				soli.add(notificacoesNaoLidas.get(i));
		}
		return soli;
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