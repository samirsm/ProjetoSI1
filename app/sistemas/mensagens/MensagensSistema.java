package sistemas.mensagens;

public class MensagensSistema {

	//Dias da semana
	public static final String[] SEGUNDA = {"Segunda",
											"Monday",
											"Lunes",
											"Lunedì"};

	public static final String[] TERCA = {"Terça",
											"Tuesday",
											"Martes",
											"Martedì"};

	public static final String[] QUARTA = {"Quarta",
											"Wednesday",
											"Miercoles",
											"Mercoledì"};


	public static final String[] QUINTA = {"Quinta",
											"Thursday",
											"Jueves",
											"Giovedì"};


	public static final String[] SEXTA = {"Sexta",
											"Friday",
											"Viernes",
											"Venerdì"};
	//

	//Mensagens de Tipos de Notificacao
	public static final String[] ACEITACAO = {" aceitou o seu pedido de carona.",
			" accepted your carpool request.",
			" aceptó tu pedido de aventón.",
			" ha accetato la tua richiesta de passaggio."};

	public static final String[] REJEICAO = {" rejeitou o seu pedido de carona.",
			" rejected your carpool request.",
			" rechazó tu pedido de aventón.",
			" ha rifutato la tua richiesta de passaggio."};


	public static final String[] CANCELAMENTO = {" cancelou uma carona na qual você estava cadastrado",
			" cancelled a carpool in which you were registred.",
			" canceló un aventón en lo qual estabas registarado.",
			" ha cancelato un passaggio in cui eri registrato."};

	public static final String[] PEDIDO = {" solicita uma vaga na sua carona.",
			" asks for a seat in your carpool.",
			" solicita un asiento en tu aventón.",
			" chiede un posto nel tuo passaggio"};

	public static final String[] IDIOMA = {"Idioma alterado! Agora você está navegando em português.",
			"Language's changed! Now you're browsing in English.",
			"Idioma cambiado! Ahora navegas en español.",
			"La lingua è stata cambiata! Adesso navighi in italiano."};

	public static final String[] BEM_VINDO = {"Bem-vindo ao Vumbora! Possui dúvidas?" + Strings.LINE_SEPARATOR + "Clique aqui para dar uma olhada em nossas FAQ.",
			"Welcome to Vumbora! Have some doubts?" + Strings.LINE_SEPARATOR + "Click here to check out FAQ section.",
			"Bienvenido a Vumbora! Tienes dudas?" + Strings.LINE_SEPARATOR + "Clica aquí e dales una mirada en nuestras FAQ.",
			"Benvenido al Vumbora! Hai dei dubbi?" + Strings.LINE_SEPARATOR + "Clica qui per guardare le nostre FAQ."};

	public static final String[] AVISO ={"","","",""};
	//

	//Mensagens de Tipo de Carona
	public static final String[] IDA = {"Ida", "Going", "Ida", "Andata"};

	public static final String[] VOLTA = {"Volta", "Returning", "Retorno", "Ritorno"};
	//


	//Mensagens de Exceptions/Aerts
	public static final String[] LOGIN_INVALIDO = {"O usuario ou senha estao incorretos.",
			"User's login or password is wrong.",
			"El usuario o la contraseña está incorrecta.",
			"L'utente oppure la password sono sbagliati."};

	public static final String[] DADOS_INVALIDOS = {"Os dados inseridos são inválidos.",
			"The inserted data is invalid.",
			"Los dados inseridos son inválidos.",
			"I dati inseriti sono invalidi."};

	public static final String[] BAIRRO_JA_CADASTRADO = {"O bairro já foi cadastrado.",
			"This neighbourhood has already been registred.",
			"Esto barrio ya fue registrado.",
			"Questo quartiere già è stato registrato."};

	public static final String[] CARONA_JA_CADASTRADA = {"A carona já existe ou ja existe uma carona para esse horário",
			"This carpool already exists or there is already a carpool for this time schedule.",
			"Lo aventón ya existe o ya existe un aventón para ese horario.",
			"Questo passagio già esiste oppure c'e già un passagio per quest'orario."};

	public static final String[] HORARIO_JA_CADASTRADO = {"Este horário já foi cadastrado.",
			"This time schedule has already been registered.",
			"Esto horario ya fue registrado.",
			"Quest'orario già è stato registrato."};

	public static final String[] USUARIO_JA_EXISTENTE = {"O email ou a matrícula fornecido(s) já está em uso.",
			"The email or the RDM given are already in use.",
			"El email o el RDM dados ya están en uso.",
			"L'email oppure el RDM già è in uso."};

	public static final String[] CADASTRO_SUCESSO = {"Usuario cadastrado com sucesso.",
			"User registered with uccess.",
			"Usuario registrado con éxito.",
			"Utente registrato con successo."};

	public static final String[] CARONA_PUBLICADA = {"Carona publicada com sucesso!",
			"Carpool successfully published.",
			"Aventón publicado con éxito.",
			"Passaggio publicato con successo."};

	public static final String[] ACEITA_PEDIDO = {" foi adicionado à sua carona. O passageiro será notificado.",
			" was added to your carpool. The passenger will be notified.",
			" fue adicionado a tu aventón. El pasajero será notificado.",
			" è stato aggiunto al tuo passaggio. Il passeggero sarà nofificato."};

	public static final String[] RECUSA_PEDIDO = {"Solicitação recusada. O passageiro será notificado.",
			"Request refused. The passenger will be notified.",
			"Solicitación rechazada. El pasajero será notificado.",
			"Solicitazione rifutata. Il passeggero sarà nofificato."};

	public static final String[] PEDIDO_EFETUADO = {"Carona solicitada com sucesso. O motorista será notificado.",
			"Carpool request successful. The driver will be notified.",
			"Aventón solicitado con suceso. El motorista será notificado.",
			"Passaggio richiesto con successo. Il guidante sarà nofificato."};

	public static final String[] ENDERECO_CADASTRADO = {"Novo endereço cadastrado com sucesso.",
			"New address successfully registered.",
			"Nueva dirección registrada con suceso.",
			"Nuovo inderizzo registrato con successo."};
	//
	
	//Mensagens menores
	public static String[] RUA = {"Rua", "Street", "Calle", "Via"};
	
	public static String[] BAIRRO = {"Bairro", "Neighbourhood", "Barrio", "Quartiere"};
	

}
