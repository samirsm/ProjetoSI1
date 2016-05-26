package exceptions;

import play.mvc.Controller;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

public class CaronaJaCadastradaException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public CaronaJaCadastradaException(){
      super(setup());
  }
  
  public CaronaJaCadastradaException(String mensagem) {
      super(mensagem);
  }

    private static String setup(){
        Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma(Controller.session().get("login"));
        return MensagensSistema.CARONA_JA_CADASTRADA[idioma.ordinal()];
    }
}
