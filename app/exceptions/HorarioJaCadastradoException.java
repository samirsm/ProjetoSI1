package exceptions;

import play.mvc.Controller;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

public class HorarioJaCadastradoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public HorarioJaCadastradoException(){
		super(setup());
	}
	
	public HorarioJaCadastradoException (String mensagem) {
		super(mensagem);
	}

	private static String setup(){
		Idioma idioma = Idioma.defineIdioma(Controller.session().get("idioma"));
		return MensagensSistema.HORARIO_JA_CADASTRADO[idioma.ordinal()];
	}
}
