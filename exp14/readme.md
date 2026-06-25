🧠 O Conceito: Exercício 14 – Métodos de Objeto: Criando Funções de Manipulação Interna

Até agora, nossas classes têm atributos (dados) e métodos simples de leitura ou escrita (getters e setters). Mas o verdadeiro poder da Orientação a Objetos aparece quando criamos métodos de negócio. Esses métodos são funções que executam regras complexas manipulando o estado interno do próprio objeto.  

A utilidade prática é encapsular a lógica onde o dado realmente mora. Em vez de pegar os dados do objeto, fazer uma conta do lado de fora (no arquivo Main.java, por exemplo) e depois salvar o resultado de volta, nós simplesmente pedimos para o objeto fazer a conta sozinho. Ele "cuida do seu quadrado".  

Abordagem Procedural (Fora do objeto): if (carro.getVelocidade() > 100) { ... }

Abordagem Orientada a Objetos (Dentro do objeto): carro.acelerar();