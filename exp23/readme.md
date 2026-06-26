O Conceito: Exercício 23 – Polimorfismo: Tratando Objetos Diferentes de Forma Genérica

O Polimorfismo (que significa "muitas formas") é a coroa de ouro da Orientação a Objetos e o segredo por trás do funcionamento do Spring Boot. No exercício anterior, você viu que classes filhas podem reescrever comportamentos. O polimorfismo é o poder de tratar todas as classes filhas de forma genérica usando apenas o tipo da classe mãe.

Imagine que o seu escritório contábil processe a folha de impostos do mês. Se você tiver 500 empresas (PJ) e 300 autônomos (PF), você não cria uma lista para cada um e nem dois métodos de processamento separados. Você cria uma única lista genérica do tipo Contribuinte e coloca todo mundo lá dentro.

A utilidade prática é que, quando você manda o Java rodar o calcularImposto(), o Java descobre sozinho e em tempo de execução qual é o tipo real daquele objeto e aplica a regra certa (se for PJ aplica 6%, se for PF aplica 15%). O seu código backend fica infinitamente mais limpo, escalável e fácil de manter.

💻 Exemplo Prático em Java


Repare como no método main nós criamos um único ArrayList de Contribuinte que aceita receber tanto PessoaFisica quanto PessoaJuridica.

Obs: Então basicamente POLIMORFISMO é a forma com que o mesmo metodo se comporta para diferentes objetos. Você prepara o polimorfismo fazendo um @override na classe filha, e quando você chama uma lista do objeto contribuinte, você vê o polimorfismo acontecer na chamada do metodo das filhas