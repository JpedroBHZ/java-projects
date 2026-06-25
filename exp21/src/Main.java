class Contribuinte{
    //Usamos protected para que as classes filhas possam acessar os atributos diretamente
    protected String nome;
    protected double faturamentoAnual;

    public Contribuinte(String nome, double faturamentoAnual){
        this.nome = nome;
        this.faturamentoAnual = faturamentoAnual;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nome + " Faturamento: R$ " + this.faturamentoAnual);
    }
}

//Classe derivada(filha): Herda tudo de contribuinte e adiciona sua regra
class PessoaFisica extends Contribuinte{
    private String cpf;

    public PessoaFisica(String nome, double faturamentoAnual, String cpf){
        //O super chama o construtor da classe mãe para inicializar o nome e faturamento
        super(nome, faturamentoAnual);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
}

class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double faturamentoAnual, String cnpj) {
        super(nome, faturamentoAnual);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
}

public class Main {
    static void main(String[] args) {
        //Instanciando as classes filhas
        PessoaFisica pf = new PessoaFisica("Alex Silva", 50000.0, "111.222.333-44");
        PessoaJuridica pj = new PessoaJuridica("Contabilidade ABC", 50000.0, "12.345.678/0001-99");

        System.out.println("-- Dados do contribuinte PF --");
        pf.mostrarDados();
        System.out.println("CNPJ: " + pf.getCpf());

        System.out.println("-- Dados do Contribuinte PJ --");
        pj.mostrarDados();
        System.out.println("CPF: " + pj.getCnpj());
    }
}
