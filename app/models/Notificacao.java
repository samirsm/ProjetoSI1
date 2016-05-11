package models;
 
import javax.persistence.*;

import com.avaje.ebean.Model;
import tratamentoStrings.Strings;
import models.Carona;

@Entity(name = "notificacao")
public class Notificacao extends Model{


    @OneToOne
    private Usuario usuarioOrigem;

    @OneToOne
    private Carona carona;

    private String mensagem;

    @Enumerated(EnumType.ORDINAL)
    private TipoNotificacao tipo;

    private boolean status;
 
    @Id
    @GeneratedValue
    private Long id;

    public Notificacao(){};
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
        mensagem = usuarioOrigem.getNome() + tipo.getMessage() + Strings.LINE_SEPARATOR + "Detalhes da carona: " +
    carona.toString();
    }
 
    private void setId(){
        double idTemp = Integer.parseInt(usuarioOrigem.getDadosUsuario().getMatricula()) * Math.random() * 11;
        idTemp %= 1;
        idTemp *= 100000;
        id = (long) idTemp;
 
    }
}