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

    @Security.Authenticated(Secured.class)
    public Result exibeSolicitacoes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        List<Solicitacao> solicitacoes = user.getSolicitacoes();

        return ok(telaDeSolicitacoes.render(user, solicitacoes));
    }

    @Security.Authenticated(Secured.class)

    public Result leNotificacao(Long idNotificacao){
        Notificacao notificacao = SistemaNotificacao.getInstance().buscarNotificacaoPorId(idNotificacao);
        SistemaNotificacao.getInstance().leNotificacao(notificacao);
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result leTodasNotificacoes(){
        SistemaNotificacao.getInstance().leTodasNotificacoes();
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        return redirect(routes.HomeController.index());
    }


}