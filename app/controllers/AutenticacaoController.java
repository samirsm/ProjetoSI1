package controllers;

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
	private Form<Usuario> formularioLogin;
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioLogin = formFactory.form(Usuario.class);
	}
	
	public Result index(){
		// TODO

		//return ok(telaLoginCadastro.render());
		return ok(telaLoginCadastro.render(formularioLogin));
	}

	public Result efetuaLogin () throws LoginInvalidoException {
		DynamicForm requestData = formFactory.form().bindFromRequest();
		Usuario user = formularioLogin.bindFromRequest().get();
		String userName = user.getNome();
		
		return ok(exceptions.render("oi " + userName + " "));
	}

	public Result cadastraUsuario(){
		//TODO
		Form<Usuario> formularioLogin = formFactory.form(Usuario.class);
		Usuario user = formularioLogin.bindFromRequest().get();
		return null;
	}
}
