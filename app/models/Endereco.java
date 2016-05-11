package models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import play.data.validation.Constraints;

@Embeddable
public class Endereco {

	@Column
	private String bairro;

	@Column
	private String rua;
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}

	public Endereco(){}

	public Endereco(String rua, String bairro){
		this.rua = rua;
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return "Rua: " + getRua() + " Bairro: "+ getBairro() + " ";
	}
}
