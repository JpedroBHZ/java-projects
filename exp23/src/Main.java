import java.util.ArrayList;

class Contribuinte{
    protected String nome;
    protected double faturamentoAnual;

    public Contribuinte(String nome, double faturamentoAnual){
        this.nome = nome;
        this.faturamentoAnual = faturamentoAnual;
    }

    public double calcularImposto(){
        return 0.0;
    }

    public String getNome(){
        return nome;
    }
}

//Classe filha 1
class PessoaFisica extends Contribuinte{
    public PessoaFisica(String nome, double faturamentoAnual){
        super(nome, faturamentoAnual);
    }

    @Override
    public double calcularImposto(){
        return this.faturamentoAnual * 0.15;
    }
}

//Classe filha 1
class PessoaJuridica extends Contribuinte{
    public PessoaJuridica(String nome, double faturamentoAnual){
        super(nome, faturamentoAnual);
    }

    @Override
    public double calcularImposto(){
        return this.faturamentoAnual * 0.06;
    }
}

public class Main {
    static void main(String[] args) {
        //Lista genérica aceita qualquer tipo de contribuinte
        ArrayList<Contribuinte> listaEscritorio = new ArrayList<>();

        //Adicionando objetos de tipos diferentes na mesma coleção
        listaEscritorio.add(new PessoaFisica("Alex Silva", 60000.0));
        listaEscritorio.add(new PessoaJuridica("Contabilidade Nova Era", 200000.0));
        listaEscritorio.add(new PessoaFisica("Mariana Costa", 80000.0));

        System.out.println("Processando impostos do mês");

        double totalArrecadado = 0;

        //O loop trata todo mundo como 'Contribuinte' (genérico)
        for (Contribuinte c : listaEscritorio){
            double impostoDoContribuinte = c.calcularImposto(); //O java decide o calculo correto na hora
            totalArrecadado += impostoDoContribuinte;

            System.out.println("Contribuinte: " + c.getNome() + " | Imposto: R$ " + impostoDoContribuinte);
        }

        System.out.println("----------------");
        System.out.println("Total de impostos gerados pelo escritório: R$ " + totalArrecadado);
    }
}
