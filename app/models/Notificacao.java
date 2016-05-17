package models;
 
import javax.persistence.*;

import com.avaje.ebean.Model;
import tratamentoStrings.Strings;

@Entity(name = "notificacao")
public class Notificacao extends Model{

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private Carona carona;

    @Column
    private String mensagem;

    @Enumerated(EnumType.ORDINAL)
    private TipoNotificacao tipo;

    @Column
    private boolean status;

    public Notificacao(){};
    public Notificacao(Usuario usuarioOrigem, Carona carona, TipoNotificacao tipo){
        this.carona = carona;
        this.usuario = usuarioOrigem;
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
 
    public Usuario getUsuario() {
        return usuario;
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
        mensagem = usuario.getNome() + tipo.getMessage() + Strings.LINE_SEPARATOR + "Detalhes da carona: " +
    carona.toString();
    }
 
    private void setId(){
        double idTemp = Integer.parseInt(usuario.getDadosUsuario().getMatricula()) * Math.random() * 11;
        idTemp %= 1;
        idTemp *= 100000;
        id = (long) idTemp;
 
    }
}