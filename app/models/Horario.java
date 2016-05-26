package models;

import sistemas.SistemaUsuarioLogin;
import sistemas.mensagens.*;

public class Horario {
	private int dia;
	private int hora;
	private String[][] dias = {MensagensSistema.SEGUNDA, MensagensSistema.TERCA, MensagensSistema.QUARTA, MensagensSistema.QUINTA, MensagensSistema.SEXTA};

	public Horario() { 
	
	}
	public Horario(String dia, int hora) {
		setDia(dia);
		this.hora = hora;
	}

	public String getDia() {
        Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
		return dias[dia - 2][idioma.ordinal()];
	}
	
	public String getDiaAbreviado() {
      Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
      String str =  (dias[dia - 2][idioma.ordinal()]).substring(0,3);
      return str;
  }

    public int getNumeroDia(){
        return this.dia;
    }

	public void setDia(String dia) {
        Idioma idioma = SistemaUsuarioLogin.getInstance().getIdioma();
        for(int i =0; i < 5; i++) {
            if (dia.equals(dias[i][idioma.ordinal()]))
                this.dia = i + 2;
        }
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Dia: " + getDia() + " Hora: " + hora;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Horario))
			return false;
		Horario outroHorario = (Horario) obj;
		
		return (outroHorario.getNumeroDia() == dia) && (outroHorario.getHora() == hora);
	}

}