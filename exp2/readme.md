O Conceito: Exercício 02 – Cálculo de Desconto Progressivo por Categoria
Em scripts comerciais, é raríssimo ter apenas uma decisão de "sim ou não". Quase sempre temos regras de negócio progressivas (se for a regra A acontece isso, se for a B acontece aquilo, senão acontece um padrão).

Em Java, para lidar com dinheiro ou números quebrados, usamos o tipo double. Para encadear as regras, usamos o else if. O programa lê de cima para baixo: a primeira condição que for verdadeira é executada, e o resto é ignorado.

Exemplo Prático em Java
Vamos simular um sistema que calcula o preço final de um produto baseado na categoria do cliente (VIP, Comum ou Novo).

````Java
public class DescontoProgressivo {
public static void main(String[] args) {
double precoOriginal = 100.0;
String categoriaCliente = "VIP";
double precoFinal;

        // Avaliando as categorias de forma progressiva
        if (categoriaCliente.equals("VIP")) { // Em Java, comparamos Strings usando .equals()
            precoFinal = precoOriginal * 0.80; // 20% de desconto
            System.out.println("Cliente VIP! Desconto de 20% aplicado.");
        } else if (categoriaCliente.equals("COMUM")) {
            precoFinal = precoOriginal * 0.90; // 10% de desconto
            System.out.println("Cliente Comum. Desconto de 10% aplicado.");
        } else {
            precoFinal = precoOriginal; // Sem desconto
            System.out.println("Cliente Novo. Sem desconto aplicado.");
        }

        System.out.println("Valor original: R$ " + precoOriginal);
        System.out.println("Valor a pagar: R$ " + precoFinal);
    }
}
````
Seu Desafio de Modificação
Para testar como você lida com operadores matemáticos e variáveis no Java, vamos alterar a regra de negócio:

O Desafio: Em vez de dar o desconto baseado em uma String (categoria), o desconto agora será baseado no valor da compra (precoOriginal).
Se o precoOriginal for maior ou igual a 500.0, dê 15% de desconto.
Se o precoOriginal for entre 200.0 e 499.99, dê 5% de desconto.
Se for menor que 200.0, nenhum desconto é aplicado.

Dica: Para verificar se o preço está entre dois valores no else if, você pode usar o operador lógico AND, que em Java é escrito com dois e-comerciais (&&). Exemplo: if (preco >= 200 && preco < 500).