package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Carro extends Model{
	private final String MODELO;
	private String placa;
	private final int VAGAS;
	
	public Carro(String modelo, String placa, int vagas){
		this.MODELO = modelo;
		this.placa = placa;
		this.VAGAS = vagas;	
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMODELO() {
		return MODELO;
	}

	public int getVAGAS() {
		return VAGAS;
	}


}
