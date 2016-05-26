package sistemas.mensagens;

public enum Idioma {
	PORTUGUES("pt"), ENGLISH("en"), ESPANOL("es"), ITALIANO("it");

	private String id;

	private Idioma(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public static Idioma defineIdioma(String id) {
		if (id != null) {
			switch (id) {
			case "pt":
				return PORTUGUES;
			case "es":
				return ESPANOL;
			case "en":
				return ENGLISH;
			case "it":
				return ITALIANO;
			default:
				return null;
			}
		}
		return ENGLISH;
	}
}
