public class TermometroIndustrial {
    static void main(String[] args) {
        int temperatura = 120;

        //Avaliando as temperaturas dentro do limite do sensor
        if (temperatura < 0 || temperatura > 150){
            System.out.println("Erro, temperatura fora dos limites operacionais do sensor");
        } else if (temperatura >= 0 && temperatura <= 100) {
            System.out.println("Status: Temperatura normal");
        } else if (temperatura >= 101 && temperatura <= 150) {
            System.out.println("Status: Temperatura elevada");
        }
    }
}
