O Conceito: Exercício 35 – Configuração Spring: Usando @Component do Spring para Gerenciamento de Beans
No Exercício 34, você teve o trabalho manual de criar o Repository, criar o Service, criar o Controller e conectar um dentro do outro usando o operador new e os construtores. Em uma API real com centenas de classes, fazer esse "trabalho de encanador" manualmente deixaria o código insustentável.

É exatamente aqui que o Spring Boot entra como um passe de mágica!

A utilidade prática do Container do Spring (Inversão de Controle - IoC) é assumir a responsabilidade de instanciar e conectar os objetos para você. Quando você coloca a anotação @Component (ou suas especializações como @Service e @Repository) no topo de uma classe, você está carimbando aquela classe para o Spring: "Spring, cuide do ciclo de vida desta classe! Crie a instância dela (que chamamos de Bean) e guarde no seu container".

Assim, quando outra classe precisar desse serviço no construtor, o Spring injeta automaticamente, sem você precisar escrever uma única linha com a palavra new no seu método main.

💻 Exemplo Prático em Java (Simulação do Mecanismo do Spring)

Como ainda estamos rodando scripts Java puros para fixar o conceito de orientação a objetos, vamos simular o comportamento da anotação @Component e do Container de Beans do Spring para você ver exatamente como o framework pensa por baixo dos panos.

#####################################

Explicativa do exemplo 

É interessante notar que por ser um exemplo o repository só traz um valor 0.06 que é armazenado numa variavel dentro do service para ser usado no calculo
Mas o principal do exercicio é mostrar que sim, ouve injeção de dependencia que no caso fez o service acessar o metodo do repository para pegar esse valor
Porém o interessante é como ele fez isso no main, porque ao invés dele instanciar o repository e depois o service passando o repository pelo construtor
Algo assim:
EmpresaRepository repository = new EmpresaRepository();
EmpresaService service = new EmpresaService(repository);

Ele só usou a injeção de dependencia para pegar todos os metodos que o service precisava em uma unica linha:
TributacaoService service = SpringContainerFake.getTributacaoService();

E depois usou o metodo do service feliz da vida, sem precisar nunca sequer ter instanciado o repository no main