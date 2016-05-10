package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import models.Carona;
import models.Notificacao;
import models.TipoNotificacao;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import sistemas.SistemaNotificacao;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class NotificacoesController extends Controller{
    
    @Inject
    private NotificacoesController() {
    }

    @Security.Authenticated(Secured.class)
    public Result exibeSolicitacoes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Carona> caronas = user.getCaronas();
        List<Notificacao> notificacoes = user.getNotificacoesNaoLidas();
        List<Notificacao> solicitacoes = new ArrayList<>();

        for(int i = 0; i< notificacoes.size(); i++){
          if(notificacoes.get(i).getTipo() == TipoNotificacao.PEDIDO)
              solicitacoes.add(notificacoes.get(i));
        }
        return ok(telaDeSolicitacoes.render(user, caronas, solicitacoes, notificacoes));
    }

    @Security.Authenticated(Secured.class)
    public Result notificaPedido(Carona carona){
        SistemaNotificacao.getInstance().geraNotificacaoPedido(carona);
        return ok("Seu pedido foi enviado");
    }
    
    @Security.Authenticated(Secured.class)
    public Result aceitaPedido(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        Usuario motorista = pedido.getCarona().getMotorista();
        notificaAceitacao(idPedido);
        return ok();
    }
    
    @Security.Authenticated(Secured.class)
    public Result notificaAceitacao(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        SistemaNotificacao.getInstance().geraNotificacaoAceitacao(pedido);
        return ok("Seu pedido de carona foi aceito");
    }
    
    @Security.Authenticated(Secured.class)
    public Result notificaCancelamento(Carona carona){
        SistemaNotificacao.getInstance().geraNotificacaoCancelamento(carona);
        return ok();
    }
    
    @Security.Authenticated(Secured.class)
    public Result notificaRejeicao(Long idPedido){
        Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idPedido);
        SistemaNotificacao.getInstance().geraNotificacaoRejeicao(pedido);
        return ok();
    }

    @Security.Authenticated(Secured.class)
    public Result leNotificacao(Long idNotificacao){
        Notificacao notificacao = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idNotificacao);
        SistemaNotificacao.getInstance().leNotificacao(notificacao);
        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result leTodasNotificacoes(){
        SistemaNotificacao.getInstance().leTodasNotificacoes();
        return redirect(routes.HomeController.index());
    }


}