import java.util.Random;
import java.util.Scanner;

public class App {

    public static void limpar(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // Se der erro, ele apenas pula a limpeza
        }
    }

    public static void main(String[] args) throws Exception {
        
        int pontos = 10;

        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        while (pontos > 0) {

        limpar();
        System.out.println("Quantos pontos você quer apostar?");
        System.out.println("Disponível: " + pontos);
        int aposta = leitor.nextInt();

        if (aposta > pontos) {
            limpar();
            System.out.println("Você não tem pontos o suficiente");
            Thread.sleep(1000);
            continue;
        }

        limpar();
        System.out.println("Faça sua aposta:");
        System.out.println("'cara': x2");
        System.out.println("'coroa': x2");
        System.out.println("'velha': x10 (1 a cada 11");
        System.out.print("Sua aposta é: ");

        //Escuta aposta do usuário
        String escolha = leitor.next();
        limpar();

        //Gera um numero para ser cara ou coroa
        int resultado = gerador.nextInt(10);
        String resultadoX = "";

        if (resultado == 0) {
            resultadoX = "velha";
        } else if (resultado % 2 == 0) {
            resultadoX = "cara";
        } else {
            resultadoX = "coroa";
        }
        
        if (escolha.equalsIgnoreCase(resultadoX)) {
            if (resultado == 0) {
                pontos = pontos + (aposta * 10) - aposta;
            } else {
                pontos = pontos + aposta;
            }

            System.out.println("Você acertou, seus novos pontos são: " + pontos);
        } else {
            pontos = pontos - aposta;
            System.out.println("Perdeu, seus novos pontos são: " + pontos);
        }

            System.out.println("Gostaria de continuar? 's/n' ");
            escolha = leitor.next();
            if (escolha.equalsIgnoreCase("n")) {
                pontos = 0;
            }

        }

        System.out.println("Fim de jogo!");
        leitor.close();
    }
}