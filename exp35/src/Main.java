// Simulando as Anotações do Spring Boot
@interface Component {} // Anotação genérica do Spring para registrar um Bean
@interface Service {}   // Especialização de @Component para a camada de serviço
@interface Repository {}// Especialização de @Component para a camada de acesso ao banco

// 1. Marquei a classe como um Componente gerenciado pelo Spring!
@Repository
class CalculadoraImpostoRepository {
    public double buscarAliquotaDoBanco() {
        return 0.06; // Simulando busca no banco: 6% de imposto
    }
}

// 2. Marquei o Service como um Componente do Spring!
@Service
class TributacaoService {
    private final CalculadoraImpostoRepository repository;

    // O Spring detecta este construtor e INJETA o Bean do Repository AUTOMATICAMENTE!
    public TributacaoService(CalculadoraImpostoRepository repository) {
        this.repository = repository;
    }

    public double calcularImposto(double faturamento) {
        double aliquota = repository.buscarAliquotaDoBanco();
        return faturamento * aliquota;
    }
}

// 3. O "Spring Container Fake": Simula a fábrica interna de Beans do Spring Boot
class SpringContainerFake {
    // O Spring escaneia o projeto, encontra a classe @Repository e cria o Bean
    private static final CalculadoraImpostoRepository repoBean = new CalculadoraImpostoRepository();

    // O Spring escaneia o @Service, vê que ele precisa do Repository, e injeta o Bean pronto!
    private static final TributacaoService serviceBean = new TributacaoService(repoBean);

    // Método que simula o Spring entregando o Bean pronto para uso
    public static TributacaoService getTributacaoService() {
        return serviceBean;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("🌱 [Spring Boot] Inicializando Container e escaneando anotações @Component...");

        // REPARE: Nós NÃO usamos a palavra 'new' para criar as nossas classes de serviço!
        // Nós apenas pedimos o Bean pronto ao Container do Spring.
        TributacaoService service = SpringContainerFake.getTributacaoService();

        double impostoCalculado = service.calcularImposto(100000.0);

        System.out.println("✅ Imposto calculado via Bean injetado pelo Spring: R$ " + impostoCalculado);
    }
}