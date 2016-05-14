package models;

import javax.persistence.*;

import play.data.validation.Constraints;

@Entity
public class Endereco {

	@Id
	@GeneratedValue
	private long Id;

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
