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


}
