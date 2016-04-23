package exceptions;

public class NumeroDeVagasInsuficienteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NumeroDeVagasInsuficienteException(){
		super("O numero de vagas é insuficiente para oferecer tal carona.");
	}
	
	public NumeroDeVagasInsuficienteException (String mensagem) {
		super(mensagem);
	}
}
