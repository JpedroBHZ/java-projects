public class DescontoProgressivo {
    static void main(String[] args) {
        double precoOriginal = 450.0;
        double precoFinal;

        //Avaliando as categorias de forma progressiva
        if (precoOriginal >= 200 && precoOriginal < 499.99) {
            precoFinal = precoOriginal * 0.95; //5% de desconto
            System.out.println("Valor maior que 200. Desconto de 5% aplicado");
        } else if (precoOriginal >= 500) {
            precoFinal = precoOriginal * 0.85; //15% de desconto
            System.out.println("Valor maior que 500! Desconto de 15% aplicado");
        } else {
            precoFinal = precoOriginal; // Sem desconto
            System.out.println("Valor abaixo de 200. Sem desconto aplicado, gaste mais!!");
        }

        System.out.println("Valor original de R$ " + precoOriginal);
        System.out.println("Valor a pagar de R$ " + precoFinal);
    }
}
