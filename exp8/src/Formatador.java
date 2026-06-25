public class Formatador {
    static void main(String[] args) {
        //Simulando entrada de dados com espaços extra e caixa mista
        String docBruto = "123.456.789-00";

        String docSemPonto = docBruto.replace(".","");
        String docPadronizado = docSemPonto.replace("-","");

        System.out.println("Texto original: '" + docBruto + "'");
        System.out.println("Texto tratado: '" + docPadronizado + "'");
    }
}
