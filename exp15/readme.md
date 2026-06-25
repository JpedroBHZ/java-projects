🧠 O Conceito: Exercício 15 – Associação de Objetos: Relacionando Duas Classes Diferentes

Até agora, nossas peças de Lego eram isoladas: uma classe Livro ou uma classe Carro que guardavam apenas tipos primitivos ou Strings. Mas, no mundo real e na arquitetura de APIs, os objetos precisam se relacionar. É aqui que entra a Associação.  

A utilidade prática da associação é permitir que um atributo de uma classe seja, na verdade, um objeto de outra classe. Em vez de a classe Carro ter apenas uma String nomeMotorista, ela pode ter um atributo do tipo Motorista (que é uma classe própria, com CPF, CNH, idade, etc.).  

Isso reflete perfeitamente o banco de dados que você vai usar no Spring Boot: uma tabela de Pedidos que se relaciona com uma tabela de Clientes.
