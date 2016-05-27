package models;
 
import java.io.Serializable;

import javax.persistence.*;
import com.avaje.ebean.Model;
import exceptions.DadosInvalidosException;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Strings;
import play.mvc.Controller;

@Entity
public class Notificacao extends Model implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

    public Notificacao(){}

    public Notificacao(Usuario usuario, Carona carona, TipoNotificacao tipo){
        this.carona = carona;
        this.usuario = usuario;
        this.tipo = tipo;
        geraMensagem(tipo);
        this.status = false;
        setId();
    }

    public Notificacao(Usuario usuarioOrigem, TipoNotificacao tipo){
        this.usuario = usuarioOrigem;
        this.tipo = tipo;
        geraMensagem(tipo);
        this.status = false;
        setId();
    }


    public Notificacao(String texto){ //Notificação genérica
        this.usuario = SistemaUsuarioLogin.getInstance().getUsuarioLogado(Controller.session().get("login"));
        this.tipo = TipoNotificacao.AVISO;
        mensagem = texto;
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
        return usuario;
    }
 
    public Carona getCarona() {
        return carona;
    }
 
    public TipoNotificacao getTipo() {
        return tipo;
    }
 
    private void geraMensagem(TipoNotificacao tipo) {
        if(tipo == TipoNotificacao.IDIOMA || tipo == TipoNotificacao.BOASVINDAS || tipo == TipoNotificacao.AVISO)
            mensagem = tipo.getMessage() + Strings.LINE_SEPARATOR;
        else
            mensagem = usuario.getNome() + tipo.getMessage() + Strings.LINE_SEPARATOR;
    }

    public String getMensagem() {
        return mensagem;
    }

    private void setId(){
        double idTemp = Integer.parseInt(usuario.getDadosUsuario().getMatricula()) * Math.random() * 11;
        idTemp %= 1;
        idTemp *= 100000;
        id = (long) idTemp;
 
    }

    public String getReferencia(){
        if(tipo == TipoNotificacao.PEDIDO) return "solicitacoes";
        else return "leNotificacao?id=" + this.getId();
    }
}