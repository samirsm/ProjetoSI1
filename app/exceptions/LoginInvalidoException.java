package exceptions;

import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

import java.util.HashMap;

import play.mvc.Controller;

public class LoginInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public LoginInvalidoException(){
		super(setup());
	}

	public LoginInvalidoException (String mensagem) {
		super(mensagem);
	}

	private static String setup(){
		Idioma idioma = Idioma.defineIdioma(Controller.session().get("idioma"));
		return MensagensSistema.LOGIN_INVALIDO[idioma.ordinal()];
	}

}
