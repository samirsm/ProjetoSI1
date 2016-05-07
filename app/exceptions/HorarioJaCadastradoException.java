package exceptions;

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
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
		return MensagensSistema.HORARIO_JA_CADASTRADO[idioma.ordinal()];
	}
}
