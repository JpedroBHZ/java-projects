import java.util.ArrayList;
import java.util.List;

// 1. A ENTIDADE
class Empresa {
    private static Long geradorId = 1L;
    private Long id;
    private String cnpj;
    private String razaoSocial;

    public Empresa(String cnpj, String razaoSocial) {
        this.id = geradorId++;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public Long getId() { return id; }
    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
}

// 2. REPOSITORY
class EmpresaRepository {

    private final List<Empresa> bancoDeDadosSimulado = new ArrayList<>();

    public void salvar(Empresa empresa) {
        bancoDeDadosSimulado.add(empresa);
        System.out.println("[REPOSITORY] Sucesso! Empresa '" + empresa.getRazaoSocial() + "' persistida no ID " + empresa.getId());
    }

    public List<Empresa> buscarTodas() {
        return new ArrayList<>(bancoDeDadosSimulado);
    }
}

// 3. SERVICE
class EmpresaService {
    private final EmpresaRepository repository;

    // Injeção de dependência do Repository no Service 
    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    public void registrarNovaEmpresa(EmpresaDTO dto) {
        if (dto.getCnpj().length() != 14) {
            throw new IllegalArgumentException("CNPJ deve conter 14 dígitos.");
        }

        System.out.println("[SERVICE] Dados validados. Convertendo DTO para Entidade...");

        // Agora sim! Criamos o objeto real de negócio/banco
        Empresa novaEmpresa = new Empresa(dto.getCnpj(), dto.getRazaoSocial());

        // Passamos a bola para a persistência salvar
        this.repository.salvar(novaEmpresa);
    }

    public List<Empresa> listarEmpresasSalvas() {
        return this.repository.buscarTodas();
    }
}

// DTO
class EmpresaDTO {
    private String cnpj;
    private String razaoSocial;

    public EmpresaDTO(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
}

// CONTROLLER
class EmpresaController {
    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    public void postCadastrar(EmpresaDTO requisicao) {
        System.out.println("\n[CONTROLLER] POST /empresas recebido.");
        try {
            this.service.registrarNovaEmpresa(requisicao);
            System.out.println("[CONTROLLER] Resposta: 201 Created.");
        } catch (IllegalArgumentException e) {
            System.out.println("[CONTROLLER] Resposta: 400 Bad Request. Erro: " + e.getMessage());
        }
    }
}

// MÉTODO MAIN: A montagem da nossa engrenagem de 3 camadas!
public class Main {
    public static void main(String[] args) {
        // 1. Criamos o Repository (Banco de Dados)
        EmpresaRepository repository = new EmpresaRepository();

        // 2. Injetamos o Repository no Service 
        EmpresaService service = new EmpresaService(repository);

        // 3. Injetamos o Service no Controller 
        EmpresaController controller = new EmpresaController(service);

        // 4. Simulando duas requisições que chegam da Web
        EmpresaDTO requisicao1 = new EmpresaDTO("12345678000199", "Contabilidade Nova Era");
        EmpresaDTO requisicao2 = new EmpresaDTO("98765432000188", "Padaria do Bairro");

        controller.postCadastrar(requisicao1);
        controller.postCadastrar(requisicao2);

        // 5. Provando que os dados realmente foram persistidos na nossa simulação!
        System.out.println("\n--- Consultando 'Banco de Dados' no final do dia ---");
        for (Empresa emp : service.listarEmpresasSalvas()) {
            System.out.println("Empresa Cadastrada -> ID: " + emp.getId() + " | Nome: " + emp.getRazaoSocial());
        }
    }
}