package exceptions;

public class UsuarioCadastradoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioCadastradoException(){
		super("O email ou matrícula fornecido(s) já está(ão) em uso");
	}
	
	public UsuarioCadastradoException (String mensagem) {
		super(mensagem);
	}
}