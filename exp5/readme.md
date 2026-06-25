O Conceito: Exercício 05 – Estrutura de Repetição (While): Validador de Senha com Tentativas Limitadas
Nos scripts de autenticação, nós não deixamos o usuário tentar digitar a senha infinitamente (isso abriria brecha para ataques de força bruta). O loop while aqui serve para manter o usuário "preso" na tela de login enquanto ele não acertar a senha E ainda tiver tentativas disponíveis.

💻 Exemplo Prático em Java (Para o seu README)
Para manter este exemplo simples e testável sem precisar capturar dados do teclado agora (o que exige outras bibliotecas), vamos simular o comportamento de um usuário errando a senha de propósito nas primeiras voltas através do código.

````Java
public class ValidadorSenha {
public static void main(String[] args) {
String senhaCorreta = "java123";
String senhaDigitada = "errada"; // Simulando a primeira tentativa do usuário

        int tentativasMaximas = 3;
        int tentativasUsadas = 1; // O usuário já fez a primeira tentativa acima

        // O loop roda ENQUANTO a senha estiver errada E o usuário não estourar o limite
        while (!senhaDigitada.equals(senhaCorreta) && tentativasUsadas < tentativasMaximas) {
            System.out.println("Senha incorreta! Tentativa " + tentativasUsadas + " de " + tentativasMaximas);
            
            // Simulando o usuário digitando uma nova senha na próxima rodada
            if (tentativasUsadas == 1) {
                senhaDigitada = "quaseAcertei"; 
            } else {
                senhaDigitada = "java123"; // Na terceira rodada ele digita a certa
            }
            
            tentativasUsadas++; // Registra que mais uma tentativa foi gasta
        }

        // Ao sair do loop, precisamos checar por qual motivo ele saiu (acertou ou estourou o limite)
        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido! Bem-vindo ao sistema.");
        } else {
            System.out.println("Sua conta foi bloqueada por excesso de tentativas!");
        }
    }
}
````
O Desafio: Transforme esse validador em um Simulador de Caixa Eletrônico para Saque.

* Você terá uma variável fixa double saldoDisponivel = 500.0;.
* O programa receberá uma variável double valorSaque = 600.0; (o usuário tentando sacar mais do que tem).
* O loop while deve continuar rodando enquanto o valorSaque for maior que o saldo disponível.
* A cada volta do loop, simule que o usuário "entendeu o erro" e reduziu o valor do saque em R$ 150,00 (valorSaque -= 150.0;).
* Dentro do loop, exiba a mensagem: "Saldo insuficiente para sacar R$ X. Tente um valor menor."
* Ao final do loop (quando o valor do saque for menor ou igual ao saldo), reduza o valor do saldo e exiba: "Saque de X realizado com sucesso! Saldo atual: Y".