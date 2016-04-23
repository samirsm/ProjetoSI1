package sistemas.tiposBuscas;

import java.util.List;

import models.Carona;
import models.Horario;
import models.Usuario;

public interface TipoBusca {
	
	public List<Carona> buscaCaronas(List<Carona> caronas, Usuario usuarioLogado, List<Horario> horarios, String bairro, String bairroAlternativo);
	
	public default boolean checaCondicaoBaseCarona (Carona carona, Usuario usuarioLogado){
		return !(carona.getMotorista().equals(usuarioLogado)) && !carona.isFull()
		&& !carona.hasPassageiro(usuarioLogado);
	}
	
}
