O Conceito: Exercício 04 – Estrutura de Repetição (While): Contador Regressivo para Lançamento de Foguete
Saímos das tomadas de decisão e entramos nos fluxos de repetição (Loops). O loop while (enquanto) é a estrutura mais pura de repetição: ele avalia uma condição booleana no início. Se ela for verdadeira, ele executa o bloco de código de dentro e volta para o topo para testar de novo. Ele fica nesse ciclo até que a condição se torne falsa.


💻 Exemplo Prático em Java (Para o seu README)
Vamos criar a contagem regressiva clássica da NASA.

````Java
public class ContadorRegressivo {
public static void main(String[] args) {
int contador = 10; // Variável de controle inicial

        // O loop roda ENQUANTO o contador for maior ou igual a zero
        while (contador >= 0) {
            System.out.println("Foguete em: " + contador + " segundos...");
            
            // CRUCIAL: Decrementa 1 do contador a cada volta. 
            // Sem isso, o contador continuaria 10 para sempre (Loop Infinito)
            contador--; 
        }

        System.out.println("Decolar! 🚀 Foguete lançado com sucesso.");
    }
}
````

🛠️ Seu Desafio de Modificação (Para o seu código de desafio)
Para exercitar o controle do while mudando variáveis internas e a própria lógica de incremento:

O Desafio: Modifique o sistema para simular o painel de carregamento de uma bateria.
* O programa deve começar com a variável int bateria = 0;.
* O loop while deve rodar enquanto a bateria for menor ou igual a 100.
* A cada volta do loop, em vez de subir de 1 em 1, a bateria deve subir de 10 em 10.
* Dentro do loop, exiba a mensagem: "Carregando... Atual: X%".
* Ao final do loop (quando chegar a 100), exiba: "Bateria 100% carregada! Remova o carregador."

Dica: Para subir de 10 em 10, você pode usar a sintaxe bateria += 10; dentro do loop.