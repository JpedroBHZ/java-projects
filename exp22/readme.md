O Conceito: Exercício 22 – Sobrescrita de Métodos (@Override): Modificando Comportamentos nas Classes Filhas   

No exercício anterior, você viu que as classes filhas herdam tudo da classe mãe. Mas e se o método genérico da classe mãe não servir perfeitamente para uma das filhas? No nosso cenário do escritório contábil, imagine que todo contribuinte precisa calcular o imposto, mas a regra de cálculo para uma Pessoa Física é completamente diferente do cálculo para uma Pessoa Jurídica.  

A utilidade prática da Sobrescrita de Métodos (Override) é permitir que uma classe filha reescreva um método herdado da classe mãe. Ao colocar a anotação @Override em cima do método na classe filha, você avisa ao compilador do Java: "Eu sei que esse método já existe lá em cima, mas agora quem manda aqui sou eu e vou ditar uma nova regra de negócio para este quadrado".  

💻 Exemplo Prático em Java

No código, a classe mãe Contribuinte possui o método calcularImposto(). As classes filhas PessoaFisica e PessoaJuridica herdam esse método, mas modificam completamente a lógica interna para aplicar as alíquotas corretas de cada realidade fiscal.