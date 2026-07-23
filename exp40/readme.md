O Conceito: Exercício 40 – Introdução ao JPA: Interfaces que Estendem JpaRepository para Persistência no Banco H2
Até o Exercício 39, nós salvávamos os dados dentro de uma List no Repository. O problema é que, se a aplicação desligasse ou reiniciasse, todos os dados sumiam.

No mundo real, usamos o JPA (Java Persistence API) e o Hibernate para conectar nosso código Java a um banco de dados relacional.

A grande mágica do Spring Data JPA é que você não precisa escrever comandos SQL (como INSERT INTO, SELECT * FROM). Você apenas cria uma Interface que herda de JpaRepository, e o Spring gera automaticamente todas as operações de banco de dados (salvar, buscar por ID, deletar, listar) para você!

Neste exercício, usaremos o H2 Database, um banco de dados relacional em memória nativo do Spring Boot, perfeito para testes e desenvolvimento.

#########################

Explicação

Vamos analisar por partes toda a estrutura
Inicialmente precisamos fazer os imports das dependencias no aquivo pom, tanto do jpa, web, e o banco h2, bem simples, só copiar e sincronizar o maven
A conexão com o banco é a configuração padrão do arquivo properties, onde é configuramos o hibernate para criar os campos automaticamente
O objeto empresa e o dto não tem segredo, é apenas os atributos, construtores e getters e setters, sendo empresa nossa @entity, com campo @Id
Depois em vez de uma classe concreta, criamos uma Interface dentro do repository que herda (extends) JpaRepository<Empresa, Long>. O Spring gera automaticamente os métodos de save, findAll... É muito util criar essas interfaces que herdam metodos
Depois configuramos nossos metodos de alteração dentro do service, injetando nosso repository nele
Depois configuramos as rotas de postmapping e getmapping, que vão invocar nossos metodos do service, então injetamos ele no controller também
Por fim configuramos para que o cadastro receba como parametro o dto(obejto enviado pelo usuario) para que salve o objeto real no banco.