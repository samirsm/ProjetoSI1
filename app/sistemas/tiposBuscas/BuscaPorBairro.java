package sistemas.tiposBuscas;

import java.util.LinkedList;
import java.util.List;

import models.Carona;
import models.Horario;
import models.Usuario;

public class BuscaPorBairro implements TipoBusca {

	@Override
	public List<Carona> buscaCaronas(List<Carona> caronas, Usuario usuarioLogado, List<Horario> horarios,
			String bairro, String bairroAlternativo) {
		List<Carona> caronasExibidas = new LinkedList<>();
		
		for (Carona carona : caronas) {
			if (checaCondicaoBaseCarona(carona, usuarioLogado) && carona.getBairro().equals(bairro)){
				caronasExibidas.add(carona);
			}
		}
		
		return caronasExibidas;
	}

}
