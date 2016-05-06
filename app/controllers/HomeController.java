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
import views.html.*;

public class HomeController extends Controller {
	private FormFactory formFactory;
	private Usuario usuarioLogado;
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Endereco> formularioEndereco;
	private Form<Carona> formularioCarona;
	private Form<Horario> formularioHorario;
	private List<String> bairros;
	private String idioma = "pt"; //Default português
	private HashMap<Integer, String> idiomas = new HashMap<Integer, String>();
	
	@Inject
	public HomeController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
		formularioCarona = this.formFactory.form(Carona.class);
		formularioHorario = this.formFactory.form(Horario.class);
		bairros = SistemaDeBairros.getInstance().getBairrosCadastrados();
		idiomas.put(1, "pt");
		idiomas.put(2, "en");
		idiomas.put(3, "es");
		idiomas.put(4, "it");
	}
	
	public Result index(){

		ctx().changeLang(idioma);
		usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		
		return exibePagina();
	}

	public Result redefineIdioma(Integer id) {
		idioma = idiomas.get(id);
		ctx().changeLang(idioma);
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
