package controllers;

import javax.inject.Inject;

import models.Usuario;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class HorariosController extends Controller {
	private FormFactory formFactory;
	private Form<String> formularioHorario;
	private Usuario usuarioLogado;
	
	@Inject
	public HorariosController (FormFactory formFactory, Usuario usuarioLogado){
		this.formFactory = formFactory;
		this.usuarioLogado = usuarioLogado;
		formularioHorario = this.formFactory.form(String.class);
	}	
	public Result index(){
		return ok(telaCadastroHorario.render(formularioHorario, usuarioLogado));
		
	}
}
