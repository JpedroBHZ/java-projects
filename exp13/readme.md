🧠 O Conceito: Exercício 13 – Encapsulamento: Protegendo Atributos com Getters/Setters e Validação

Até agora, qualquer parte do código podia mexer diretamente nos atributos dos nossos objetos (livro.paginas = -500; ou carro.ano = 2035;). Deixar os dados expostos assim quebra o princípio de que cada classe deve "cuidar estritamente do seu quadrado" e ter total controle sobre suas próprias regras.  

O Encapsulamento é a técnica de "esconder" os atributos de uma classe (colocando o modificador de acesso private neles) para que ninguém de fora possa alterá-los diretamente. Para que o mundo externo possa interagir com esses dados, nós criamos canais controlados:

Getters (Get = Pegar): Métodos públicos criados exclusivamente para ler o valor de um atributo.

Setters (Set = Definir/Alterar): Métodos públicos criados para alterar o valor de um atributo.

A grande utilidade prática do Setter é que ele funciona como uma alfândega. Antes de aceitar a mudança do dado, você pode colocar uma estrutura condicional (if) para validar se a alteração faz sentido. Se alguém tentar colocar uma quantidade negativa de páginas em um livro, o seu código barra a operação ali mesmo.