package exceptions;

public class LoginInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginInvalidoException(){
		super("O usuario ou senha estao incorretos.");
	}
	
	public LoginInvalidoException (String mensagem) {
		super(mensagem);
	}
}
