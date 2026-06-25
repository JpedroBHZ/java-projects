O Conceito: Exercício 01 – Estrutura Condicional: Validador de Maioridade Simples
Na programação procedural, a estrutura condicional (if / else) é o desvio no caminho do seu script. Ela avalia uma condição booleana (verdadeiro ou falso) e decide qual bloco de código deve executar.
Em Java, a única diferença para outras linguagens de script que você já domina é a tipagem forte (precisamos dizer que a idade é um int) e a sintaxe com chaves {} e parênteses ().

```java
public class ValidadorMaioridade {
public static void main(String[] args) {
// Declarando a variável com seu tipo (int para números inteiros)
int idade = 20;

        // A estrutura condicional avalia a regra de negócio
        if (idade >= 18) {
            System.out.println("Acesso liberado. O usuário é maior de idade.");
        } else {
            System.out.println("Acesso negado. Usuário menor de idade.");
        }
    }
}
```

O Desafio: Imagine que agora a regra mudou. Se a pessoa tiver 65 anos ou mais, o sistema deve exibir: "Acesso liberado. O usuário é idoso e tem prioridade." Se tiver entre 18 e 64, exibe a mensagem normal de maior de idade. Se for menor de 18, continua com acesso negado.
Dica: Você vai precisar usar o else if entre o primeiro if e o else final.