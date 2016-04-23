package exceptions;

public class BairroJaCadastradoException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public BairroJaCadastradoException(){
      super("O bairro já foi cadastrado.");
  }
  
  public BairroJaCadastradoException (String mensagem) {
      super(mensagem);
  }
}
