package models;

import com.avaje.ebean.Model;
import sistemas.mensagens.Strings;

import javax.inject.Inject;
import javax.persistence.*;

@Entity
public class Solicitacao extends Model{
    @Id
    @Column
    private Long id;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Carona carona;
    @Column
    private String mensagem;
    @Column
    private boolean status;
    @OneToOne(cascade = CascadeType.ALL)
    private Notificacao notificacaoAssociada;

    @Inject
    public Solicitacao(){}
    public Solicitacao(Usuario usuario, Carona carona){
        this.carona = carona;
        this.usuario = usuario;

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
        return usuario;
    }
 
    public Carona getCarona() {
        return carona;
    }

    private void setId(){
        double idTemp = Integer.parseInt(usuario.getDadosUsuario().getMatricula()) * Math.random() * 11;
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
        mensagem = usuario.getNome() + TipoNotificacao.PEDIDO.getMessage() + Strings.LINE_SEPARATOR;
    }

    public String getMensagem() {
        return mensagem;
    }

}