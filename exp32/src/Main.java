//1 Entidade do banco: Rica em detalhes, dados sensíveis e IDs automáticos
class Empresa {
    private Long id; //Gerado automaticamente pelo banco
    private String cnpj;
    private String razaoSocial;
    private double faturamentoInternoSecreto; //Campo sensível do sistema

    public Empresa(Long id, String cnpj, String razaoSocial, double faturamentoInternoSecreto) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamentoInternoSecreto = faturamentoInternoSecreto;
    }

    //Getters para simular o banco
    public Long getId() {return id;}
    public String getCnpj() {return cnpj;}
    public String getRazaoSocial() {return razaoSocial;}

}

//2 O DTO, apenas o uqe a internet pode enviar
//Não tem ids do banco nem campos secretos
class EmpresaRequestDTO {
    private String cnpj;
    private String razaoSocial;

    public EmpresaRequestDTO(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {return cnpj;}
    public String getRazaoSocial() {return razaoSocial;}
}

public class Main {
    static void main(String[] args) {
        //Simulação: O JSON da internet chega e o Spring Boot o transforma em um DTO
        EmpresaRequestDTO dadosDaInternet = new EmpresaRequestDTO("12345678000199", "Contabilidade nova era");

        System.out.println("[API - HTTP POST] Dados recebidos com segurança no DTO");
        System.out.println("CNPJ vindo da web: " + dadosDaInternet.getCnpj());

        //3. Conversão: O sistema pega os dados do DTO e cria a entidade real do banco
        //O ID é gerado internamente e o campo sensível começa zerado com segurança

        Empresa novaEmpresaBanco = new Empresa(
                1L,
                dadosDaInternet.getCnpj(),
                dadosDaInternet.getRazaoSocial(),
                0.0
        );

        System.out.println("[Database] Entidade mapeada e salva com sucesso");
        System.out.println("Empresa salva com o Id seguro: " + novaEmpresaBanco.getId());
    }
}
