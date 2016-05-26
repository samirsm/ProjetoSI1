package models;

import play.mvc.Controller;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.*;

public enum TipoNotificacao {
	ACEITACAO(MensagensSistema.ACEITACAO),
	REJEICAO(MensagensSistema.REJEICAO),
	CANCELAMENTO(MensagensSistema.CANCELAMENTO),
	PEDIDO(MensagensSistema.PEDIDO),
	IDIOMA(MensagensSistema.IDIOMA);

	private String[] mensagemNotificacao;
	
	private TipoNotificacao (String[] mensagem){
		mensagemNotificacao = mensagem;
	}
	
	public String getMessage(){
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
		return mensagemNotificacao[idioma.ordinal()];
	}
	
	
}
