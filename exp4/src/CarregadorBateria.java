public class CarregadorBateria {
    static void main(String[] args) {
        int bateria = 0; //Variável de controle inicial

        //O loop roda ENQUANTO o contador for menor que 100%
        while (bateria <= 100) {
            System.out.println("Carregando... Atual: " + bateria + "%");
            bateria += 10; //Aumenta em 1 a cada voltar
        }

        System.out.println("A bateria está carregada! Remova o carregador");
    }
}
