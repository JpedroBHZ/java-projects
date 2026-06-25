//O contrato: define a operação matemática da regra de negócio
interface EstrategiaHonorario{
    double calcularHonorario(double faturamentoMensal);
}

//Regra 1: Classe isolada para empresas do simples nacional
class HonorarioSimplesNacional implements EstrategiaHonorario{
    @Override
    public double calcularHonorario(double faturamentoMensal){
        return 500.0 + (faturamentoMensal * 0.005);
    }
}

//Regra 2: Classe isolada para empresas de Lucro Presumido (mais complexas)
class HonorarioLucroPresumido implements EstrategiaHonorario{
    @Override
    public double calcularHonorario(double faturamentoMensal){
        //Cobra um valor base maior mais uma taxa de 1.2% do faturamento
        return 1200.0 + (faturamentoMensal * 0.012);
    }
}

public class Main {
    static void main(String[] args) {
        double faturamentoDaEmpresa = 100000.0;

        //Conseguimos alterar a regra de negócio trocando apenas a instancia da interface
        EstrategiaHonorario regraSimples = new HonorarioSimplesNacional();
        EstrategiaHonorario regraLucro = new HonorarioLucroPresumido();

        System.out.println("--- Simulação de Honorários do Escritório ---");

        System.out.println("Se a empresa for simples nacional: R$ " + regraSimples.calcularHonorario(faturamentoDaEmpresa));
        System.out.println("Se a empresa for Lucro Presumido: R$ " + regraLucro.calcularHonorario(faturamentoDaEmpresa));

    }
}
