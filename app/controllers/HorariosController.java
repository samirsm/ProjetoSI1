package controllers;

import java.util.List;

import javax.inject.Inject;

import exceptions.BairroJaCadastradoException;
import exceptions.HorarioJaCadastradoException;
import models.Horario;
import models.Notificacao;
import models.TipoCarona;
import models.Usuario;
import play.data.Form;

import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaDeBairros;
import play.mvc.Security;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import views.html.*;
import sistemas.mensagens.*;
import javax.persistence.OptimisticLockException;

public class HorariosController extends Controller {
	
  private FormFactory formFactory;
  private LoggerSistema loggerHorarios;
  private Form<Horario> formularioHorario;
  private List<String> bairros;

  
	@Inject
	public HorariosController(FormFactory formFactory) {
		this.formFactory = formFactory;
		loggerHorarios = new LoggerSistema();
	    bairros = SistemaDeBairros.getInstance().getBairrosCadastrados();
	    formularioHorario = this.formFactory.form(Horario.class);

	}

    @Security.Authenticated(Secured.class)
	public Result cadastraHorarios(){
       SistemaUsuarioLogin.getInstance().cadastrouHorarios(session("login"));
       Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
       loggerHorarios.registraAcao(Acao.CADASTROU_HORARIOS, usuarioLogado.getHorariosIda().toString(), usuarioLogado.getHorariosVolta().toString());
       SistemaUsuarioCRUD.getInstance().salvaUsuarios();
       return redirect(routes.HomeController.index());
		
	}
	
	@Security.Authenticated(Secured.class)
	public Result cadastra() {
	  Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
      DynamicForm requestData = formFactory.form().bindFromRequest();
      Integer hora = Integer.parseInt(requestData.get("hora"));
      String dia = requestData.get("diaDaSemana");
      TipoCarona tipo = getTipo(requestData.get("tipo"));
      
      try{
    	  SistemaUsuarioCRUD.getInstance().cadastraHorario(usuarioLogado, tipo, dia, hora);
    	  loggerHorarios.registraAcao(Acao.ADICIONOU_HORARIO,usuarioLogado.toString(), tipo.toString(), dia, hora.toString());
      } catch (HorarioJaCadastradoException e){
        flash("erro", e.getMessage());
        return redirect(routes.HomeController.editaHorarios());
      }
      
      return redirect(routes.HomeController.editaHorarios());
      
      }
	
	@Security.Authenticated(Secured.class)
	public Result cadastraNovoEndereco() {
      Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
      DynamicForm requestData = formFactory.form().bindFromRequest();
      String rua = requestData.get("Rua");
      String bairro = requestData.get("Bairros");      
      try{
          SistemaUsuarioCRUD.getInstance().cadastraNovoEndereco(usuarioLogado,rua, bairro);
          loggerHorarios.registraAcao(Acao.CADASTROU_NOVO_ENDERECO,usuarioLogado.toString(),rua, bairro);
      } catch (BairroJaCadastradoException e){
        flash("erro", e.getMessage());
        return redirect(routes.HomeController.editaHorarios());
      }
        Idioma idioma = usuarioLogado.getIdioma();
      flash("success", MensagensSistema.ENDERECO_CADASTRADO[idioma.ordinal()]);
      return redirect(routes.HomeController.editaHorarios());
  	}

    @Security.Authenticated(Secured.class)
	public Result excluiHorarioVolta(String dia, Integer hora){
	  Horario horario = new Horario(dia, hora);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
      List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
      usuarioLogado.removeHorario(horario);
        return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));
	}

    @Security.Authenticated(Secured.class)
	public Result excluiHorarioIda(String dia, Integer hora){
      Horario horario = new Horario(dia, hora);
        Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
      List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
      usuarioLogado.removeHorario(horario);
        return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));
    }

    @Security.Authenticated(Secured.class)
	private TipoCarona getTipo(String tipo){
	      if (tipo.equals("ida")) return TipoCarona.IDA;
	      else return TipoCarona.VOLTA;
	  }

}