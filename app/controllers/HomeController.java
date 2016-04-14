package controllers;

import java.util.List;

import javax.inject.Inject;

import models.Carona;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaCarona;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class HomeController extends Controller {
	private FormFactory formFactory;
	private Usuario usuarioLogado;
	
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Endereco> formularioEndereco;
	private Form<Carona> formularioCarona;
	
	@Inject
	public HomeController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
		formularioCarona = this.formFactory.form(Carona.class);
	}
	
	public Result index(){
		usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		return exibePagina();
	}
	
	private Result exibePagina(){
		List<Carona> caronas = SistemaCarona.getInstance().buscarCaronas();
		if (usuarioLogado == null)
			return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioEndereco));
		else if(!usuarioLogado.isHorariosCadastrados())
			return ok(telaCadastroHorario.render(usuarioLogado));
		else
			return ok(viewMotorista.render(usuarioLogado, formularioCarona, caronas)); 
	}
}
