Equipe 5:

Dandara Maria 
Hugo Gabriel
Paulo Vinícius Soares
Pedro Paulo Freire
Samir Silva

>> Detalhamento das telas <<

Tela login/cadastro <telaLoginCadastro.html>
	Essa tela contempla a US 01;
	Além disso, a tela fornece a possibilidade de autenticação do usuário através do login;
	Alguns campos adicionais foram acrescentados para tratar corretamente outras User Stories, como o caso do campo de senha e foto.
	Ao se cadastrar, o usuário segue para a tela de cadastro de horários.

Tela cadastro de horários e bairros <cadastroHorario.html>
	Essa tela contempla as US 02 e US 05;
	O usuário escolhe os horários de ida/volta, além de escolher o bairro de destino.

OBS.: As telas a seguir partilham de um layout em comum.
	- Na barra lateral esquerda, temos um menu de navegação contendo "Home", "Solicitações", "Agendamentos de carona" e "Meu perfil". "Meu perfil" e "Agendamentos de carona" serão implementados em versões futuras.
	- Na barra lateral direita, temos as caronas do usuário (motorista ou passageiro) exibidas por data. Nela podemos visualizar o tipo e horário com maior enfoque. Para um maior detalhamento da carona, o usuário deve consultar a tela de "Solicitações".

Tela principal do Motorista <viewMotorista.html>
	Essa tela contempla as US 03 e US 04;
	O motorista consegue ver todos os pedidos de carona através de uma lista; A partir dela, ele consegue recusar ou aceitar os pedidos. Os pedidos recusados saem da lista principal e deixam de ser exibidos na tela.
	É possível verificar o seu perfil a partir do ícone no canto superior direito e acessar as configurações.
	
	Legenda dos ícones:
		- Pendente: A carona solicitada pelo passageiro ainda não foi respondida.
		- Confirmado: A carona está confirmada, mas pode ser cancelada a qualquer momento pelo motorista. Caso ocorra o cancelamento, o passageiro recebe uma notificação.
		- Cancelado: A carona foi cancelada pelo motorista. Essa ação não pode ser desfeita.

	Legenda dos botões:
		- Vumbora: Aceitar o pedido de carona. O passageiro é notificado.
		- Negar: Recusa o pedido de carona. O passageiro também é notificado.
		- Cancelar: O motorista pode cancelar a carona a qualquer momento, de forma que ao clicar neste botão, tal ação não poderá ser desfeita.

Tela principal do Passageiro <viewPassageiro.html>
	Essa tela contempla as US 06 e US 07;
	O passageiro consegue ver todas as ofertas de carona através de uma lista; A lista é gerada a partir de uma busca, essa busca pode ocorrer por data ou horário e tipo de carona (ida ou volta);
	O passageiro pode solicitar a carona clicando no botão "pedir" e será encaminhado para a tela de agendamento.
	O passageiro recebe notificações quando alguém aceita ou recusa sua carona, essas notificações ficam no canto superior esquerdo, no símbolo do sino.
	De forma similar à tela do motorista, o passageiro também pode verificar as configurações a partir do ícone ao lado do sino.

Tela de agendamento de carona <telaAgendamentosCaronaPassageiro.html>
	Essa tela contempla a US08;
	O passageiro é levado a essa tela para que haja a confirmação do pedido de carona;
	Nesta tela é possível ver maiores detalhes da carona, tais como tipo, horário, número de vagas e destino;
	É possível confirmar a carona ou voltar para a tela inicial do passageiro.

=========================================================================================

Tela de solicitações - Motorista <solicitacoesMotorista.html>
	Nesta tela é possível visualizar com mais detalhes as caronas que foram aceitas, recusadas ou pendentes.
	As caronas recusadas também ficam registradas nesta tela.

Tela de solicitações - Passageiro <solicitacoesPassageiro.html>
	A tela é similar à view do motorista, mas com um teor de consulta. O passageiro não pode interagir, somente verificar os status de seus pedidos de carona.

