public class CalculadoraFatorial {
    static void main(String[] args) {
        int numero = 5;
        int total = 0;

        //O loop começa no número escolhido e vai diminuindo até chegar em 1
        for (int i = 0; i <= numero; i++){
            total += i; //Total da soma
        }

        System.out.println("A soma dos números até " + numero + " é: " + total);
    }
}
