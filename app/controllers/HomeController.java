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
	private Usuario usuarioLogado;
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Endereco> formularioEndereco;
	private Form<Carona> formularioCarona;
	private Form<Horario> formularioHorario;
	private List<String> bairros;
	private Idioma idioma = Idioma.PORTUGUES; //Default português

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
	public Result index(){

		ctx().changeLang(SistemaUsuarioLogin.getInstance().getIdioma().getId());
		usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		return exibePagina();
	}

	public Result redefineIdioma(Integer id) {
		Idioma idioma= Idioma.values()[id - 1];
		ctx().changeLang(idioma.getId());
		SistemaUsuarioLogin.getInstance().setIdioma(idioma);
		if(usuarioLogado != null){
			usuarioLogado.setIdioma(idioma);
			for(Notificacao not : usuarioLogado.getNotificacoesNaoLidas()){
				if(not.getTipo() == TipoNotificacao.IDIOMA)
					usuarioLogado.leNotificacao(not);
			}
			usuarioLogado.recebeNotificacao(new Notificacao(usuarioLogado, TipoNotificacao.IDIOMA));
		}
		return exibePagina();
	}

	public Result editaHorarios(){
		List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
		return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));

	}

	public Result exibePerfilUsuario(Long id){
		Usuario usuarioPerfil = SistemaUsuarioCRUD.getInstance().getUsuarioPorId(id);
		return ok(telaPerfilUsuario.render(usuarioLogado, usuarioPerfil));

	}

	private Result exibePagina(){
		if (!SistemaUsuarioLogin.getInstance().isLogado())
			return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioEndereco, bairros));
		else if(!usuarioLogado.isHorariosCadastrados()){
			return editaHorarios();
		}else if(SistemaUsuarioLogin.getInstance().isLogado() && !usuarioLogado.isHorariosCadastrados()){
			List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
			return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));
		}
		else{
			List<Carona> caronas = SistemaCarona.getInstance().getListaPesquisa();
			return ok(viewUsuario.render(usuarioLogado, formularioCarona, caronas, bairros, usuarioLogado.getNotificacoesNaoLidas()));
		}
	}

	public Result ajuda(){
		return ok(telaAjuda.render());
	}

	private void leNotificacaoAjuda(){
		if(usuarioLogado != null) {
			for (Notificacao not : usuarioLogado.getNotificacoesNaoLidas())
				if (not.getTipo() == TipoNotificacao.BOASVINDAS) usuarioLogado.leNotificacao(not);
		}
	}


}
