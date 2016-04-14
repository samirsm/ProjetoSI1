package controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import exceptions.LoginInvalidoException;
import models.Carona;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.api.inject.Binding;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaCarona;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import views.html.*;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private Form<Dados> formularioDadosPessoaisUsuario;
	private Form<Endereco> formularioEndereco;
	private Form<Carona> formularioCarona;
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
		this.formFactory = formFactory;
		formularioDadosPessoaisUsuario = this.formFactory.form(Dados.class);
		formularioEndereco = this.formFactory.form(Endereco.class);
		formularioCarona = this.formFactory.form(Carona.class);
	}

	private Result verificaPrimeiroAcessoUsuario(Usuario usuario) {
		List<Carona> caronas = SistemaCarona.getInstance().buscarCaronas();
		if (!usuario.isHorariosCadastrados())
			return ok(telaCadastroHorario.render(usuario));
		return ok(viewMotorista.render(usuario, formularioCarona, caronas));
	}
	
	public Result efetuaLogin(){
		Usuario usuarioLogado = autenticaUsuario();
		return verificaPrimeiroAcessoUsuario(usuarioLogado);
	}
	
	private Usuario autenticaUsuario(){
		Dados dadosUsuario = formularioDadosPessoaisUsuario.bindFromRequest().get();
		
		String matricula = dadosUsuario.getMatricula();
		String email = matricula; // O usuário pode digitar um dos dois no mesmo campo
		String senha = dadosUsuario.getSenha();
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(matricula, email, senha);
		
		return SistemaUsuarioLogin.getInstance().getUsuarioLogado();
	}

	public Result cadastraUsuario() {
		Dados dadosPessoais = formularioDadosPessoaisUsuario.bindFromRequest().get();
		Endereco endereco = formularioEndereco.bindFromRequest().get();
		
		SistemaUsuarioCRUD.getInstance().cadastraUsuario(dadosPessoais, endereco);
		
		return ok(index.render("Cadastro realizado com sucesso!"));
	}
	
	public Result efetuaLogout(){
		SistemaUsuarioLogin.getInstance().efetuaLogout();
		
		return ok(telaLoginCadastro.render(formularioDadosPessoaisUsuario, formularioEndereco));
	}
}
