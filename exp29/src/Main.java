public class Main {
    static void main(String[] args) {
        String empresa = "Contabilidade Nova Era";
        int faturamentoAnual = 120000;
        int mesesAtivos = 0; //Dado incorreto que causaria crash no sistema

        System.out.println("Iniciando procedimento de faturamento de " + empresa);

        //1. O bloco try protege o codigo que oferece risco de erro
        try{
            //A linha de baixo dispara um erro matematico
            int faturamentoMedio = faturamentoAnual / mesesAtivos;

            //Se o erro acontecer acima, o Java pula o restante do bloco 'try' imediatamente
            System.out.println("Faturamento medio mensal: R$ " + faturamentoMedio);

        } catch (ArithmeticException e){ // 2. O bloco 'catch' captura a exceção específica e executa a rota de fuga
            System.out.println("\n [LOG DE ERRO]: falha ao processar os dados da empresa " + empresa);
            System.out.println("Detalhe técnico: Divisão por zero detectada nos meses ativos");
            System.out.println("Ação recomendada: Corrija os meses cadastrados no banco de dados");
        }

        //3. O fluxo do sistema continua intacto após o tratamento do erro
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("O sistema contábil permanece estável e rodando em segundo plano");
    }
}
