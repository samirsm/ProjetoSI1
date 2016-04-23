package exceptions;

public class DadosInvalidosException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DadosInvalidosException(){
		super("Os dados inseridos são inválidos.");
	}
	
	public DadosInvalidosException (String mensagem) {
		super(mensagem);
	}
}
