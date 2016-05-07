package models;

import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.*;

import java.util.HashMap;
import java.util.Map;

public enum TipoNotificacao {
	
	ACEITACAO(MensagensSistema.ACEITACAO),
	REJEICAO(MensagensSistema.REJEICAO),
	CANCELAMENTO(MensagensSistema.CANCELAMENTO),
	PEDIDO(MensagensSistema.PEDIDO);

	private String[] mensagemNotificacao;
	
	private TipoNotificacao (String[] mensagem){
		mensagemNotificacao = mensagem;
	}
	
	public String getMessage(){
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
		return mensagemNotificacao[idioma.ordinal()];
	}
	
	
}
