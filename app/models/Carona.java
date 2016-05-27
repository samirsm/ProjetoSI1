package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.*;
import com.avaje.ebean.Model;
import sistemas.mensagens.Strings;

@Entity
public class Carona extends Model implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private int vagasDisponiveis;
	private Usuario usuario;
	private List<Usuario> passageiros;
	private List<Usuario> solicitantes;
	private Horario horario;
	private TipoCarona tipo;
	
	@Inject
	public Carona(){}
	public Carona(Usuario motorista, Horario horario, TipoCarona tipo, int numeroDeVagas) {
		this.usuario = motorista;
		this.horario = horario;
		this.tipo = tipo;
		this.vagasDisponiveis = numeroDeVagas;
		this.passageiros = new ArrayList<>();
		this.solicitantes = new ArrayList<>();
		id = (long) ((long) motorista.getDadosUsuario().getEmail().hashCode() * Math.random());
	}
	
	public boolean isFull() {
		return vagasDisponiveis <= 0;
	}
	
	public void adicionaPassageiro(Usuario passageiro){
		if (!hasPassageiro(passageiro) && !isFull()) {
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

	public void adicionaSolicitante(Usuario solicitante){
		solicitantes.add(solicitante);
	}

	public boolean hasSolicitante(Usuario solicitante){
		return solicitantes.contains(solicitante);
	}
	
	public Long getId() {
		return id;
	}
	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}
	public Usuario getMotorista() {
		return usuario;
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
		return usuario.getEndereco().getBairro();
	}
	
	@Override
	public boolean equals (Object objeto){
		if (!(objeto instanceof Carona))
			return false;
		Carona outraCarona = (Carona) objeto;
		
		return usuario.equals(outraCarona.getMotorista())
				&& tipo.equals(outraCarona.getTipo()) &&
				horario.equals(outraCarona.getHorario());
	}
	
	@Override
	public String toString() {
		return "Motorista: " + usuario + Strings.LINE_SEPARATOR
				+ " Horario: " + horario.toString();

	}
}