package sistemas.tiposBuscas;

import java.util.LinkedList;
import java.util.List;

import models.Carona;
import models.Horario;
import models.TipoCarona;
import models.Usuario;
import sistemas.logger.LoggerSistema;
import sistemas.registrosAcoes.Acao;

public class BuscaDefault implements TipoBusca {

	@Override
	public List<Carona> buscaCaronas(List<Carona> caronas, Usuario usuarioLogado, List<Horario> horarios, String bairro, String bairroAlternativo) {
		List<Carona> caronasExibidas = new LinkedList<>();
		for (Carona carona: caronas) {
			new LoggerSistema().registraAcao(Acao.ERRO, carona.toString());
			if (checaCondicaoBaseCarona(carona, usuarioLogado) && comparaBairro(carona, usuarioLogado)){
				
				new LoggerSistema().registraAcao(Acao.ERRO, carona.toString(), "entrou carona");
				for (Horario horario: horarios) {
					new LoggerSistema().registraAcao(Acao.ERRO, horario.toString(), carona.getHorario().toString());
					if(carona.getTipo().equals(TipoCarona.IDA) && carona.getHorario().equals(horario) && carona.getHorario().equals(horario) && carona.getBairro().equals(bairro)){
						caronasExibidas.add(carona);
					}
					if(carona.getTipo().equals(TipoCarona.VOLTA) && carona.getHorario().equals(horario) && carona.getBairro().equals(bairroAlternativo)){
                      caronasExibidas.add(carona);
                  }
				}
			}
		}
		return caronasExibidas;
	}
	
	
	private boolean comparaBairro(Carona carona, Usuario usuarioLogado){
		return carona.getBairro().equals(usuarioLogado.getEndereco().getBairro()) ||
		          carona.getBairro().equals(usuarioLogado.getEnderecoAlternativo().getBairro());
	}

}
