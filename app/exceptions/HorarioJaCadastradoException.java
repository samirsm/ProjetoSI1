package exceptions;

public class HorarioJaCadastradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HorarioJaCadastradoException(){
		super("O horário já foi cadastrado.");
	}
	
	public HorarioJaCadastradoException (String mensagem) {
		super(mensagem);
	}
}
