package models;

public class Horario {
	public static final String[] DIAS_DA_SEMANA = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta" };
	public static final int[] HORAS = {8, 10, 12, 14, 16, 18};
	private String dia;
	private int hora;

	public Horario() { 
	
	}
	public Horario(String dia, int hora) {
		this.dia = dia;
		this.hora = hora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Dia: " + dia + " Hora: " + hora;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Horario))
			return false;
		Horario outroHorario = (Horario) obj;
		
		return outroHorario.getDia().equals(dia) && (outroHorario.getHora() == hora);
	}

}