interface EstrategiaHonorario{
    double calcularHonorario(double faturamentoMensal);
}

//Classe concreta 1
class HonorarioSimplesNacional implements EstrategiaHonorario{
    @Override
    public double calcularHonorario(double faturamentoMensal){
        return 500.0 + (faturamentoMensal * 0.05);
    }
}

//Classe concreta 2
class HonorarioLucroPresumido implements EstrategiaHonorario{
    @Override
    public double calcularHonorario(double faturamentoMensal){
        return 1200.0 + (faturamentoMensal * 0.012);
    }
}

//Fluxo principal: 100% desacoplado. Ele não conhece nenhuma classe concreta
class ProcessadorHonorarioContabil{
    //A classe depende apenas do contrato (interface)
    private EstrategiaHonorario estrategia;

    //Injeção manual via construtor: quem dita a regra é o mundo externo
    public ProcessadorHonorarioContabil(EstrategiaHonorario estrategia){
        this.estrategia = estrategia;
    }

    public void emitirCobrancaMensal(String nomeEmpresa, double faturamento){
        //Ele executa o cálculo sem fazer a menor ideia de qual é a formula matemática
        double valorFinal = this.estrategia.calcularHonorario(faturamento);

        System.out.println("[Faturamento do escritório] Empresa: " + nomeEmpresa);
        System.out.println("Boleto de honorários gerado: " + valorFinal);
        System.out.println("---------------------------------------------");
    }
}

public class Main {
    static void main(String[] args) {
        double faturamentoTeste = 100000.0;

        //Cenário A: O sistema decide usar a regra do simples nacional
        EstrategiaHonorario regimeSimples = new HonorarioSimplesNacional();
        //Injetamos a peça de Lego do Simples no nosso motor principal
        ProcessadorHonorarioContabil processadorA = new ProcessadorHonorarioContabil(regimeSimples);
        processadorA.emitirCobrancaMensal("Contabilidade Nova Era", faturamentoTeste);

        //Cenário B: O sistema decide usar a regra do Lucro Presumido
        EstrategiaHonorario regimmeLucro = new HonorarioLucroPresumido();
        //Injetamos a peça de Lego do Lucro Presumido no MESMO motor principal
        ProcessadorHonorarioContabil processadorB = new ProcessadorHonorarioContabil(regimmeLucro);
        processadorB.emitirCobrancaMensal("Metalúrgia Alfa", faturamentoTeste);
    }
}
