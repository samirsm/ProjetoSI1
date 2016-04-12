package models;

import javax.persistence.*;
import com.avaje.ebean.Model;

@Entity
public class Notificacao extends Model{
	
	private Usuario usuarioOrigem;
	private Carona carona;
	private String mensagem;
	private TipoNotificacao tipo;
	
	public Notificacao(Usuario usuarioOrigem, Carona carona, TipoNotificacao tipo){
		this.carona = carona;
		this.usuarioOrigem = usuarioOrigem;
		this.tipo = tipo;
		geraMensagem(tipo);
	}
	
	private void geraMensagem(TipoNotificacao tipo) {
		if (tipo == TipoNotificacao.ACEITACAO)
			gerarMensagemAceitacao();
		else if (tipo == TipoNotificacao.CANCELAMENTO)
			gerarMensagemCancelamento();
		else if (tipo == TipoNotificacao.PEDIDO)
			gerarMensagemPedido();
		else
			gerarMensagemRejeicao();
	}
	private void gerarMensagemPedido(){
		mensagem = usuarioOrigem.getNome() + " solicita uma vaga na carona " + carona.toString() + ".";
	}
	
	private void gerarMensagemAceitacao(){
		mensagem = usuarioOrigem.getNome() + " aceitou seu pedido de carona " + carona.toString() + ".";
	}
	
	private void gerarMensagemRejeicao(){
		mensagem = usuarioOrigem.getNome() + " rejeitou seu pedido de carona " + carona.toString() + ".";
	}
	
	private void gerarMensagemCancelamento(){
		mensagem = usuarioOrigem.getNome() + " cancelou a carona " + carona.toString() + ".";
	}
}