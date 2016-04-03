package models;

import javax.persistence.Entity;

@Entity
public class Endereco {
	private String bairro;
	private String rua;
	
	public Endereco (){
		this.bairro = bairro;
		this.rua = rua;
	}
}
