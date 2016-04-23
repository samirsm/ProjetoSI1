package models;
 
import javax.persistence.*;
import com.avaje.ebean.Model;
import scala.annotation.meta.getter;
 
@Entity
public class Notificacao extends Model{
   
    private Usuario usuarioOrigem;
    private Carona carona;
    private String mensagem;
    private TipoNotificacao tipo;
    private boolean status;
 
    @Id
    private Long id;
 
    public Notificacao(Usuario usuarioOrigem, Carona carona, TipoNotificacao tipo){
        this.carona = carona;
        this.usuarioOrigem = usuarioOrigem;
        this.tipo = tipo;
        geraMensagem(tipo);
        this.status = false;
        setId();
    }
 
    public void setStatus(boolean status) {
        this.status = status;
    }
 
    public boolean getStatus(){
        return status;
    }
    public Long getId() {
        return id;
    }
 
    public Usuario getUsuarioOrigem() {
        return usuarioOrigem;
    }
 
    public String getMensagem() {
        return mensagem;
    }
 
    public Carona getCarona() {
        return carona;
    }
 
    public TipoNotificacao getTipo() {
        return tipo;
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
        mensagem = usuarioOrigem.getNome() + " solicita uma vaga na sua carona.";
    }
   
    private void gerarMensagemAceitacao(){
        mensagem = usuarioOrigem.getNome() + " aceitou o seu pedido de carona.";
    }
   
    private void gerarMensagemRejeicao(){
        mensagem = usuarioOrigem.getNome() + " não aceitou p seu pedido de carona.";
    }
   
    private void gerarMensagemCancelamento(){
        mensagem = usuarioOrigem.getNome() + " cancelou uma carona na qual você estava cadastrado";
    }
 
    private void setId(){
        double idTemp = Integer.parseInt(usuarioOrigem.getDadosUsuario().getMatricula()) * Math.random() * 11;
        idTemp %= 1;
        idTemp *= 100000;
        id = (long) idTemp;
 
    }
}