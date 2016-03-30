# RESTful Sys Voting

Conceito de Sistema de votação.

Escolhi desenvolver um sistema orietado a serviços, pois nele é possibilidade de colocar em prática o conhecimento em Java e AngularJS.

Front-end desenvolvido em AngularJS
	Para a interface utilizei o Angular Material, para que o sistema seja responsivo, decidi utilizá-lo pois os mesmo utiliza as especificações do Material Design.
	Para identificar o voto provém de uma pessoa utilizei o angular-captcha.

Back-end desenvolvido em Java
	Para os serviços RESTful foram utilizados: resteasy, jackson, spring, hibernate e posgresql.
	 -Para o banco de dados utilizei o postgresql.
	 -Para o mapeamento das entidades nas classes adotei o hibernate.
	 -Para as conversões para JSON e objeto usei o jackson.
	 -Para as injeções de dependencias o spring. 
	
Gostaria de melhorar o sistema, utilizar o recaptcha do google para a validar se quem esta executando a ação é um humano, criar um sistema que além de possibilitar o voto, possibilite o usuário a criar uma nova eleição.

Não consegui automatizar os testes unitários.