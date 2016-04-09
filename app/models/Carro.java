package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

@Entity
public class Carro extends Model {
	private String placaCarro;
	private int numeroVagas;

}
