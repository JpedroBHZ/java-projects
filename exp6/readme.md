O Conceito: Exercício 06 – Estrutura de Repetição (For): Gerador de Tabuada Personalizado
O loop for agrupa três comandos essenciais na mesma linha, separados por ponto e vírgula ;:

Inicialização: Onde você cria a variável contadora (ex: int i = 1).

Condição: O limite até onde o loop deve rodar (ex: i <= 10).
Incremento: Como essa variável muda a cada volta (ex: i++ para subir de 1 em 1).

💻 Exemplo Prático em Java (Para o seu README)
Vamos criar um script clássico de tabuada. Repare na elegância e legibilidade do bloco for.

````Java
public class GeradorTabuada {
public static void main(String[] args) {
int numeroTabuada = 7; // Queremos a tabuada do 7

        System.out.println("=== TABUADA DO " + numeroTabuada + " ===");

        // O loop começa em 1, roda enquanto for menor ou igual a 10, e avança de 1 em 1
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabuada * i;
            
            // Exibindo o formato clássico: 7 x 1 = 7
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);
        }

        System.out.println("=======================");
    }
}
````
O Desafio: Transforme o gerador de tabuada em um Filtro de Números Pares.

* Seu loop for deve começar com o contador em 1 e rodar até 30.
* Dentro do loop, você deve usar uma estrutura condicional (if) para verificar se o número atual do contador é par.
* Se o número for par, exiba no console: "O número X é par."
* Se for ímpar, o loop simplesmente ignora e vai para a próxima volta (não exibe nada).

Dica: Para descobrir se um número é par em Java, usamos o operador de resto da divisão %. Se (i % 2 == 0), significa que o resto da divisão por 2 é zero, logo, o número é par.