public class SimuladorCaixa {
    static void main(String[] args) {
        double saldoDisponivel = 500.0;
        double valorSaque = 600.0;

        while (valorSaque > saldoDisponivel) {
            System.out.println("Saldo insuficiente para sacar R$" + saldoDisponivel + ". Tente um valor menor");
            valorSaque -= 150;
        }
            saldoDisponivel -= valorSaque;
            System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso! Saldo atual: R$ " + saldoDisponivel);
    }
}