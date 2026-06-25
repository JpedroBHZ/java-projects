O Concept: Exercício 18 – Listas e Objetos: Buscando um Objeto Específico Dentro do ArrayList por Atributo

Quando armazenamos dados em uma estrutura dinâmica como o ArrayList, a operação mais comum no desenvolvimento backend é a busca filtrada (como buscar um usuário por ID ou e-mail).  

A utilidade prática deste exercício é aprender a percorrer a lista dinamicamente e aplicar uma estrutura condicional (if) combinada com o método .equals() sobrescrito dentro do próprio objeto. Ao criarmos o equals dentro da classe, ensinamos o Java a comparar o objeto inteiro pelo seu critério de negócio (ex: o título do livro), deixando a lógica de busca do sistema limpa, reutilizável e pronta para os padrões exigidos pelos bancos de dados no Spring Boot.