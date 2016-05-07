package sistemas;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

import exceptions.*;
import exceptions.CaronaJaCadastradaException;
import models.Carona;
import models.Horario;
import models.TipoCarona;
import models.Usuario;
import sistemas.logger.LoggerSistema;
import sistemas.logger.registrosAcoes.Acao;
import sistemas.tiposBuscas.BuscaDefault;
import sistemas.tiposBuscas.TipoBusca;

@Entity
public class SistemaCarona extends Model {
	private static final SistemaCarona INSTANCIA = new SistemaCarona();
	private List<Carona> caronasSistema;
	private List<Carona> listaCaronasSolicitadas;
	private TipoBusca tipo;
	private SistemaNotificacao sistemaNotificacoes = SistemaNotificacao.getInstance();
	
	private SistemaCarona() {
		caronasSistema = new LinkedList<>();
		listaCaronasSolicitadas = new LinkedList<>();
		tipo = new BuscaDefault();
	}
	
	public static SistemaCarona getInstance() {
		return INSTANCIA;
	}
	
	public List<Carona> buscarCaronasDefault () {
		setTipoBusca(new BuscaDefault());
		Usuario usuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado();
		List<Horario> horariosIda = usuarioLogado.getHorariosIda();
		List<Horario> horariosVolta = usuarioLogado.getHorariosVolta();
		
		List<Horario> horarios = new LinkedList<>();
		horarios.addAll(horariosIda);
		horarios.addAll(horariosVolta);
		
		LoggerSistema loggerAutenticacao = new LoggerSistema();
		loggerAutenticacao.registraAcao(Acao.ERRO, horarios.toString());
		
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
    	List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado().getCaronasMotorista();
    	if(!caronasSistema.contains(carona) && !temCaronaNoMesmoHorario(carona,caronasUsuarioLogado)){
    	      caronasSistema.add(carona);
    	      caronasUsuarioLogado.add(carona);
    	}else
    	  throw new CaronaJaCadastradaException();
	}
    
   

    private boolean temCaronaNoMesmoHorario(Carona carona,
        List<Carona> caronasUsuarioLogado) {
        for (Carona carona2 : caronasUsuarioLogado) {
          if(carona.getHorario().equals(carona2.getHorario()))
            return true;
        }
      return false;
    }

    public Carona removeCarona(Long id) {
    	List<Carona> caronasUsuarioLogado = SistemaUsuarioLogin.getInstance().getUsuarioLogado().getCaronasMotorista();
    	int pos = buscarIndiceCaronaPorId(id);
    	if (pos == -1)
    		return null;
    	sistemaNotificacoes.geraNotificacaoCancelamento(listaCaronasSolicitadas.get(pos));
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
			passageiro.adicionaCaronaPassageiro(carona);
	}
}