O Conceito: Exercício 29 – Tratamento de Exceções (Try/Catch): Capturando Erros de Execução e Impedindo o Crash   

No desenvolvimento de aplicações web e APIs, seu código precisa estar preparado para imprevistos. Se o sistema tentar realizar uma operação inválida (como dividir um valor por zero, ler um arquivo inexistente ou processar um dado nulo), o Java interrompe o programa imediatamente (gera um crash), deixando o usuário final com a tela travada.  

A utilidade prática do bloco try-catch é agir como uma rede de segurança. Você instrui o Java a "tentar" (try) executar um bloco de código crítico. Caso ocorra uma falha de execução, o Java desvia o fluxo para o bloco de captura (catch), permitindo que a aplicação trate o erro de forma elegante, registre um log e continue rodando normalmente sem derrubar o servidor.  

💻 Exemplo Prático em Java

No contexto do escritório contábil, vamos simular o cálculo do faturamento médio mensal (faturamento anual dividido pelos meses de operação ativa). Se por um erro de cadastro os meses ativos estiverem como 0, o sistema enfrentará uma divisão por zero (ArithmeticException). O try-catch evita o colapso da aplicação.