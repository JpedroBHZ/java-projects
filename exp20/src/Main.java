import java.util.HashMap;
import java.util.Objects;

class Empresa{
    private String cnpj;
    private String razaoSocial;

    public Empresa(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    //Ensinando o Java a comparar duas empresas pelo cnpj
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Empresa empresa)) return false;
        return Objects.equals(getCnpj(), empresa.getCnpj());
    }

    //Garante a mesma posição de memoria do HashMap com base no CNPJ
    @Override
    public int hashCode() {
        return Objects.hashCode(getCnpj());
    }

    public String getCnpj(){return cnpj;}
    public String getRazaoSocial(){return razaoSocial;}
}

public class Main {
    static void main(String[] args) {
        //Criando a gaveta
        HashMap<Empresa, String> statusFaturamento = new HashMap<>();

        //Indexando: guardando o documento
        //No caso o documento é a string que está sendo guardada, e a chave de busca é o embBanco
        Empresa empBanco = new Empresa("1234567800199", "Contabilidade Nova Era");
        statusFaturamento.put(empBanco, "Faturamento Liberado (Simples Nacional)");

        System.out.println("Empresa indexada no mapa de alta performance");
        System.out.println("=============================================");

        //Fazendo a busca com alta performance
        Empresa empBusca = new Empresa("1234567800199", "Contabilidade Nova Era");
        String statusFiscal = statusFaturamento.get(empBusca);

        if (statusFiscal != null){
            System.out.println("Empresa encontrada via busca");
            System.out.println("Razão social: " + empBusca.getRazaoSocial());
            System.out.println("Status no escritório: " + statusFiscal);
        } else {
            System.out.println("Erro: Empresa não localizada");
        }
    }
}
