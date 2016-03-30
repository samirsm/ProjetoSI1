package controllers;

import javax.inject.Inject;

import exceptions.LoginInvalidoException;
import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.data.format.Formatters;
import play.data.validation.Constraints.Validator;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class AutenticacaoController extends Controller {
	@Inject MessagesApi messages;
	@Inject Formatters formatters;
	@Inject javax.validation.Validator validator;
	@Inject FormFactory formFactory = new FormFactory(messages,formatters,validator);
	Form<Usuario> formularioLogin = formFactory.form(Usuario.class);
	
	public Result index(){
		// TODO
		
		//return ok(telaLoginCadastro.render());
		return ok(telaLoginCadastro.render(formularioLogin));
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
