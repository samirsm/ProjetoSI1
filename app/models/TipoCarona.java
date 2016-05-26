package models;

import play.mvc.Controller;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

public enum TipoCarona {
	IDA(MensagensSistema.IDA), VOLTA(MensagensSistema.VOLTA);

	private String[] textoExibicao;

	private TipoCarona(String[] textoExbicao){
		this.textoExibicao = textoExbicao;
	}

	@Override
	public String toString(){
		Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
		return textoExibicao[idioma.ordinal()];
	}

}
