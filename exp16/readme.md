🧠 O Conceito: Exercício 16 – Métodos com Objetos como Parâmetro: Comunicação e Transferência entre Objetos

Na programação procedural, quando queríamos transferir um valor ou alterar um estado, costumávamos passar variáveis soltas (como int ou double) para uma função. Já na Orientação a Objetos real, as peças do seu software se comunicam passando os próprios objetos inteiros como argumento para os métodos.  

Pense nisso como uma operação bancária real ou um comércio: quando você vai pagar ou transferir algo, você não passa apenas o "número isolado do dinheiro", você passa a sua Conta de origem e a Conta de destino para que o sistema execute a transação entre as duas entidades. Isso garante o desacoplamento e a responsabilidade única: quem gerencia a lógica de transferência é a própria classe, manipulando os objetos envolvidos com segurança.  

💻 Exemplo Prático em Java

Vamos simular um sistema de transferência de saldo entre duas contas bancárias. Repare como o método transferir Para recebe um objeto do tipo ContaBancaria como parâmetro, fazendo com que uma instância interaja diretamente com a outra.