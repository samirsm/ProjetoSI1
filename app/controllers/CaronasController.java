package controllers;

import java.util.List;

import javax.inject.Inject;

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
import views.html.*;

public class CaronasController extends Controller {
    private FormFactory formFactory;
    private LoggerSistema loggerCaronas;
    
    @Inject
    public CaronasController(FormFactory formFactory) {
        this.formFactory = formFactory;
        loggerCaronas = new LoggerSistema();
    }
    
    public Result cadastraNovaCarona(){
        DynamicForm requestData = formFactory.form().bindFromRequest();
        
        Usuario motorista = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        
        Integer hora = Integer.parseInt(requestData.get("hora"));
        String dia = requestData.get("diaDaSemana");
        Integer vagasDisponiveisCarona = Integer.parseInt(requestData.get("vagasDisponiveis"));
        Horario horario = new Horario(dia, hora);
        horario.save();
        TipoCarona tipo = getTipo(requestData.get("tipo"));
        
        try{
            Carona carona = SistemaCarona.getInstance().criaCarona(motorista, horario, tipo, vagasDisponiveisCarona);
            loggerCaronas.registraAcao(Acao.CADASTROU_CARONA, horario.toString(), tipo.toString(), vagasDisponiveisCarona.toString());
            carona.save();
            SistemaCarona.getInstance().getListaPesquisaAtualizada();
            loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS);
        } catch (CaronaJaCadastradaException e){
          flash("erro", e.getMessage());
          return redirect(routes.HomeController.index());
      }
        flash("success", "Carona cadastrada com sucesso!");
        return redirect(routes.HomeController.index()); 
    }
    
    public Result aceitaPedido(Long id){
        Solicitacao pedido = buscarSolicitacaoPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        Notificacao notificacao = new Notificacao(usuarioLogado, pedido.getCarona(), TipoNotificacao.ACEITACAO);

        SistemaCarona.getInstance().adicionarPassageiros(pedido.getCarona(), pedido.getUsuario()); //adiciona o passageiro à carona
        loggerCaronas.registraAcao(Acao.ACEITOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getUsuario().toString());

        SistemaNotificacao.getInstance().notificaUsuario(notificacao, pedido.getUsuario()); //notifica o passageiro que seu pedido foi aceito
        loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getUsuario().toString());

        usuarioLogado.removeSolicitacao(pedido); //remove a solicitacao, pois ja foi aceita
        pedido.getCarona().getMotorista().removeSolicitacao(pedido); //so pra garantir :P
        usuarioLogado.leNotificacao(pedido.getNotificacaoAssociada()); //apaga a notificacao automaticamente
        pedido.getUsuario().removeCaronaPendente(pedido.getCarona()); //a carona deixade ser pendente para o passageiro

        return redirect(routes.NotificacoesController.exibeSolicitacoes());
      }
    
    public Result recusaPedido(Long id){
        Solicitacao pedido = buscarSolicitacaoPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        Notificacao notificacao = new Notificacao(usuarioLogado, pedido.getCarona(), TipoNotificacao.REJEICAO);

        loggerCaronas.registraAcao(Acao.RECUSOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getUsuario().toString());

        SistemaNotificacao.getInstance().notificaUsuario(notificacao, pedido.getUsuario());
        loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getUsuario().toString());

        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        user.removeSolicitacao(pedido);
        pedido.getCarona().getMotorista().removeSolicitacao(pedido);

        return redirect(routes.NotificacoesController.exibeSolicitacoes());

    }
      
    public Result solicitaCarona(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);

        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
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

    
    public Result buscarCaronas(){
        List<Carona> caronas = SistemaCarona.getInstance().buscarCaronasDefault();
        loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS, caronas.toString());
        return redirect(routes.HomeController.index());
    }
    
    public Result exibeDetalhes(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado().getCaronas();
        List<Notificacao> notificacoesUsuarioLogado = SistemaNotificacao.getInstance().getNotificacoesNaoLidas();
        
        loggerCaronas.registraAcao(Acao.EXIBE_DETALHES, carona.toString());
        
        return ok(telaConfirmarPedidoCarona.render(usuarioLogado, carona));
    }
    
    public void cancelaCarona(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        //SistemaNotificacao.getInstance().geraNotificacaoCancelamento(carona);
        loggerCaronas.registraAcao(Acao.CANCELOU_CARONA, carona.toString());
    }


    private TipoCarona getTipo(String tipo){
        if ("ida".equals(tipo)) return TipoCarona.IDA;
        else return TipoCarona.VOLTA;
    }

    public Result exibeCaronasPendentes() {
        Usuario user = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Carona> pendentes = user.getCaronasPendentes();
        return ok(telaCaronasPendentes.render(user, pendentes));
    }

    public Solicitacao buscarSolicitacaoPorId(Long id){
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        int i = buscarIndiceSolicitacaoPorId(id);
        return usuarioLogado.getSolicitacoes().get(i);
    }
    private int buscarIndiceSolicitacaoPorId(Long id) {
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();

        for (int i = 0; i < usuarioLogado.getSolicitacoes().size(); i++){
            if (usuarioLogado.getSolicitacoes().get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
