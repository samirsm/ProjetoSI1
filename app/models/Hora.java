package models;

public enum Hora {
	OITO(8), DEZ(10), DOZE(12), CATORZE(14), DEZESSEIS(16), DEZOITO(18);
	
	public int hora;
	private Hora(int hora) {
		this.hora = hora;
	}

}
