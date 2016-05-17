package models;


import com.avaje.ebean.Model;

import javax.persistence.*;

@Entity
public class Horario extends Model {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String dia;
	@Column
	private int hora;

	public Horario(){}

	public Horario(String dia, int hora) {
		this.dia = dia;
		this.hora = hora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Dia: " + dia + " Hora: " + hora;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Horario))
			return false;
		Horario outroHorario = (Horario) obj;

		return outroHorario.getDia().equals(dia) && (outroHorario.getHora() == hora);
	}

}