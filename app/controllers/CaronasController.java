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
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class CaronasController extends Controller {
	
	private FormFactory formFactory;
	private Form<Carona> formularioCarona;
	
	@Inject
	public CaronasController(FormFactory formFactory) {
		this.formFactory = formFactory;
		formularioCarona = this.formFactory.form(Carona.class);
	}
	
	public Result cadastraNovaCarona(){
		Carona novaCarona = formularioCarona.bindFromRequest().get();
		Usuario motorista = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		List<Carona> caronas = SistemaCarona.getInstance().buscarCaronas();
		
		//TODO Definir as classes que serão utilizadas para gerar uma carona.
		
		SistemaCarona.getInstance().criaCarona(motorista, 4);
		
		return ok(viewMotorista.render(SistemaUsuarioLogin.getInstance().getUsuarioLogado(), formularioCarona, caronas));
	}

}
