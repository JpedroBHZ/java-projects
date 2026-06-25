🧠 O Conceito: Exercício 09 – Conversor de Tipos (String para Double/Int com segurança)No desenvolvimento de APIs, quase tudo o que trafega pela web (como o corpo de uma requisição HTTP ou parâmetros de URL) chega ao backend inicialmente no formato de texto (String). Porém, para aplicar regras de negócio, você precisa desses dados nos seus tipos numéricos reais (como int para idades ou double para valores financeiros).O processo de transformar uma String em um tipo numérico é chamado de Parsing. Em Java, fazemos isso usando as classes utilitárias dos tipos primitivos (chamadas de Wrapper Classes), como Integer e Double. 

O grande cuidado que um desenvolvedor backend precisa ter aqui é a segurança: se a String contiver uma letra ou um caractere inválido (ex: "150,00" com vírgula em vez de ponto, ou "10a"), o Java disparará um erro chamado NumberFormatException. Tratar esse cenário garante que a sua aplicação não caia (dê crash) por causa de uma entrada mal-formatada.  

💻 Exemplo Prático em JavaVeja como convertemos uma String que veio da web em um double para realizar um cálculo matemático, e como o Java se comporta:

````java
Javapublic class ConversorTipos {
public static void main(String[] args) {
String valorTexto = "150.50"; // Simulando um dado que veio da web

        // Convertendo a String para o tipo double real
        double valorConvertido = Double.parseDouble(valorTexto);

        // Agora que é um double, podemos realizar operações matemáticas
        double valorComImposto = valorConvertido * 1.10; // Adicionando 10%

        System.out.println("Texto original: " + valorTexto);
        System.out.println("Valor convertido e calculado: R$ " + valorComImposto);
    }
}
````

🛠️ Seu Desafio de Modificação 

Imagine que você está construindo o endpoint de um sistema que recebe a idade de um usuário em formato de texto para validar a maioridade.  Modifique o código acima para:Receber uma variável String idadeTexto = "23";.Converter essa String para o tipo inteiro (int) usando o método Integer.parseInt(idadeTexto).

Criar uma estrutura condicional if/else que verifique se a idade convertida é maior ou igual a 18 anos, exibindo a mensagem correspondente no console.  

Dica: A lógica da conversão com Integer.parseInt() segue exatamente a mesma estrutura do Double.parseDouble(), mas devolve um número inteiro (int) em vez de um número decimal.