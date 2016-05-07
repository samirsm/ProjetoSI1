package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import models.Carona;
import models.Dados;
import models.Endereco;
import models.Horario;
import models.Notificacao;
import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import sistemas.SistemaCarona;
import sistemas.SistemaDeBairros;
import sistemas.SistemaUsuarioLogin;
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
		}
		return exibePagina();
	}
	
	private Result exibePagina(){
		if (usuarioLogado == null)
			return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioEndereco, bairros));
		else if(!usuarioLogado.isHorariosCadastrados()){
			List<Notificacao> notificacaoes = usuarioLogado.getNotificacoesNaoLidas();
			return ok(telaCadastroHorario.render(usuarioLogado, formularioHorario, usuarioLogado.getHorariosIda(), usuarioLogado.getHorariosVolta(), bairros, notificacaoes));
		}
		else{
			List<Carona> caronas = SistemaCarona.getInstance().getListaPesquisa();
		
			return ok(viewUsuario.render(usuarioLogado, formularioCarona, caronas, bairros, usuarioLogado.getNotificacoesNaoLidas()));
		}
	}


}
