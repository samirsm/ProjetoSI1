package controllers;

import java.util.List;

import javax.inject.Inject;

import models.*;
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

    public Result exibeSolicitacoes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Solicitacao> solicitacoes = user.getSolicitacoes();

        return ok(telaDeSolicitacoes.render(user, solicitacoes));
    }


    public Result leNotificacao(Long idNotificacao){
        Notificacao notificacao = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idNotificacao);
        SistemaNotificacao.getInstance().leNotificacao(notificacao);
        return redirect(routes.HomeController.index());
    }

    public Result leTodasNotificacoes(){
        SistemaNotificacao.getInstance().leTodasNotificacoes();
        return redirect(routes.HomeController.index());
    }


}