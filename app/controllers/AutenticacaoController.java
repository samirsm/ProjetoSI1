package controllers;

import javax.inject.Inject;
import javax.persistence.Id;
import javax.validation.Validation;

import exceptions.LoginInvalidoException;
import models.Usuario;
import play.data.*;
import play.data.DynamicForm.Dynamic;
import play.data.format.Formatters;
import play.i18n.MessagesApi;
import play.mvc.*;
import views.html.*;

public class AutenticacaoController extends Controller {
	@Id
	private Long id;
	
//	@Inject FormFactory formFactory;
//	Form<Usuario> formularioLogin = formFactory.form(Usuario.class);
	
	public Result index(){
		// TODO
		
		return ok(telaLoginCadastro.render());
		// return ok(telaLoginCadastro.render(formularioLogin));
	}
	
	public Result efetuaLogin () throws LoginInvalidoException{
		//TODO
		
		return null;
	}
	
	public Result cadastraUsuario(){
		//TODO
		
		return null;
	}
}
