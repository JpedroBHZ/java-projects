// A PEÇA DE LEGO 1: O Serviço que cuida das regras de negócio fiscais
class TributacaoService {
    public double calcularImpostoSimples(double faturamento) {
        return faturamento * 0.06; // Alíquota de 6%
    }
}

// A PEÇA DE LEGO 2: A classe que controla o fluxo da API e depende do Serviço
class EmpresaController {
    // A dependência declarada
    private final TributacaoService tributacaoService;

    // INJEÇÃO DE DEPENDÊNCIA MANUAL: Recebemos a peça pronta de fora
    public EmpresaController(TributacaoService tributacaoService) {
        this.tributacaoService = tributacaoService;
    }

    public void processarRequisicaoFaturamento(String nomeEmpresa, double faturamentoAnual) {
        // Usamos a dependência injetada sem nunca ter dado 'new TributacaoService()' aqui dentro
        double imposto = this.tributacaoService.calcularImpostoSimples(faturamentoAnual);

        System.out.println("[API - Endpoint Executado] Processando: " + nomeEmpresa);
        System.out.println("Imposto Calculado via Service Injetado: R$ " + imposto);
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Criamos a dependência primeiro (a peça base)
        TributacaoService service = new TributacaoService();

        // 2. INJETAMOS a dependência manualmente ao criar o Controller
        EmpresaController controller = new EmpresaController(service);

        // 3. O fluxo roda perfeitamente desacoplado
        System.out.println("--- Inicializando Servidor Fake ---");
        controller.processarRequisicaoFaturamento("Contabilidade Nova Era", 200000.0);
    }
}