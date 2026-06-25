public class ConversorTipos {
    static void main(String[] args) {
        String idadeTexto = "23";

        //Convertendo a String para o tipo inteiro
        double valorConvertido = Integer.parseInt(idadeTexto);

        if (valorConvertido >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
