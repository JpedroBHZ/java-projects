🧠 O Conceito: Exercício 10 – Vetores e Arrays Estáticos: Localizador de Maior e Menor Valor em uma Lista Fixa   Em scripts ou linguagens dinâmicas, estamos acostumados com listas flexíveis que crescem sozinhas. Em Java, o array estático (vetor) possui um tamanho fixo definido no momento da sua criação. Se você criou um espaço para 5 elementos, ele terá exatamente 5 espaços até o fim de sua execução.  A utilidade prática de percorrer um array para extrair extremos (como o maior ou o menor valor) simula cenários reais como encontrar o produto mais caro em um carrinho de compras, a menor nota de uma turma ou o pico de temperatura registrado por um sensor. A lógica consiste em assumir que o primeiro elemento é o seu extremo inicial e usar um laço de repetição para comparar essa referência com o restante da lista.  

💻 Exemplo Prático em JavaO código abaixo inicializa um array estático de números inteiros e percorre a lista para determinar qual é o maior e qual é o menor número presente.

````java
Javapublic class LocalizadorExtremos {
public static void main(String[] args) {
// Criando um array estático de inteiros com tamanho fixo (5 elementos)
int[] numeros = {15, 42, 8, 23, 31};

        // Iniciamos as variáveis de referência com o primeiro elemento do array
        int maiorValor = numeros[0];
        int menorValor = numeros[0];

        // Percorremos o array a partir do segundo elemento (índice 1)
        for (int i = 1; i < numeros.length; i++) {
            // Se o elemento atual for maior que a nossa referência, atualizamos o maior
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
            
            // Se o elemento atual for menor que a nossa referência, atualizamos o menor
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
        }

        System.out.println("Lista de números analisada.");
        System.out.println("O maior valor encontrado é: " + maiorValor);
        System.out.println("O menor valor encontrado é: " + menorValor);
    }
}
````

🛠️ Seu Desafio de Modificação

Imagine que esse array agora representa o saldo diário de uma conta bancária ao longo de uma semana.Sua missão é modificar o código acima para que, além de encontrar o maior e o menor valor, ele também calcule e exiba a média aritmética de todos os números contidos no array.

Dica 1: Crie uma variável acumuladora (ex: double soma = 0; ou int soma = 0;) antes do laço for para somar todos os valores conforme o array é percorrido.

Dica 2: Para calcular a média fora do laço, divida o total da soma pelo tamanho do array usando a propriedade numeros.length. Lembre-se de converter ou usar tipos adequados para não perder as casas decimais no resultado da divisão.  