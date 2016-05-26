package exceptions;

import sistemas.SistemaUsuarioLogin;
		import sistemas.mensagens.Idioma;
		import sistemas.mensagens.MensagensSistema;

		import java.util.HashMap;

import play.mvc.Controller;

public class DadosInvalidosException extends Exception{

	private static final long serialVersionUID = 1L;

	public DadosInvalidosException(){
		super(setup());
	}

	public DadosInvalidosException (String mensagem) {
		super(mensagem);
	}

	private static String setup(){
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
		return MensagensSistema.DADOS_INVALIDOS[idioma.ordinal()];
	}
}
