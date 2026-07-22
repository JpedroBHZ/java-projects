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

##################################
Acho que entendi o que foi feito

Só para deixar bem CLARO, a injeção de dependencia serve para que 1 classe tenha metodos que usam os metodos de outra classe

Exemplo é criado o repository que tem metodos que ALTERAM o banco, esse é o trabalho dele

O service tem metodos que validam e tratam os dados, porem depois dele fazer isso ele precisa invocar o metodo de gravar no banco do repository, dentro do metodo de validação dele

O controller vai fazer algo similar, vai pegar os dados passados pra ele no proprio metodo, vai chamar o metodo do service, e depois o service vai fazer o passo da linha de cima

Basicamente estamos pegando metodos e chamando metodos dependentes deles em cascata, isso é a base de tudo o que estamos fazendo

O dto é totalmente a parte quase disso tudo, ele é um objeto com menos atributos que está sendo passado para o controller dentro de um parametro do metodo de coletar dados

Só depois na hora de validar que ele é transformado no objeto do banco 

