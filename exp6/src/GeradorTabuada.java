public class GeradorTabuada {
    void main(String[] args) {
        System.out.println("Verificador de impar/par");

        for (int i = 1; i <= 30; i++){
            if (i % 2 == 0) { //Resto da divisão é zero, logo o número é par
            System.out.println("O número " + i + " é par.");
            }
        }

        System.out.println("====================");
    }
}
