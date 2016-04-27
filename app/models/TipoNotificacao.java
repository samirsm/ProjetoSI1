package models;

public enum TipoNotificacao {
	ACEITACAO(" aceitou o seu pedido de carona."),
	REJEICAO(" não aceitou o seu pedido de carona."), 
	CANCELAMENTO(" cancelou uma carona na qual você estava cadastrado"), 
	PEDIDO(" solicita uma vaga na sua carona.");

	private String mensagemNotificacao;
	
	private TipoNotificacao (String mensagem){
		mensagemNotificacao = mensagem;
	}
	
	public String getMessage(){
		return mensagemNotificacao;
	}
}
