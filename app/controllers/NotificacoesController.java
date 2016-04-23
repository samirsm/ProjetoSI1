package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


import models.Carona;
import models.Notificacao;
import models.TipoNotificacao;
import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import sistemas.SistemaCarona;
import sistemas.SistemaNotificacao;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class NotificacoesController extends Controller{
    private FormFactory formFactory;
    private Form<Notificacao> formularioNotificao;
    
    @Inject
    private NotificacoesController(FormFactory formFactory) {
        this.formFactory = formFactory;
        formularioNotificao = this.formFactory.form(Notificacao.class);

    }

    
    public play.mvc.Result exibeSolicitacoes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Carona> caronas = user.getCaronasMotorista();
        List<Notificacao> solicitacoes = new ArrayList<>();
        List<Notificacao> notificacoes = user.getNotificacoesNaoLidas();
        for(int i = 0; i< notificacoes.size(); i++){
          if(notificacoes.get(i).getTipo() == TipoNotificacao.PEDIDO)
              solicitacoes.add(notificacoes.get(i));
        }
        return ok(telaDeSolicitacoes.render(user, caronas, solicitacoes, notificacoes));
    }


    public play.mvc.Result notificaPedido(Carona carona){
        SistemaNotificacao.getInstance().geraNotificacaoPedido(carona);
        return ok("Seu pedido foi enviado");
    }

    public play.mvc.Result aceitaPedido(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        Usuario motorista = pedido.getCarona().getMotorista();
        motorista.removeSolicitacao(pedido);
        notificaAceitacao(idPedido);
        return ok();
    }
    
    public play.mvc.Result notificaAceitacao(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        SistemaNotificacao.getInstance().geraNotificacaoAceitacao(pedido);
        return ok("Seu pedido de carona foi aceito");
    }
    
    public play.mvc.Result notificaCancelamento(Carona carona){
        SistemaNotificacao.getInstance().geraNotificacaoCancelamento(carona);
        return ok("A carona à qual você pertencia foi cancelada");
    }

    public play.mvc.Result notificaRejeicao(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        SistemaNotificacao.getInstance().geraNotificacaoRejeicao(pedido);
        return ok("Seu pedido de carona foi rejeitado");
    }


}