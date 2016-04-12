package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends Model {
	private Dados dadosPessoais;
	private Carro carro;
	private List<Notificacao> notificacoesPassageiro = new ArrayList<Notificacao>();
	private List<Notificacao> notificacoesMotorista = new ArrayList<Notificacao>();
	private List<Carona> caronasPassageiro = new ArrayList<>();
	private List<Carona> caronasMotorista = new ArrayList<>();
	private boolean horariosCadastrados;

	@Id
	private Long id;

	public Usuario(Dados dados, Carro carro) {
		this.dadosPessoais = dados;
		this.carro = carro;
		this.id = id;
	}
	
	public boolean addNotificacaoPassageiro(Notificacao notificacao){
		return notificacoesPassageiro.add(notificacao);
	}
	
	public boolean addNotificacaoMotorista(Notificacao notificacao){
		return notificacoesMotorista.add(notificacao);
	}
	
	public boolean hasCar() {
		return carro != null;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return carro;
	}
	
	public List<Notificacao> getNotificacaoMotorista() {
		return notificacoesMotorista;
	}
	
	public List<Notificacao> getNotificacaoPassageiro() {
		return notificacoesPassageiro;
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

	public void setFoto(File foto) {
		dadosPessoais.setFoto(foto);
	}

	public List<Carona> getCaronasPassageiro() {
		return caronasPassageiro;
	}

	public List<Carona> getCaronasMotorista() {
		return caronasMotorista;
	}
	
	public void addCaronaPassageiro(Carona carona){
		caronasPassageiro.add(carona);
	}
	
	public void addCaronaMotorista(Carona carona) {
		caronasMotorista.add(carona);
	}
	
	public boolean isHorariosCadastrados() {
		return horariosCadastrados;
	}
	
	public File getFoto() {
		return dadosPessoais.getFoto();
	}
	
	public void cadastrouHorarios(){
		setHorariosCadastrados(true);
	}
	
	private void setHorariosCadastrados(boolean cadastrouHorarios){
		horariosCadastrados = cadastrouHorarios;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;
		
		Usuario outroUsuario = (Usuario) obj;
		
		return outroUsuario.equals(dadosPessoais);

	}

	public Dados getDadosUsuario() {
		return dadosPessoais;
	}

}
