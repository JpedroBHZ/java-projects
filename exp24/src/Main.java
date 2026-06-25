import java.util.ArrayList;

//Classe abstrata: Não pode mais ser instanciada com "new"
abstract class Contribuinte{
    protected String nome;
    protected double faturamentoAnual;

    public Contribuinte(String nome, double faturamentoAnual){
        this.nome = nome;
        this.faturamentoAnual = faturamentoAnual;
    }

    //Metodo abstrato: Não tem corpo {} É só uma obrigação para as filhas
    public abstract double calcularImposto();

    public String getNome(){ return nome; }
}

//Classe filha 1: Obrigada a implementar o 'calcularImposto'
class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double faturamentoAnual) {
        super(nome, faturamentoAnual);
    }

    @Override
    public double calcularImposto(){
        return this.faturamentoAnual * 0.15;
    }
}

//Classe filha 2: Obrigada a implementar o 'calculaImposto'
class PessoaJuridica extends Contribuinte{
    public PessoaJuridica(String nome, double faturamentoAnual){
        super(nome, faturamentoAnual);
    }

    public double calcularImposto(){
        return this.faturamentoAnual * 0.06;
    }
}

public class Main {
    static void main(String[] args) {
        ArrayList<Contribuinte> listaEscritorio = new ArrayList<>();

        listaEscritorio.add(new PessoaFisica("Alex Silva", 60000.0));;
        listaEscritorio.add(new PessoaJuridica("Contabilidade Nova Era", 200000.0));

        System.out.println("--- Processando impostos com classes abstratas ---");
        for (Contribuinte c : listaEscritorio){
            System.out.println("Contribuinte: " + c.nome + "Imposto: R$ " + c.calcularImposto());
        }
    }
}
