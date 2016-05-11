package controllers;

import javax.inject.Inject;

import exceptions.DadosInvalidosException;
import exceptions.LoginInvalidoException;
import exceptions.UsuarioCadastradoException;
import models.Dados;
import models.Endereco;
import models.Usuario;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import sistemas.SistemaUsuarioCRUD;
import sistemas.SistemaUsuarioLogin;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import views.html.*;
import models.dao.GenericDAO;

public class AutenticacaoController extends Controller {
	private FormFactory formFactory;
	private LoggerSistema loggerAutenticacao;
	private static final GenericDAO DAO = new GenericDAO();
	
	@Inject
	public AutenticacaoController (FormFactory formFactory){
		this.formFactory = formFactory;
		loggerAutenticacao = new LoggerSistema();
	}

	public Result efetuaLogin(){
		Usuario usuarioLogado = null;

		try {
			usuarioLogado = autenticaUsuario();
			if (usuarioLogado == null) 
				throw new LoginInvalidoException();
		} catch (DadosInvalidosException | LoginInvalidoException e) {
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(e.getMessage());
		}
		
		loggerAutenticacao.registraAcao(Acao.AUTENTICA_USUARIO, usuarioLogado.toString());
		return verificaPrimeiroAcessoUsuario(usuarioLogado);
	}
	@Transactional
	public Result cadastraUsuario() {
		DynamicForm requestData = formFactory.form().bindFromRequest();
		
		String nome = requestData.get("nome");
		String matricula = requestData.get("matricula");
		String email = requestData.get("email");
		String senha = requestData.get("senha");
		String numeroDeTelefone = requestData.get("numeroDeTelefone");
		String rua = requestData.get("rua");
		String bairro = requestData.get("bairro");
		
		Dados dadosPessoais;
		Endereco endereco;
		
		try{
			dadosPessoais = new Dados(nome, matricula, email, senha, numeroDeTelefone);
			endereco = new Endereco(rua, bairro);
		}catch(Exception e){
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(new DadosInvalidosException().getMessage());
		}

		
		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString());
		
		
		Integer numeroVagas;
		
		try{
			numeroVagas = Integer.parseInt(requestData.get("numeroVagas"));
		} catch (Exception e){
			numeroVagas = new Integer(-1);
		}
        
		loggerAutenticacao.registraAcao(Acao.ERRO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());
		
		try{
			Usuario user = SistemaUsuarioCRUD.getInstance().cadastraUsuario(dadosPessoais, endereco, numeroVagas);
			DAO.persist(user);
			System.out.println("persistiu!!!");
		} catch (UsuarioCadastradoException e){
			loggerAutenticacao.registraAcao(Acao.ERRO, e.getMessage());
			return badRequest(e.getMessage());
		}
		
		loggerAutenticacao.registraAcao(Acao.USUARIO_CADASTRADO, dadosPessoais.toString(), endereco.toString(), numeroVagas.toString());


		return redirect(routes.HomeController.index());
	}
	
	public Result efetuaLogout(){
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGOUT, SistemaUsuarioLogin.getInstance().getUsuarioLogado().toString());
		SistemaUsuarioLogin.getInstance().efetuaLogout();
		
		return redirect(routes.HomeController.index());
	}

	private Usuario autenticaUsuario() throws DadosInvalidosException, LoginInvalidoException{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String matricula = requestData.get("matricula");
		String email = matricula; // O usuário pode digitar um dos dois no mesmo campo
		String senha = requestData.get("senha");
		
		SistemaUsuarioLogin.getInstance().efetuaLogin(matricula, email, senha);
		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		
		loggerAutenticacao.registraAcao(Acao.EFETUA_LOGIN, usuarioLogado.toString());
		
		return usuarioLogado;
		
	}

	private Result verificaPrimeiroAcessoUsuario(Usuario usuario) {
		loggerAutenticacao.registraAcao(Acao.VERIFICA_PRIMEIRO_ACESSO, usuario.toString());
		return redirect(routes.HomeController.index());
	}
}
