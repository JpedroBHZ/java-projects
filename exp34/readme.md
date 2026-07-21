O Conceito: Exercício 34 – Simulação de Repositório: Criando uma Classe Mock para Simular Persistência em Memória   

Até agora, os dados que o seu Service valida ficam soltos no ar e somem assim que a execução do método acaba. No mundo real, após passar pelas regras de negócio do Service, o dado precisa ser salvo em um Banco de Dados (como PostgreSQL ou MySQL).

Para fazer isso, o Spring Boot utiliza uma terceira camada chamada Repository (ou Camada de Acesso a Dados / Persistência).

A utilidade prática da camada Repository é isolar todos os comandos de banco de dados (os famosos comandos SQL como INSERT, SELECT, UPDATE). O seu Service não quer saber se o banco de dados é em nuvem, se usa SQL ou NoSQL; ele só quer falar: "Repository, salve essa Empresa para mim".

Como ainda não conectamos um banco de dados real, neste exercício nós criamos um Repository simulado (Mock) usando um ArrayList na memória RAM do computador para agir como o nosso banco de dados temporário.

Exemplo Prático em Java

Agora nós temos o fluxo completo de uma API real:

O DTO traz os dados da Web.  
O Controller recebe o DTO e passa para o Service.  
O Service valida, transforma o DTO na Entidade Empresa real e manda para o Repository.  
O Repository salva a Entidade na lista (nosso "banco de dados" em memória).