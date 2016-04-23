package exceptions;

public class CaronaJaCadastradoException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  public CaronaJaCadastradoException(){
      super("A carona já existe ou ja existe uma carona para esse horário");
  }
  
  public CaronaJaCadastradoException (String mensagem) {
      super(mensagem);
  }
}
