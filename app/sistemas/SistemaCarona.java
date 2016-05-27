package sistemas;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

import com.avaje.ebean.config.dbplatform.LimitOffsetSqlLimiter;
import exceptions.CaronaJaCadastradaException;
import models.Carona;
import models.Horario;
import models.TipoCarona;
import models.Usuario;
import play.mvc.Controller;
import serializable.StateSaver;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.tiposBuscas.BuscaDefault;
import sistemas.tiposBuscas.TipoBusca;

public class SistemaCarona{
	private static final SistemaCarona INSTANCIA = new SistemaCarona();
	private List<Carona> caronasSistema;
	private List<Carona> listaCaronasSolicitadas;
	private TipoBusca tipo;
	
	private SistemaCarona() {
		leCaronas();
		listaCaronasSolicitadas = new LinkedList<>();
		tipo = new BuscaDefault();
	}
	
	public static SistemaCarona getInstance() {
		return INSTANCIA;
	}
	
	public List<Carona> buscarCaronasDefault () {
		setTipoBusca(new BuscaDefault());
		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(Controller.session().get("login"));
		List<Horario> horariosIda = usuarioLogado.getHorariosIda();
		List<Horario> horariosVolta = usuarioLogado.getHorariosVolta();
		
		List<Horario> horarios = new LinkedList<>();
		horarios.addAll(horariosIda);
		horarios.addAll(horariosVolta);
		
		LoggerSistema loggerAutenticacao = new LoggerSistema();
		loggerAutenticacao.registraAcao(Acao.ERRO, horarios.toString());
		loggerAutenticacao.registraAcao(Acao.ERRO, Arrays.toString(horariosIda.toArray()));
		loggerAutenticacao.registraAcao(Acao.ERRO, Arrays.toString(horariosVolta.toArray()));
		listaCaronasSolicitadas = tipo.buscaCaronas(getAllCaronas(), usuarioLogado, horarios, usuarioLogado.getEndereco().getBairro(), usuarioLogado.getEnderecoAlternativo().getBairro()); 
		
		return listaCaronasSolicitadas;
	}
	
	public List<Carona> getListaPesquisa() {
		return listaCaronasSolicitadas;
	}
	
	public List<Carona> getListaPesquisaAtualizada() {
		listaCaronasSolicitadas.clear();
		
		return buscarCaronasDefault();
	}

	private void setTipoBusca(TipoBusca tipo) {
		this.tipo = tipo;
	}
    
    public List<Carona> getAllCaronas() {
		return caronasSistema;
    }
    
    private void adicionaCarona(Carona carona) throws CaronaJaCadastradaException {
    	List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(Controller.session().get("login")).getCaronas();
    	if(!caronasSistema.contains(carona) && !temCaronaNoMesmoHorario(carona,caronasUsuarioLogado)){
    		caronasSistema.add(carona);
    		caronasUsuarioLogado.add(carona);
    	}else
    	  throw new CaronaJaCadastradaException();
	}
    
    private boolean temCaronaNoMesmoHorario(Carona carona, List<Carona> caronasUsuarioLogado) {
        for (Carona carona2 : caronasUsuarioLogado) {
          if(carona.getHorario().equals(carona2.getHorario()))
            return true;
        }
      return false;
    }

    public Carona removeCarona(Long id) {
    	List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado(Controller.session().get("login")).getCaronas();
    	int pos = buscarIndiceCaronaPorId(id);
    	if (pos == -1)
    		return null;
    	//sistemaNotificacoes.geraNotificacaoCancelamento(listaCaronasSolicitadas.get(pos));
    	return caronasUsuarioLogado.remove(pos);
	}
    
    public Carona criaCarona(Usuario motorista, Horario horario, TipoCarona tipo, int numeroDeVagas) throws CaronaJaCadastradaException {
		Carona carona = new Carona(motorista, horario, tipo, numeroDeVagas);
		adicionaCarona(carona);
		return carona;
    }
    
    private int buscarIndiceCaronaPorId(Long id) {

    	for (int i = 0; i < caronasSistema.size(); i++){
    		if(caronasSistema.get(i).getId().equals(id))
    			return i;
    	}
    	
    	return -1;
	}
    
    public void limpaListaCaronaSolicitadas(){
      listaCaronasSolicitadas.clear();
    }
    
    public Carona buscarCaronaPorId(Long id){
    	int i = buscarIndiceCaronaPorId(id);
    	
    	return caronasSistema.get(i);
    }
    
    public void adicionarPassageiros(Carona carona, Usuario passageiro) {
			carona.adicionaPassageiro(passageiro);
			passageiro.adicionaCarona(carona);
	}
    
	public void salvaCaronas(){
		try {
			StateSaver.save(caronasSistema, "caronas");
		} catch (IOException e) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao salvar caronas");
		}
	}
	
	public void leCaronas(){
		try {
			caronasSistema = (List<Carona>) StateSaver.read("caronas");
		} catch (ClassNotFoundException e1) {
			new LoggerSistema().registraAcao(Acao.ERRO, "Erro ao ler caronas");
		} catch (IOException e1) {
			caronasSistema = new LinkedList<Carona>();
		}
	}
}