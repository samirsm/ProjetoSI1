package models;

import com.avaje.ebean.Model;
import sistemas.mensagens.Strings;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Solicitacao extends Model{

    private Usuario solicitante;
    private Carona carona;
    private String mensagem;
    private boolean status;
    private Notificacao notificacaoAssociada;

    @Id
    private Long id;

    public Solicitacao(Usuario solicitante, Carona carona){
        this.carona = carona;
        this.solicitante = solicitante;
        geraMensagem();
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
 
    public Usuario getSolicitante() {
        return solicitante;
    }
 
    public Carona getCarona() {
        return carona;
    }

    private void setId(){
        double idTemp = Integer.parseInt(solicitante.getDadosUsuario().getMatricula()) * Math.random() * 11;
        idTemp %= 1;
        idTemp *= 100000;
        id = (long) idTemp;
 
    }

    public Notificacao getNotificacaoAssociada() {
        return notificacaoAssociada;
    }

    public void setNotificacaoAssociada(Notificacao notificacaoAssociada) {
        this.notificacaoAssociada = notificacaoAssociada;
    }

    private void geraMensagem() {
        mensagem = solicitante.getNome() + TipoNotificacao.PEDIDO.getMessage() + Strings.LINE_SEPARATOR;
    }

    public String getMensagem() {
        return mensagem;
    }

}