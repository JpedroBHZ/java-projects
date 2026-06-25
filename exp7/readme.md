🧠 O Conceito: Exercício 07 – Estrutura de Repetição (For): Calculadora de Fatorial de um Número

Em scripts e automações, além de repetir algo uma quantidade fixa de vezes (como a tabuada), frequentemente precisamos usar repetições para fazer acumulação matemática ou consolidação de dados.  O cálculo do fatorial (onde $5! = 5 \times 4 \times 3 \times 2 \times 1$) é o exemplo perfeito para entender como uma variável acumuladora funciona dentro de um loop for. A cada iteração, pegamos o valor atual da variável e o multiplicamos pelo próximo número, atualizando o total. Em Java, a estrutura do for controla perfeitamente esse contador que vai diminuindo (ou aumentando) a cada rodada.  

💻 Exemplo Prático em JavaVeja como estruturar o código para calcular o fatorial de 5. Repare que iniciamos a variável fatorial com 1 (e não 0), porque qualquer número multiplicado por zero dá zero!Javapublic class CalculadoraFatorial {

``````java
public static void main(String[] args) {
int numero = 5;
long fatorial = 1; // Usamos long porque o fatorial cresce muito rápido!

        // O loop começa no número escolhido e vai diminuindo até chegar em 1
        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i; // Acumula a multiplicação
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
`````` 

🛠️ Seu Desafio de ModificaçãoNo desenvolvimento do dia a dia, muitas vezes precisamos acumular valores através de somas em vez de multiplicações (como somar os valores de uma lista de notas fiscais ou relatórios).Modifique o código acima para que, em vez de calcular o fatorial (multiplicação), ele calcule a Soma Consecutiva de todos os números de 1 até o número definido.Se o numero for 5, o sistema deve fazer $1 + 2 + 3 + 4 + 5$ e printar 15.Se o numero for 10, deve somar todos até 10.

Dica: Você precisará mudar o valor inicial da sua variável acumuladora para 0 e alterar o operador de multiplicação (*) para o de adição (+) dentro do loop.