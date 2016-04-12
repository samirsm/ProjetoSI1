package sistemas;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import com.avaje.ebean.Model;

import models.Carona;
import models.Horario;
import models.Notificacao;
import models.TipoCarona;
import models.Usuario;

@Entity
public class SistemaCarona extends Model {
	private static final SistemaCarona SISTEMA_CARONA = new SistemaCarona();
	private ArrayList<Carona> caronas = new ArrayList();
	private SistemaNotificacao notificacao = SistemaNotificacao.getImstance();

	private SistemaCarona() {
	}
	public static SistemaCarona getInstance() {
		return SISTEMA_CARONA;
	}
	
    public List<Carona> buscarCaronas(){
		return caronas;
    }
    
    public void adicionaCarona(Carona carona) {
		caronas.add(carona);
	}
    
    public boolean removeCarona(String id) {
    	int pos  = buscarCaronaPorId(id);
    	if (pos == -1)
    		return false;
    	notificacao.geraNotificacaoCancelamento(caronas.get(pos));
    	caronas.remove(pos);
    	return true;
	}
    
    public void criaCarona(Usuario motorista, Horario horario, TipoCarona tipo, int numeroDeVagas) {
		Carona carona = new Carona(motorista, horario, tipo, numeroDeVagas);
		adicionaCarona(carona);
		motorista.addCaronaMotorista(carona);
    }
    
    private int buscarCaronaPorId(String id) {
    	for (int i = 0; i < caronas.size(); i++)
    		if (caronas.get(i).getId().equals(id))
    			return i;
    	
    	return -1;
	}
    
    public boolean adicionarPassageiros(Carona carona, Usuario passageiro) {
    	if (!carona.isFull()) {
			carona.adicionaPassageiro(passageiro);
			passageiro.addCaronaPassageiro(carona);
			notificacao.geraNotificacaoAceitacao(passageiro, carona);
			return true;
    	}
    	return false;
	}

}