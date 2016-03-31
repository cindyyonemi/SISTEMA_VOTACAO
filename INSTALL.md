# INSTALL RESTful Sys Voting

Criar o banco de dados executando os comandos no arquivo SCRIPT.sql, para isso será necessário criar o database e após exeutar os outros comandos.

Para a rodar o código será necessário baixar o repositório do GIT: https://github.com/cindyyonemi/sysvoting.git
Importar o projeto como maven, startar com o tomcat(utilizei o Tomcat 8).

Acessar a URL: http://localhost:8080/sysvoting
Para acessar os serviços: 
	https://localhost:8080/sysvoting/rest/option/options
	https://localhost:8080/sysvoting/rest/voting/partialPercentage
	https://localhost:8080/sysvoting/rest/voting/insert - Para acessar este serviço será necessário passar um método POST e um JSON na estrutura da entidade Voting.
