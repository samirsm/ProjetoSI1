package sistemas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import exceptions.BairroJaCadastradoException;
import exceptions.DadosInvalidosException;
import exceptions.HorarioJaCadastradoException;
import exceptions.LoginInvalidoException;
import exceptions.UsuarioJaExistenteException;
import play.Logger;
import play.mvc.Controller;
import serializable.StateSaver;
import models.*;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.mensagens.MensagensSistema;

public final class SistemaUsuarioCRUD {
	
	private static final SistemaUsuarioCRUD INSTANCIA = new SistemaUsuarioCRUD();
	private List<Usuario> usuariosAtivados;
	private List<Usuario> usuariosDesativados;
	
	private SistemaUsuarioCRUD(){
		leUsuarios();
	}

	public static SistemaUsuarioCRUD getInstance(){
		return INSTANCIA;
	}
	
	// Cadastro com foto de usuario default
	public Usuario cadastraUsuario(Dados dadosPessoais, Endereco endereco, Integer numeroVagas) throws UsuarioJaExistenteException, DadosInvalidosException {
		Usuario novoUsuario = new Usuario(dadosPessoais, endereco, numeroVagas);
		novoUsuario.setIdioma(Controller.session().get("idioma"));
		novoUsuario.recebeNotificacao(new Notificacao(novoUsuario, TipoNotificacao.BOASVINDAS));
		if (!isUsuarioExistente(novoUsuario))
			usuariosAtivados.add(novoUsuario);
		
		salvaUsuarios();
		return novoUsuario;
	}
	
	
	public Usuario desativaUsuario(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Usuario usuarioASerDesativado = removeUsuario(login, senha);
		usuariosDesativados.add(usuarioASerDesativado);
		return usuarioASerDesativado;
	}
	
	public Usuario consultaUsuario(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		return usuariosAtivados.get(buscaIndexUsuario(login, senha));
	}
	
	List<Usuario> getListaUsuariosAtivados(){
		return usuariosAtivados;
	}
	
	private Usuario removeUsuario(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		int indexUsuarioASerRemovido = buscaIndexUsuario(login, senha);
		
		return usuariosAtivados.remove(indexUsuarioASerRemovido);
	}
	
	private int buscaIndexUsuario(String login, String senha) throws DadosInvalidosException, LoginInvalidoException{
		Dados matriculaSenhaUsuario = new Dados(login, login, senha);
		for (int i = 0; i < usuariosAtivados.size(); i++) {
			if(usuariosAtivados.get(i).getDadosUsuario().equals(matriculaSenhaUsuario))
				return i;
		}
		
		throw new LoginInvalidoException();
	}
	
	public void cadastraHorario(Usuario usuario,TipoCarona tipo, String dia, int hora) throws HorarioJaCadastradoException{
		usuario.adicionarHorario(dia, hora, tipo);
	}
	
	private boolean isUsuarioExistente(Usuario novoUsuario) throws UsuarioJaExistenteException {
		for (Usuario usuario : usuariosAtivados) {
			if(usuario.getEmail().equals(novoUsuario.getEmail()) ||
				usuario.getDadosUsuario().getMatricula().equals(novoUsuario.getDadosUsuario().getMatricula()))
				throw new UsuarioJaExistenteException();
		}
		return false;
	}

	public Usuario getUsuarioPorId(Long id){
		for (int i = 0; i < usuariosAtivados.size(); i++){
			if(usuariosAtivados.get(i).getId().equals(id))
				return usuariosAtivados.get(i);
		}
		return null;
	}

	public void cadastraNovoEndereco(Usuario usuario,String rua, String bairro) throws BairroJaCadastradoException{
		Endereco end = new Endereco(rua, bairro);
		end.save();
      usuario.addEnderecoAlternativo(end);
  }

	public Usuario getUsuarioPorLogin(String login){
		if (login != null){
			for (Usuario usuario : usuariosAtivados) {
				if(login.equals(usuario.getEmail()) || login.equals(usuario.getDadosUsuario().getMatricula()))
					return usuario;
			}
		}
		return null;
	}
	
	public void salvaUsuarios(){
		try {
			StateSaver.save(usuariosAtivados, "usuariosAtivados");
		} catch (IOException e) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao salvar usuarios");
		}
		try {
			StateSaver.save(usuariosDesativados, "usuariosDesativados");
		} catch (IOException e) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao salvar usuarios");
		}
	}
	
	public void leUsuarios(){
		try {
			usuariosAtivados = (List<Usuario>) StateSaver.read("usuariosAtivados");
		} catch (ClassNotFoundException e1) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao ler usuarios");
		} catch (IOException e1) {
			usuariosAtivados = new LinkedList<Usuario>();
		}
		
		
		try {
			usuariosDesativados = (List<Usuario>) StateSaver.read("usuariosDesativados");
		} catch (ClassNotFoundException e) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao ler usuarios");
		} catch (IOException e) {
			usuariosDesativados = new LinkedList<Usuario>();
		}

	}
}
