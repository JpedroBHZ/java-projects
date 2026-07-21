O Conceito: Exercício 35 – Configuração Spring: Usando @Component do Spring para Gerenciamento de Beans
No Exercício 34, você teve o trabalho manual de criar o Repository, criar o Service, criar o Controller e conectar um dentro do outro usando o operador new e os construtores. Em uma API real com centenas de classes, fazer esse "trabalho de encanador" manualmente deixaria o código insustentável.

É exatamente aqui que o Spring Boot entra como um passe de mágica!

A utilidade prática do Container do Spring (Inversão de Controle - IoC) é assumir a responsabilidade de instanciar e conectar os objetos para você. Quando você coloca a anotação @Component (ou suas especializações como @Service e @Repository) no topo de uma classe, você está carimbando aquela classe para o Spring: "Spring, cuide do ciclo de vida desta classe! Crie a instância dela (que chamamos de Bean) e guarde no seu container".

Assim, quando outra classe precisar desse serviço no construtor, o Spring injeta automaticamente, sem você precisar escrever uma única linha com a palavra new no seu método main.

💻 Exemplo Prático em Java (Simulação do Mecanismo do Spring)

Como ainda estamos rodando scripts Java puros para fixar o conceito de orientação a objetos, vamos simular o comportamento da anotação @Component e do Container de Beans do Spring para você ver exatamente como o framework pensa por baixo dos panos.