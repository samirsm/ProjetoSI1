package sistemas;

import java.util.List;

import models.Carona;
import models.Notificacao;
import models.TipoNotificacao;
import models.Usuario;

public class SistemaNotificacao {
	
	private static final SistemaNotificacao INSTANCIA = new SistemaNotificacao();

	private SistemaNotificacao() {}
	
	
	public static SistemaNotificacao getInstance() {
		return INSTANCIA;
	}
	
	
	public void geraNotificacaoRejeicao(Usuario passageiro, Carona carona) {
		notificaPassageiro(passageiro, carona, TipoNotificacao.REJEICAO);
	}	
	
	public void geraNotificacaoAceitacao(Usuario passageiro, Carona carona) {
		notificaPassageiro(passageiro, carona, TipoNotificacao.ACEITACAO);
		
	}

	public void geraNotificacaoCancelamento(Carona carona) {
		List<Usuario> passageiros= carona.getPassageiros();
		for (Usuario passageiro: passageiros){
			notificaPassageiro(passageiro, carona, TipoNotificacao.CANCELAMENTO);
		}
	}
	
	public void geraNotificacaoPedido(Carona carona, Usuario passageiro) {
		notificaMotorista(passageiro, carona, TipoNotificacao.PEDIDO);
	}
	
	private void notificaMotorista (Usuario passageiro, Carona carona, TipoNotificacao tipo){
		Notificacao notificacao = new Notificacao(passageiro, carona, tipo);
		carona.getMotorista().addNotificacaoMotorista(notificacao);

	}
	
	private void notificaPassageiro(Usuario passageiro, Carona carona, TipoNotificacao tipo) {
		Notificacao notificacao = new Notificacao(carona.getMotorista(), carona, tipo);
		passageiro.addNotificacaoPassageiro(notificacao); 
	}
}
