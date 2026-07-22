O Conceito: Exercício 36 – Seu Primeiro Endpoint REST: Criando um Método com @GetMapping

Chegamos ao momento em que seu código Java se conecta oficialmente com o mundo Web! 

No desenvolvimento de APIs REST com Spring Boot, uma aplicação não fica apenas rodando internamente no terminal. Ela fica "escutando" em uma porta de rede (como a famosa 8080), aguardando que clientes (como um aplicativo no celular, um sistema em React/Angular ou o navegador) façam requisições HTTP para buscar ou enviar dados.

A utilidade prática do Endpoint REST criado com @GetMapping é expor uma rota de leitura de dados.

A anotação @RestController avisa ao Spring: "Esta classe vai receber requisições da Web e devolver as respostas no formato padronizado JSON".  

A anotação @GetMapping("/rota") define a URL que o cliente precisa acessar via navegador/HTTP GET para solicitar/consultar informações do seu sistema (ex: buscar a lista de clientes, consultar o status da API ou puxar os dados de uma empresa).

💻 Exemplo Prático em Java (Sintaxe Real Spring Boot)A partir deste exercício, já usamos a sintaxe oficial do Spring Boot. Veja como é simples criar a porta de entrada para consultar os dados do nosso escritório contábil:

#########################

Explicação: 
Criou o dto que é meu objeto que vai receber meus atributos não sensiveis
Criou o controller para gerenciar isso, como? configurando a rota principal e as subrotas com metodos responsaveis por mostrar uma mensagem de exemplo e outro que instancia meu dto, transformando automaticamente ele em um Json que pode ser visualizado acessando a rota