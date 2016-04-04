package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import exceptions.LoginInvalidoException;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private Form<Usuario> formularioAutenticacao;
	private List<Usuario> usuariosCadastrados;
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
		this.formFactory = formFactory;
		usuariosCadastrados = new ArrayList<Usuario>();
		formularioAutenticacao = this.formFactory.form(Usuario.class);
	}
	
	public Result index(){
		String x = "";
		for (Usuario usuario : usuariosCadastrados) {
			x+= usuario.toString();
		}
		return ok(telaLoginCadastro.render(formularioAutenticacao, x));
	}

	public Result efetuaLogin () throws LoginInvalidoException {
		Usuario user = formularioAutenticacao.bindFromRequest().get();
		
		return validaLogin(user);
	}

	public Result cadastraUsuario(){
		Usuario user = formularioAutenticacao.bindFromRequest().get();
		
		String x = "";
		usuariosCadastrados.add(user);
		for (Usuario usuario : usuariosCadastrados) {
			x+= usuario.toString();
		}
		return ok(index.render("Cadastro realizado com sucesso!"));
		
	}

	private Result validaLogin(Usuario user) {
		Usuario usuarioLogado = validaUsuario(user);
		Form<String> formularioHorarios = formFactory.form(String.class);;
		if (usuarioLogado == null)
			return ok(exceptions.render(new LoginInvalidoException().getMessage()));
		else
			return new HorariosController(formFactory, usuarioLogado).index();
	}

	private Usuario validaUsuario(Usuario usuarioPesquisado) {
		for (Usuario usuario : usuariosCadastrados)
			if (usuario.equals(usuarioPesquisado))
				return usuario;
			
		return null;
	}
}
