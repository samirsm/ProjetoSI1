package exceptions;

import play.mvc.Controller;
import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.Idioma;
import sistemas.mensagens.MensagensSistema;

public class BairroJaCadastradoException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public BairroJaCadastradoException(){
      super(setup());
  }
  
  public BairroJaCadastradoException (String mensagem) {
      super(mensagem);
  }

    private static String setup(){
    	Idioma idioma = Idioma.defineIdioma(Controller.session().get("idioma"));
        return MensagensSistema.BAIRRO_JA_CADASTRADO[idioma.ordinal()];
    }

}
