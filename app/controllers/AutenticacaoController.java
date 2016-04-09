package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import exceptions.LoginInvalidoException;
import models.Carro;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.api.inject.Binding;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Carro> formularioCarro;
	private Form<Endereco> formularioEndereco;
	
	// Session
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioCarro = this.formFactory.form(Carro.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
	}
	
	public Result index(){
		return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioCarro, formularioEndereco));
	}

	public Result efetuaLogin() {
		Dados dadosUsuario = formularioDadosPessoaisUsuario.bindFromRequest().get();
		
		String matricula = dadosUsuario.getMatricula();
		String email = dadosUsuario.getEmail();
		String senha = dadosUsuario.getSenha();
		
//		HttpSession sessaoUsuario = request.
//		sessaoUsuario.setAttribute("MySessionVariable", new Object());
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(matricula, email, senha);
		
		return cadastraHorariosPrimeiraVez();
	}

	public Result cadastraUsuario() {
		Dados dadosPessoais = formularioDadosPessoaisUsuario.bindFromRequest().get();
		Carro carro = formularioCarro.bindFromRequest().get();
		Endereco endereco = formularioEndereco.bindFromRequest().get();
		
		SistemaUsuarioCRUD.getInstance().cadastraUsuario(dadosPessoais, carro);
		
		return ok(index.render("Cadastro realizado com sucesso!"));
	}
	
	public Result cadastraHorariosPrimeiraVez() {
		return ok(telaCadastroHorario.render(SistemaUsuarioLogin.getInstance().getUsuarioLogado()));
	}
	
	public Result efetuaLogout(){
		SistemaUsuarioLogin.getInstance().efetuaLogout();
		
		return index();
	}
}
