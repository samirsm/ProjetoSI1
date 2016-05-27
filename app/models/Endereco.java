package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;
import sistemas.mensagens.*;
import sistemas.*;
import play.mvc.Controller;

@Entity
public class Endereco extends Model{

	@Id
	@GeneratedValue
	private long Id;
	@Column
	private String bairro;
	@Constraints.Required(message = "Insira uma rua válida.")
	@Column
	private String rua;

	public Endereco(String rua, String bairro){
		this.rua = rua;
		this.bairro = bairro;
	}
	public Endereco(){}

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

	@Override
	public String toString() {
		Idioma idioma =SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
		return MensagensSistema.RUA[idioma.ordinal()] + ": " + getRua() + " " + MensagensSistema.BAIRRO[idioma.ordinal()] + ": " + getBairro();
	}
}
