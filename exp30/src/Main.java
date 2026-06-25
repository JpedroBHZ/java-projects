//1. Criamos a nossa própria classe de erro, herdando de RuntimeException
class RegraNegocioException extends RuntimeException {
    public RegraNegocioException(String mensagem){
        //Passamos a mensagem de erro para a classe mãe do Java tratar
        super(mensagem);
    }
}

class CalculadoraContabil{
    //2. Método de negócio que valida a regra antes de fazer a conta com double
    public double calcularFaturamentoMedio(double faturamentoAnual, int mesesAtivos){
        if (mesesAtivos <= 0) {
            //Lançamos o nosso erro personalizado de forma ativa
            throw new RegraNegocioException("Meses ativos inválidos (" + mesesAtivos + "). Deve ser maior que zero.");
        }
        return faturamentoAnual / mesesAtivos;
    }
}

public class Main {
    static void main(String[] args) {
       CalculadoraContabil calculadora = new CalculadoraContabil();

       double faturamentoAnual = 150000.0; //tipo double seguro para dinheiro
       int mesesAtivos = 0; //Cenário que antes gerava "Infinity"

       try {
           System.out.println("Tentando processar faturamento com tipo double...");

           double resultado = calculadora.calcularFaturamentoMedio(faturamentoAnual, mesesAtivos);
           System.out.println("Faturamento medio mensal: R$ " + resultado);
       }
        //3. Capturamos especificamente a nossa classe de erro de negócio
       catch (RegraNegocioException e){
           System.out.println("[BLOQUEIO DE NEGÓCIO]: " + e.getMessage());
           System.out.println("Ação: operação cancelada para impedir dados corrompidos");
       }

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Aplicação protegida contra regras invalidas com sucesso");
    }
}
