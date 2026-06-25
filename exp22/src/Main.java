//Classe base (Mãe)
class Contribuinte {
    protected String nome;
    protected double faturamentoAnual;

    public Contribuinte(String nome, double faturamentoAnual){
        this.nome = nome;
        this.faturamentoAnual = faturamentoAnual;
    }

    public double calcularImposto(){
        return 0.0;
    }
}

//Classe derivada (Filha 1)
class PessoaFisica extends Contribuinte{
    private String cpf;

    public PessoaFisica(String nome, double faturamentoAnual, String cpf){
        super(nome, faturamentoAnual);
        this.cpf = cpf;
    }

    //Sobrescrita: Pessoa fisica paga 15% de imposto sobre faturamento
    @Override
    public double calcularImposto() {
        return this.faturamentoAnual * 0.15;
    }
}

// Classe Derivada (Filha 2)
class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double faturamentoAnual, String cnpj) {
        super(nome, faturamentoAnual);
        this.cnpj = cnpj;
    }

    // SOBRESCRITA: Pessoa Jurídica paga 6% (Simples Nacional)
    @Override
    public double calcularImposto() {
        return this.faturamentoAnual * 0.06;
    }
}

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Alex Silva", 60000.0, "111.222.333-44");
        PessoaJuridica pj = new PessoaJuridica("Contabilidade Nova Era", 200000.0, "12.345.678/0001-99");

        // Mesmo chamando o método com o exato mesmo nome, cada objeto responde com a sua própria regra!
        System.out.println("Imposto devido por " + pf.nome + " (PF): R$ " + pf.calcularImposto());
        System.out.println("Imposto devido por " + pj.nome + " (PJ): R$ " + pj.calcularImposto());
    }
}
