O Conceito: Exercício 39 – Conectando as Camadas no Spring: @RestController -> @Service -> @Repository
Lembra do Exercício 34 onde montamos manualmente a engrenagem das 3 camadas em Java puro com a palavra new?

Agora, no Exercício 39, nós juntamos a base da arquitetura com a mágica do Spring Boot!

A utilidade prática aqui é conectar a porta de entrada da Web (@RestController), as regras de negócio (@Service) e a persistência no banco de dados (@Repository) sem instanciar nada com new. O próprio Spring Boot descobre essas classes através das anotações e injeta as dependências automaticamente nos construtores!

💻 Exemplo Prático em Java (Separado por Arquivos)
Veja como as 3 camadas se conectam em um projeto Spring real:

###################################

Explicação:

É muito interessante ver isso agora no SpringBoot porque já vimos um exemplo identico antes feito no Java
Aqui foi mostrado claramente a injeção de dependencia em ação, seguindo a ordem, constroi o repository -> service(injeta repository) -> controller(injeta service) 
Os dados vindo de um postmapping que é o nosso dto, completamente a parte da injeção, servindo apenas como parametro do metodo controller, nada novo
A grande novidade aqui, é que não existe uma execução sequencial das coisas, igual nosso antigo arquivo main, então eu nunca preciso instanciar nada, porque tudo já foi injetado. Tudo funciona quando precisamos, eles ficam esperando a ordem assim que executamos a aplicação, não estamos mais enxergando uma ordem. As coisas funcionam de maneira individual e são chamadas exatamente quando precisam
Tudo é controlado pelo springboot, ele sabe a hora de chamar o controller ou o service, porque parametrizamos tudo com @restcontroller, @service.. 