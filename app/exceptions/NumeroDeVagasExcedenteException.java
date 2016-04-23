package exceptions;

public class NumeroDeVagasExcedenteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NumeroDeVagasExcedenteException(){
		super("O numero de vagas oferecida excede a capacidade máxima.");
	}
	
	public NumeroDeVagasExcedenteException (String mensagem) {
		super(mensagem);
	}
}
