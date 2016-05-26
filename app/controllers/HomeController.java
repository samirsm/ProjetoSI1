package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import sistemas.SistemaCarona;
import sistemas.SistemaDeBairros;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import play.mvc.Http.Context;
import sistemas.mensagens.Idioma;
import views.html.*;

public class HomeController extends Controller {
	private FormFactory formFactory;
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Endereco> formularioEndereco;
	private Form<Carona> formularioCarona;
	private Form<Horario> formularioHorario;
	private List<String> bairros;
	
	@Inject
	public HomeController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
		formularioCarona = this.formFactory.form(Carona.class);
		formularioHorario = this.formFactory.form(Horario.class);
		bairros = SistemaDeBairros.getInstance().getBairrosCadastrados();
	}
	
	// Mudar esse método para efetuar a verificação do Usuario Logado.
	
	@Security.Authenticated(Secured.class)
	public Result index(){
		if (isLogado())
			ctx().changeLang(SistemaUsuarioLogin.getInstance().getIdioma(session("login")).getId());
		else
			ctx().changeLang(ctx().lang());
		
		return exibePagina();
	}
	
	public Result redefineIdioma(Integer id) {
		Idioma idioma= Idioma.values()[id - 1];
		ctx().changeLang(idioma.getId());
		Usuario usuarioLogado = getUsuarioLogado();
		if(usuarioLogado != null){
			SistemaUsuarioLogin.getInstance().setIdioma(session("login"), idioma);
			usuarioLogado.getNotificacoesNaoLidas().clear();
            for(Notificacao not : usuarioLogado.getNotificacoesNaoLidas()){
                if(not.getTipo() == TipoNotificacao.IDIOMA)
                    usuarioLogado.leNotificacao(not);
            }
            usuarioLogado.recebeNotificacao(new Notificacao(usuarioLogado, TipoNotificacao.IDIOMA));
		}
		return redirect(routes.HomeController.index());
	}
	
	@Security.Authenticated(Secured.class)
	public Result editaHorarios(){
	  Usuario usuarioLogado = getUsuarioLogado();
      List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
      return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));

	}

	@Security.Authenticated(Secured.class)
	public Result exibePerfilUsuario(Long id){
		Usuario usuarioLogado = getUsuarioLogado();
		Usuario usuarioPerfil = SistemaUsuarioCRUD.getInstance().getUsuarioPorId(id);
		return ok(telaPerfilUsuario.render(usuarioLogado, usuarioPerfil));

	}
	
	private Result exibePagina(){
		if (!isLogado())
			return login();
		else if(!getUsuarioLogado().isHorariosCadastrados()){
		  return editaHorarios();
		}else if(isLogado() && !getUsuarioLogado().isHorariosCadastrados()){
			List<Notificacao> notificacaoes = getUsuarioLogado().getNotificacoesNaoLidas();
			return ok(telaCadastroHorario.render(getUsuarioLogado(), formularioHorario, getUsuarioLogado().getHorariosIda(), getUsuarioLogado().getHorariosVolta(), bairros, notificacaoes));
		}
		else{
			List<Carona> caronas = SistemaCarona.getInstance().getListaPesquisa();
			return ok(viewUsuario.render(getUsuarioLogado(), formularioCarona, caronas, bairros, getUsuarioLogado().getNotificacoesNaoLidas()));
		}
	}
	
	private boolean isLogado(){
		return getUsuarioLogado() != null;
	}
	
	private Usuario getUsuarioLogado(){
		return SistemaUsuarioLogin.getInstance().getUsuarioLogado(session("login"));
	}
	
	public Result login(){
		return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioEndereco, bairros));
	}

}
