package sistemas.mensagens;

public class MensagensSistema {

	//Mensagens de Tipos de Notificacao
	public static final String[] ACEITACAO = {" aceitou o seu pedido de carona.",
			" accepted your carpool request.",
			" aceptó tu pedido de aventón.",
			" ha accetato la tua richiesta de passeggio."};

	public static final String[] REJEICAO = {" não aceitou o seu pedido de carona.",
			" has not accepted your carpool request.",
			" no aceptó tu pedido de aventón.",
			" non ha accetato la tua richiesta de passeggio."};


	public static final String[] CANCELAMENTO = {" cancelou uma carona na qual você estava cadastrado",
			" cancelled a carpool in which you were registred.",
			" canceló un aventón en lo qual estabas registarado.",
			" ha cancelato un passeggio in cui eri registrato."};

	public static final String[] PEDIDO = {" solicita uma vaga na sua carona.",
			" asks for a seat in your carpool.",
			" solicita un asiento en tu aventón.",
			" chiede un seggliolino nel tuo passeggio"};
	//

	//Mensagens de Tipo de Carona
	public static final String[] IDA = {"Ida", "Going", "Ida", "Andata"};

	public static final String[] VOLTA = {"Volta", "Returning", "Retorno", "Ritorno"};
	//

	//Mensagens de Exceptions
	public static final String[] LOGIN_INVALIDO = {"O usuario ou senha estao incorretos.",
			"User's login or password is wrong.",
			"El usuario o la contraseña está incorrecta.",
			"L'utente oppure il password è sbagliato."};

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
			"Questo passegio già esiste oppure c'e già un passegio per quest'orario."};

	public static final String[] HORARIO_JA_CADASTRADO = {"O numero de vagas oferecida excede a capacidade máxima.",
			"This time schedule has already been registered.",
			"Esto horario ya fue registrado.",
			"Quest'orario già è stato registrato."};

	public static final String[] USUARIO_JA_EXISTENTE = {"O email ou a matrícula fornecido(s) já está em uso.",
			"The email or the RDM given are already in use.",
			"El email o el RDM dados ya están en uso.",
			"L'email oppure el RDM già è in uso."};
	//

}
