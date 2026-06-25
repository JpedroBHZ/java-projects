public class LocalizadorExtremos {
    static void main(String[] args) {
        //Criando um array estático de inteiros com tamanho fixo (5 elementos)
        int[] numeros = {15, 42, 8, 23, 31};
        double soma = 0;

        //Iniciamos as variáveis de referência com o primeiro elemento do array
        int maiorValor = numeros[0];
        int menorValor = numeros[0];

        //Percorremos o array a partir do segundo elemento (indice 1)
        for (int i = 0; i < numeros.length; i++){
            //Se o elemento atual for maior que a nossa referência, atualizamos o maior
            if (numeros[i] > maiorValor){
                maiorValor = numeros[i];
            }

            //Se o elemento atual for que a nossa referencia, atualizamos o menor
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }

            soma += numeros[i];
        }

        double media = soma / numeros.length;
        System.out.println("Lista de números analisada");
        System.out.println("O maior valor encontrado é: " + maiorValor);
        System.out.println("O menor valor encontrado é: " + menorValor);
        System.out.println("A média é: " + media);
    }
}
