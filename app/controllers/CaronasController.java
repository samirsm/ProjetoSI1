package controllers;

import java.util.List;

import javax.inject.Inject;

import exceptions.CaronaJaCadastradoException;
import exceptions.NumeroDeVagasExcedenteException;
import exceptions.NumeroDeVagasInsuficienteException;
import models.Carona;
import models.Horario;
import models.Notificacao;
import models.TipoCarona;
import models.Usuario;
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
        TipoCarona tipo = getTipo(requestData.get("tipo"));
        
        try{
            SistemaCarona.getInstance().criaCarona(motorista, horario, tipo, vagasDisponiveisCarona);
            loggerCaronas.registraAcao(Acao.CADASTROU_CARONA, horario.toString(), tipo.toString(), vagasDisponiveisCarona.toString());
            SistemaCarona.getInstance().getListaPesquisaAtualizada();
            loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS);
        } catch (NumeroDeVagasExcedenteException | CaronaJaCadastradoException e){
            loggerCaronas.registraAcao(Acao.ERRO, e.getMessage());
            return badRequest(e.getMessage());
      }
        
        return redirect(routes.HomeController.index());
    }
    
    public Result confirmaAgendamento(Long id){

      Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(id);

      try {
          SistemaCarona.getInstance().adicionarPassageiros(pedido.getCarona(), pedido.getUsuarioOrigem());
          loggerCaronas.registraAcao(Acao.ACEITOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getUsuarioOrigem().toString());
          SistemaNotificacao.getInstance().geraNotificacaoAceitacao(pedido);
          loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getUsuarioOrigem().toString());

          SistemaUsuarioLogin.getInstance().getUsuarioLogado().leNotificacao(pedido);
          return redirect(routes.NotificacoesController.exibeSolicitacoes());
      } catch (NumeroDeVagasInsuficienteException e) {
        loggerCaronas.registraAcao(Acao.ERRO, e.getMessage());
        return badRequest(e.getMessage());    
        }
      }
    
    public Result recusaPedido(Long id){
      Notificacao pedido = SistemaNotificacao.getInstance().buscarNotificacaoPorId(id);
      loggerCaronas.registraAcao(Acao.RECUSOU_PEDIDO_CARONA, pedido.getCarona().getMotorista().toString(), pedido.getUsuarioOrigem().toString());
      SistemaNotificacao.getInstance().geraNotificacaoRejeicao(pedido);
      loggerCaronas.registraAcao(Acao.GERA_NOTIFICACAO, pedido.getCarona().getMotorista().toString(), pedido.getUsuarioOrigem().toString());

      SistemaUsuarioLogin.getInstance().getUsuarioLogado().leNotificacao(pedido);
      return redirect(routes.NotificacoesController.exibeSolicitacoes());

    }
      
      public Result solicitaAgendamento(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        SistemaNotificacao.getInstance().geraNotificacaoPedido(carona);
  
        return redirect(routes.HomeController.index());
    }
    
    public Result buscarCaronas(){
        //Futura atualização que oferecerá diversos tipos de busca
        /*
        DynamicForm requestData = formFactory.form().bindFromRequest();
        
        
        String hora = requestData.get("hora");
        String dia = requestData.get("diaDaSemanaBusca");
        String bairro = requestData.get("bairro");
        TipoCarona tipo = getTipo(requestData.get("tipo"));
        
        Horario horario = new Horario(dia, Integer.parseInt(hora));
        
        */
        
        List<Carona> caronas = SistemaCarona.getInstance().buscarCaronasDefault();
        loggerCaronas.registraAcao(Acao.EFETUA_BUSCA_POR_CARONAS, caronas.toString());
        return redirect(routes.HomeController.index());
    }
    
    public Result exibeDetalhes(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
        List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado().getCaronasMotorista();
        List<Notificacao> notificacoesUsuarioLogado = SistemaNotificacao.getInstance().getNotificacoesNaoLidas();
        
        loggerCaronas.registraAcao(Acao.EXIBE_DETALHES, carona.toString());
        
        return ok(telaAgendamentosCaronaPassageiro.render(usuarioLogado, caronasUsuarioLogado, notificacoesUsuarioLogado, carona));
    }
    
    public void cancelaCarona(Long id){
        Carona carona = SistemaCarona.getInstance().buscarCaronaPorId(id);
        
        SistemaNotificacao.getInstance().geraNotificacaoCancelamento(carona);
        loggerCaronas.registraAcao(Acao.CANCELOU_CARONA, carona.toString());
    }

    private TipoCarona getTipo(String tipo){
        if ("ida".equals(tipo)) return TipoCarona.IDA;
        else return TipoCarona.VOLTA;
    }
}
