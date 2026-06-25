import java.util.ArrayList;

//Classe abstrata
abstract class Contribuinte{
    protected String nome;
    protected double faturamentoAnual;

    public Contribuinte(String nome, double faturamentoAnual){
        this.nome = nome;
        this.faturamentoAnual = faturamentoAnual;
    }

    public abstract double calcularImposto();

    public String getNome(){return nome;}
}

//Interface: Um contrato de comportamento puro (não tem atributos, apenas a ideia do método
interface EmissorNota{
    void emitirNotaFiscal(double valor); //Métodos em interface são públicos e abstratos por padrão
}

// Classe Filha 1: Apenas um contribuinte comum
class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double faturamentoAnual) {
        super(nome, faturamentoAnual);
    }

    @Override
    public double calcularImposto() {
        return this.faturamentoAnual * 0.15;
    }
}

//Classe filha 2: É um contribuinte e também assina o contrato de EmissorNota
class PessoaJuridica extends Contribuinte implements EmissorNota{
    public PessoaJuridica(String nome, double faturamentoAnual){
        super(nome, faturamentoAnual);
    }

    @Override
    public double calcularImposto(){
        return this.faturamentoAnual * 0.06;
    }

    //Obrigação da interface: Implementar o comportamento do contrato
    @Override
    public void emitirNotaFiscal(double valor) {
        System.out.println("Nota Fiscal emitida por '" + this.nome + "' no valor de R$ " + valor);
    }
}

public class Main {
    static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Alex Silva", 40000);
        PessoaJuridica pj = new PessoaJuridica("Contabilidade Nova Era", 150000);

        System.out.println("--- Fluxo normal de impostos ---");
        System.out.println(pf.getNome() + " deve: R$ " + pf.calcularImposto());
        System.out.println(pj.getNome() + " deve: R$ " + pj.calcularImposto());

        System.out.println("--- Fluxo de faturamento (interfaces) ---");
        //Apenas quem implemento interface pode chamar o método
        pj.emitirNotaFiscal(5000.0);
    }
}
