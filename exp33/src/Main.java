import java.util.Objects;

// 1. O DTO: Dados limpos vindo da internet (Exercício 32)
class EmpresaDTO {
    private String cnpj;
    private String razaoSocial;
    private double faturamentoAnual;

    public EmpresaDTO(String cnpj, String razaoSocial, double faturamentoAnual) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
    public double getFaturamentoAnual() { return faturamentoAnual; }
}

// =========================================================================
// CAMADA SERVICE: O Cérebro (Lógicas de Negócio e Validações)
// =========================================================================
class EmpresaService {

    public void salvarEmpresa(EmpresaDTO dto) {
        // Regra de Negócio 1: Validação do CNPJ
        if (dto.getCnpj() == null || dto.getCnpj().length() != 14) {
            throw new IllegalArgumentException("CNPJ inválido! Deve conter exatamente 14 dígitos.");
        }

        // Regra de Negócio 2: Decisão de enquadramento tributário
        String regime = (dto.getFaturamentoAnual() <= 4800000.0) ? "Simples Nacional" : "Lucro Presumido";

        System.out.println("[SERVICE] Processando regras de negócio...");
        System.out.println("Enquadramento definido: " + regime);
        System.out.println("Gravando empresa '" + dto.getRazaoSocial() + "' no banco de dados.");
    }
}

// =========================================================================
// CAMADA CONTROLLER: A Porta de Entrada (Comunicação Web e HTTP)
// =========================================================================
class EmpresaController {
    // Injeção de dependência do Service (Exercício 31)
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    // Simula a recepção de uma requisição HTTP POST (Endpoint de cadastro)
    public void postCadastrarEmpresa(EmpresaDTO requisicaoWeb) {
        System.out.println("[CONTROLLER] Recebeu requisição HTTP POST para cadastrar empresa.");

        try {
            // DELEGAÇÃO: O Controller não valida nada, ele passa a bola para o Service!
            this.empresaService.salvarEmpresa(requisicaoWeb);

            // Se tudo der certo, o Controller responde o equivalente a um HTTP 201 Created
            System.out.println("[CONTROLLER] Resposta HTTP: 201 Created. Empresa cadastrada com sucesso!");

        } catch (IllegalArgumentException e) {
            // Se o Service estourar um erro de negócio, o Controller captura e responde um HTTP 400 Bad Request
            System.out.println("[CONTROLLER] Resposta HTTP: 400 Bad Request. Erro: " + e.getMessage());
        }
    }
}

// Execução do Fluxo
public class Main {
    public static void main(String[] args) {
        // Instanciamos as camadas e injetamos o Service no Controller
        EmpresaService service = new EmpresaService();
        EmpresaController controller = new EmpresaController(service);

        // Cenário A: Dados corretos vindos da internet
        System.out.println("--- REQUISIÇÃO 1 (Dados Válidos) ---");
        EmpresaDTO dadosValidos = new EmpresaDTO("12345678000199", "Nova Era Contábil", 150000.0);
        controller.postCadastrarEmpresa(dadosValidos);

        System.out.println("\n-----------------------------------------------------------------\n");

        // Cenário B: Dados inválidos (CNPJ incorreto)
        System.out.println("--- REQUISIÇÃO 2 (Dados Inválidos) ---");
        EmpresaDTO dadosInvalidos = new EmpresaDTO("123", "Empresa com CNPJ Curto", 50000.0);
        controller.postCadastrarEmpresa(dadosInvalidos);
    }
}