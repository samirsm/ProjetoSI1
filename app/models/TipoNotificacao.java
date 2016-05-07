package models;

public enum TipoNotificacao {
	ACEITACAO(MensagensSistema.ACEITOU_CARONA_MENSAGEM_PT, MensagensSistema.ACEITOU_CARONA_MENSAGEM_EN),
	REJEICAO(" não aceitou o seu pedido de carona."), 
	CANCELAMENTO(" cancelou uma carona na qual você estava cadastrado"), 
	PEDIDO(" solicita uma vaga na sua carona.");

	private String[] mensagemNotificacao;
	
	private TipoNotificacao (String... mensagem){
		mensagemNotificacao = mensagem;
	}
	
	public String getMessage(Idioma id){
		return mensagemNotificacao[id.ordinal()];
	}
	
	
}
