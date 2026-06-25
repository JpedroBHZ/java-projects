🧠 O Conceito: Exercício 15.5 [Apêndice Arquitetural] – O Princípio do Desacoplamento e Modelagem Eficiente (Livro e Dono)
Na Orientação a Objetos e no desenvolvimento de APIs com bancos de dados (como você verá no Spring Boot), a forma como estruturamos as relações entre os objetos dita se o nosso sistema será leve e escalável ou pesado e difícil de manter.

A grande utilidade prática do Desacoplamento é evitar que uma classe fique "refém" da outra. Para decidir quem deve guardar a referência de quem, usamos a regra mental de identificar quem é a entidade principal (que permanece) e quem sofre a ação (o lado mais leve).

Quem permanece e quem sofre a ação?
O Dono (A Pessoa): Permanece no sistema. Ele se cadastra, faz login, altera a senha, atualiza o endereço. A existência dele na sua API não depende de ter ou não um livro.

O Livro: É o lado mais "leve", o objeto que sofre a ação. Ele é comprado, é doado, é vendido, é emprestado, é perdido ou é trocado de estante.