package controllers;

import javax.inject.Inject;

import exceptions.BairroJaCadastradoException;
import exceptions.HorarioJaCadastradoException;
import models.TipoCarona;
import models.Usuario;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import views.html.*;

public class HorariosController extends Controller {
	
  private FormFactory formFactory;
  private LoggerSistema loggerHorarios;
  
	@Inject
	public HorariosController(FormFactory formFactory) {
		this.formFactory = formFactory;
		loggerHorarios = new LoggerSistema();
	}

	public Result cadastraHorarios(){
       SistemaUsuarioLogin.getInstance().cadastrouHorarios();
       Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
       loggerHorarios.registraAcao(Acao.CADASTROU_HORARIOS, usuarioLogado.getHorariosIda().toString(), usuarioLogado.getHorariosVolta().toString());
       return redirect(routes.HomeController.index());
		
	}
	
	public Result cadastra() {
	  Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
      DynamicForm requestData = formFactory.form().bindFromRequest();
      Integer hora = Integer.parseInt(requestData.get("hora"));
      String dia = requestData.get("diaDaSemana");
      TipoCarona tipo = getTipo(requestData.get("tipo"));
      
      try{
    	  SistemaUsuarioCRUD.getInstance().cadastraHorario(usuarioLogado, tipo, dia, hora);
    	  loggerHorarios.registraAcao(Acao.ADICIONOU_HORARIO,usuarioLogado.toString(), tipo.toString(), dia, hora.toString());
      } catch (HorarioJaCadastradoException e){
    	  return badRequest(e.getMessage());
      }
      
      return redirect(routes.HomeController.editaHorarios());
      
  }
	
	public Result cadastraNovoEndereco() {
      Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
      DynamicForm requestData = formFactory.form().bindFromRequest();
      String rua = requestData.get("Rua");
      String bairro = requestData.get("Bairros");      
      try{
          SistemaUsuarioCRUD.getInstance().cadastraNovoEndereco(usuarioLogado,rua, bairro);
          loggerHorarios.registraAcao(Acao.CADASTROU_NOVO_ENDERECO,usuarioLogado.toString(),rua, bairro);
      } catch (BairroJaCadastradoException e){
          return badRequest(e.getMessage());
      }
      
      return redirect(routes.HomeController.editaHorarios());
	}

	private TipoCarona getTipo(String tipo){
	      if (tipo.equals("ida")) return TipoCarona.IDA;
	      else return TipoCarona.VOLTA;
	  }
	
	
	
	
	
	
}