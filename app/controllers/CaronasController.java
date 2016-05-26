package controllers;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.annotation.ServletSecurity;

import exceptions.CaronaJaCadastradaException;
import models.*;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaCarona;
import sistemas.SistemaNotificacao;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import play.mvc.Security;
import views.html.*;

public class CaronasController extends Controller {
    private FormFactory formFactory;
    private LoggerSistema loggerCaronas;
    
    @Inject
    public CaronasController(FormFactory formFactory) {
        this.formFactory = formFactory;
        loggerCaronas = new LoggerSistema();
    }
    
    @Security.Authenticated(Secured.class)
    public Result cadastraNovaCarona(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        
        Usuario motorista = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        
        Integer hora = Integer.parseInt(requestData.get("hora"));
        String dia = requestData.get("diaDaSemana");
        Integer vagasDisponiveisCarona = Integer.parseInt(requestData.get("vagasDisponiveis"));
        Horario horario = new Horario(dia, hora);
        TipoCarona tipo = getTipo(requestData.get("tipo"));
        
        try{
            SistemaCarona.getInstance().criaCarona(motorista, horario, tipo, vagasDisponiveisCarona);
            loggerCaronas.registraAcao(Acao.CADASTROU_CARONA, horario.toString(), tipo.toString(), vagasDisponiveisCarona.toString());
            SistemaCarona.getInstance().getListaPesquisaAtualizada();
            loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS);
        } catch (CaronaJaCadastradaException e){
          flash("erro", e.getMessage());
          return redirect(routes.HomeController.index());
      }
        flash("success", "Carona cadastrada com sucesso!");
        return redirect(routes.HomeController.index()); 
    }
    
    @Security.Authenticated(Secured.class)
    public Result aceitaPedido(Long id){
        Solicitacao pedido = buscarSolicitacaoPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        Notificacao notificacao = new Notificacao(usuarioLogado, pedido.getCarona(), TipoNotificacao.ACEITACAO);

        SistemaCarona.getInstance().adicionarPassageiros(pedido.getCarona(), pedido.getSolicitante()); //adiciona o passageiro à carona
        loggerCaronas.registraAcao(Acao.ACEITOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getSolicitante().toString());

        SistemaNotificacao.getInstance().notificaUsuario(notificacao, pedido.getSolicitante()); //notifica o passageiro que seu pedido foi aceito
        loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getSolicitante().toString());

        usuarioLogado.removeSolicitacao(pedido); //remove a solicitacao, pois ja foi aceita
        pedido.getCarona().getMotorista().removeSolicitacao(pedido); //so pra garantir :P
        usuarioLogado.leNotificacao(pedido.getNotificacaoAssociada()); //apaga a notificacao automaticamente
        pedido.getSolicitante().removeCaronaPendente(pedido.getCarona()); //a carona deixade ser pendente para o passageiro

        return redirect(routes.NotificacoesController.exibeSolicitacoes());
      }
    
    @Security.Authenticated(Secured.class)
    public Result recusaPedido(Long id){
        Solicitacao pedido = buscarSolicitacaoPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        Notificacao notificacao = new Notificacao(usuarioLogado, pedido.getCarona(), TipoNotificacao.REJEICAO);

        loggerCaronas.registraAcao(Acao.RECUSOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getSolicitante().toString());

        SistemaNotificacao.getInstance().notificaUsuario(notificacao, pedido.getSolicitante());
        loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getSolicitante().toString());

        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        user.removeSolicitacao(pedido);
        pedido.getCarona().getMotorista().removeSolicitacao(pedido);

        return redirect(routes.NotificacoesController.exibeSolicitacoes());

    }
      
    @Security.Authenticated(Secured.class)
    public Result solicitaCarona(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);

        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        Solicitacao solicitacao = new Solicitacao(usuarioLogado, carona);
        Notificacao notificacao = new Notificacao(usuarioLogado, carona, TipoNotificacao.PEDIDO);
        solicitacao.setNotificacaoAssociada(notificacao); // associa a notificacao deste pedido a ele para que saiba qual notificacao apagar depois

        usuarioLogado.adicionaCaronaPendente(carona); // a carona do pedido torna-se pendente ao usuario
        carona.adicionaSolicitante(usuarioLogado); // o usuario logado agora é um dos que solicitam esta carona
        carona.getMotorista().recebeSolicitacao(solicitacao); // o motorista recebe a solicitacao
        SistemaNotificacao.getInstance().notificaUsuario(notificacao, carona.getMotorista()); // o motorista da carona é notificado desse pedido
        buscarCaronas(); // atualizar a lista de caronas, agora sem esta, que ja foi pedida

        return redirect(routes.HomeController.index());
    }

    
    @Security.Authenticated(Secured.class)
    public Result buscarCaronas(){
        List<Carona> caronas = SistemaCarona.getInstance().buscarCaronasDefault();
        loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS, caronas.toString());
        return redirect(routes.HomeController.index());
    }
    
    @Security.Authenticated(Secured.class)
    public Result exibeDetalhes(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login")).getCaronas();
        List<Notificacao> notificacoesUsuarioLogado = SistemaNotificacao.getInstance().getNotificacoesNaoLidas();
        
        loggerCaronas.registraAcao(Acao.EXIBE_DETALHES, carona.toString());
        
        return ok(telaConfirmarPedidoCarona.render(usuarioLogado, carona));
    }
    
    @Security.Authenticated(Secured.class)
    public void cancelaCarona(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        //SistemaNotificacao.getInstance().geraNotificacaoCancelamento(carona);
        loggerCaronas.registraAcao(Acao.CANCELOU_CARONA, carona.toString());
    }


    @Security.Authenticated(Secured.class)
    private TipoCarona getTipo(String tipo){
        if ("ida".equals(tipo)) return TipoCarona.IDA;
        else return TipoCarona.VOLTA;
    }

    @Security.Authenticated(Secured.class)
    public Result exibeCaronasPendentes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
        List<Carona> pendentes = user.getCaronasPendentes();
        return ok(telaCaronasPendentes.render(user, pendentes));
    }

    @Security.Authenticated(Secured.class)
    public Solicitacao buscarSolicitacaoPorId(Long id){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));

        int i = buscarIndiceSolicitacaoPorId(id);
        return usuarioLogado.getSolicitacoes().get(i);
    }
    @Security.Authenticated(Secured.class)
    private int buscarIndiceSolicitacaoPorId(Long id) {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));

        for (int i = 0; i < usuarioLogado.getSolicitacoes().size(); i++){
            if (usuarioLogado.getSolicitacoes().get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
