package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

import exceptions.NumeroDeVagasInsuficienteException;

@Entity
public class Carona extends Model {
	
	@Id
	private Long id;
	
	private int vagasDisponiveis;
	private Usuario motorista;
	private List<Usuario> passageiros;
	private Horario horario;
	private TipoCarona tipo;

	public Carona(Usuario motorista, Horario horario, TipoCarona tipo, int numeroDeVagas) {
		this.motorista = motorista;
		this.horario = horario;
		this.tipo = tipo;
		this.vagasDisponiveis = numeroDeVagas;
		this.passageiros = new ArrayList<>();
		setId();
	}
	
	public boolean isFull() {
		return vagasDisponiveis <= 0;
	}
	
	public void adicionaPassageiro(Usuario passageiro) throws NumeroDeVagasInsuficienteException {
		if (isFull()) {
			throw new NumeroDeVagasInsuficienteException();
		}
		
		if (!hasPassageiro(passageiro)) {
			vagasDisponiveis--;
			passageiros.add(passageiro);
		}
	}
	
	public boolean removePassageiro(Usuario passageiro) {
		vagasDisponiveis++;
		return passageiros.remove(passageiro);
	}
	
	public boolean hasPassageiro(Usuario passageiro){
		return passageiros.contains(passageiro);
	}
	
	public Long getId() {
		return id;
	}
	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}
	public Usuario getMotorista() {
		return motorista;
	}
	public List<Usuario> getPassageiros() {
		return passageiros;
	}
	public Horario getHorario() {
		return horario;
	}
	public TipoCarona getTipo() {
		return tipo;
	}
	
	public String getBairro () {
		return motorista.getEndereco().getBairro();
	}
	
	@Override
	public boolean equals (Object objeto){
		if (!(objeto instanceof Carona))
			return false;
		Carona outraCarona = (Carona) objeto;
		
		return motorista.equals(outraCarona.getMotorista())
				&& tipo.equals(outraCarona.getTipo()) &&
				horario.equals(outraCarona.getHorario());
	}

	private void setId(){
		double idTemp = Integer.parseInt(motorista.getDadosUsuario().getMatricula()) * Math.random() * 11;
		idTemp %= 1;
		idTemp *= 100000;
		id = (long) idTemp;
		
	}

}
