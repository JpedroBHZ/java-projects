O Conceito: Exercício 22 – Sobrescrita de Métodos (@Override): Modificando Comportamentos nas Classes Filhas   

No exercício anterior, você viu que as classes filhas herdam tudo da classe mãe. Mas e se o método genérico da classe mãe não servir perfeitamente para uma das filhas? No nosso cenário do escritório contábil, imagine que todo contribuinte precisa calcular o imposto, mas a regra de cálculo para uma Pessoa Física é completamente diferente do cálculo para uma Pessoa Jurídica.  

A utilidade prática da Sobrescrita de Métodos (Override) é permitir que uma classe filha reescreva um método herdado da classe mãe. Ao colocar a anotação @Override em cima do método na classe filha, você avisa ao compilador do Java: "Eu sei que esse método já existe lá em cima, mas agora quem manda aqui sou eu e vou ditar uma nova regra de negócio para este quadrado".  

💻 Exemplo Prático em Java

No código, a classe mãe Contribuinte possui o método calcularImposto(). As classes filhas PessoaFisica e PessoaJuridica herdam esse método, mas modificam completamente a lógica interna para aplicar as alíquotas corretas de cada realidade fiscal.

#Explicação do chat 

@Override serve tanto pra alterar, quanto para cumprir um contrato que foi estabelecido?

Para o compilador do Java, a anotação @Override serve como um selo de segurança que diz: "Atenção, Java! Eu estou fazendo uma das duas coisas abaixo, então valide se o método na classe mãe existe mesmo":

Alterar/Modificar: Mudar o comportamento de um método que já funcionava na classe mãe (classe concreta).

Cumprir o contrato: Dar vida a um método que a classe mãe apenas prometeu que existiria (classe abstrata ou interface).

Se você errar o nome do método por uma letra (escrever calcularImpostos com "s" no final, por exemplo), o Java vai olhar o @Override, vai ver que na classe mãe não existe esse método com "s" e vai te dar um erro de compilação na hora. Isso evita que você crie um método novo sem querer ao invés de substituir o da mãe.

Obs: Isso de classe concreta ou abstrata é a diferença de uma classe que faz algo de fato, para uma que só serve como classe generica, no exemplo temos uma classe concreta, mas poderia ser abstrata uma vez que o metodo dela está 0.0 Porém poderiamos colocar um valor 0.10 nela e tbm usar a classe mae como classe de calculo