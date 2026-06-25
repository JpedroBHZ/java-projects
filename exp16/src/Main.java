class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String getTitular() {return titular;}
    public double getSaldo() {return saldo;}

    //Metodo que recebe outro obj como parametro
    public void transferir(double valor, ContaBancaria contaDestino){
        //Validação basica de segurança (regra de negocio)
        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor; //Tira dinheiro da conta atual (this)
            contaDestino.depositar(valor); //Objeto atual mexe no estado do outro obj
            System.out.println("Sucesso: R$ " + valor + " transferido de " + this.titular + " para " + contaDestino.getTitular());
        }
    }
}

public class Main {
    static void main(String[] args) {
        ContaBancaria contaJoao = new ContaBancaria("Parceiro Joao", 500.0);
        ContaBancaria contaMaria = new ContaBancaria("Parceira Maria", 100.0);

        contaJoao.transferir(200.0, contaMaria); //O João inicia a ação e passa a conta Maria como argumento

        System.out.println("Saldo final de João: R$ " + contaJoao.getSaldo());
        System.out.println("Saldo final de Maria: R$ " + contaMaria.getSaldo());
    }
}
