package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class Carona extends Model {
	@Id
	private String id;
	
	private int vagasDisponiveis;
	private Usuario motorista;
	private List<Usuario> Passageiros;
	private Horario horario;
	private TipoCarona tipo;

	public Carona(Usuario motorista, Horario horario, TipoCarona tipo, int numeroDeVagas) {
		this.motorista = motorista;
		this.horario = horario;
		this.vagasDisponiveis = numeroDeVagas;
		this.Passageiros = new ArrayList<>();
	}
	
	public boolean isFull() {
		return vagasDisponiveis == 0;
	}
	
	public void adicionaPassageiro(Usuario passageiro) {
		vagasDisponiveis--;
		Passageiros.add(passageiro);
	}
	
	public boolean removePassageiro(Usuario passageiro) {
		vagasDisponiveis++;
		return Passageiros.remove(passageiro);
	}
	
	public String getId() {
		return id;
	}
	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}
	public Usuario getMotorista() {
		return motorista;
	}
	public List<Usuario> getPassageiros() {
		return Passageiros;
	}
	public Horario getHorario() {
		return horario;
	}
	public TipoCarona getTipo() {
		return tipo;
	}

	

}
