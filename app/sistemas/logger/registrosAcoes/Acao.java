package sistemas.logger.registrosAcoes;

public enum Acao {
	CADASTROU_CARONA("O usuário adicionou uma carona ao sistema: "), 
	USUARIO_CADASTRADO("Um novo usuário se cadastrou no sistema: "), 
	EFETUA_BUSCA_POR_CARONAS("O usuário efetuou uma busca por todas as caronas disponíveis."),
	EFETUA_LOGIN("O usuário efetuou login: "),
	EFETUA_LOGOUT("O usuário efetuou logout: "),
	AUTENTICA_USUARIO("O usuário está sendo autenticado pelo sistema: "),
	VERIFICA_PRIMEIRO_ACESSO("O sistema está verificando o primeiro acesso do usuário: "),
	CADASTROU_HORARIOS("O usuário cadastrou seus horários de ida/volta: "),
	CADASTROU_NOVO_ENDERECO("O usuário cadastrou um novo endereco alternativo"),
	EXIBE_DETALHES("O usuário exibiu os detalhes da carona: "),
	CONFIRMA_CARONA("O usuário agendou uma carona: "),
	ADICIONOU_HORARIO("O usuário adicionou um horário à lista de horários: "),
	ACEITOU_PEDIDO_CARONA("O usuário aceitou o pedido de carona [From/To]: "),
	RECUSOU_PEDIDO_CARONA("O usuário recusou o pedido de carona [From/To]: "),
	CANCELOU_CARONA("O usuário cancelou a carona: "),
	GERA_NOTIFICACAO("O sistema gerou uma notificação[From/To]: "),
	SOLICITA_CARONA("O usuário pediu uma carona[From/To]: "),
	ERRO("O sistema registrou um erro: "),
	INFO("INFO: ");
	
	
	
	private final String mensagemAcao;
	
	private Acao (String mensagemAcao){
		this.mensagemAcao = mensagemAcao;
	}
	
	public String getMensagemAcao(){
		return mensagemAcao;
	}
	
}
