O Conceito: Exercício 03 – Simulador de Semáforo com Controle de Erros
Na vida real, os dados que chegam na sua API podem vir errados, incompletos ou totalmente fora do esperado. Um bom programador nunca assume que o dado está 100% correto.

Se o seu sistema espera as cores "VERMELHO", "AMARELO" ou "VERDE", o que acontece se alguém digitar "AZUL"? O seu código precisa estar preparado para tratar esse "caso padrão" ou "caso de erro", geralmente usando o else final como uma rede de segurança para blindar a aplicação.

💻 Exemplo Prático em Java
Vamos simular o comportamento de um semáforo inteligente. Repare como o uso do .toUpperCase() ajuda a tratar o dado antes de testar a condição, e como o else final captura o erro.

````Java
public class SimuladorSemaforo {
public static void main(String[] args) {
String corAtual = "azul"; // Simulando um dado que veio errado

        // Tratamento inicial: transforma tudo em maiúsculo para evitar erros de digitação
        String corTratada = corAtual.toUpperCase(); 

        // Avaliando os estados possíveis do semáforo
        if (corTratada.equals("VERMELHO")) {
            System.out.println("Sinal VERMELHO: Pare o veículo imediatamente.");
        } else if (corTratada.equals("AMARELO")) {
            System.out.println("Sinal AMARELO: Atenção, reduza a velocidade.");
        } else if (corTratada.equals("VERDE")) {
            System.out.println("Sinal VERDE: Pista livre, pode prosseguir.");
        } else {
            // A rede de segurança: o código não quebra, ele avisa que o dado é inválido
            System.out.println("Erro: '" + corAtual + "' não é uma cor válida para um semáforo.");
        }
    }
}
````

🛠️ Seu Desafio de Modificação
Para consolidar essa mentalidade de proteção de código contra dados inválidos:

O Desafio: Imagine um sistema de comportamento para um termômetro de caldeira industrial. O sistema recebe uma temperatura em formato de número inteiro (int temperatura).
Se a temperatura for menor que 0 ou maior que 150, o sistema deve disparar um alerta de erro: "Erro: Temperatura fora dos limites operacionais do sensor."
Se estiver entre 0 e 100 (inclusive), exibe: "Status: Temperatura Normal."
Se estiver entre 101 e 150 (inclusive), exibe: "Alerta: Temperatura Elevada!"

Dica: Use o operador lógico OR, que em Java é feito com duas barras verticais (||), no primeiro if para capturar o erro logo de cara (ex: if (temperatura < 0 || temperatura > 150)).