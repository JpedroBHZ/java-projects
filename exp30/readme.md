O Conceito: Exercício 30 – Exceções Customizadas: Criando Regras de Erro de Negócio Personalizadas   

No exercício anterior, você viu que o Java possui erros nativos (como o ArithmeticException). Porém, no desenvolvimento de APIs reais, a maioria dos erros que acontecem não são falhas matemáticas ou de memória, mas sim violações das regras de negócio do seu sistema.  

Por exemplo, o Java não faz a menor ideia de que um faturamento não pode dar Infinity, de que um CNPJ precisa ter 14 dígitos ou de que o saldo de um cliente não pode ficar negativo no escritório. Para a máquina, essas operações são matematicamente válidas.

A utilidade prática das Exceções Customizadas é permitir que você crie os seus próprios erros personalizados (herdando de RuntimeException). Isso te dá o poder de interromper o fluxo do sistema propositalmente usando a palavra-chave throw new sempre que uma regra de negócio do seu escritório for desobedecida. No Spring Boot, isso é fundamental para capturar o erro em uma camada centralizada e responder para o cliente um JSON limpo com o motivo exato do bloqueio.  

💻 Exemplo Prático em Java

Vamos resolver em definitivo o problema do faturamento Infinity (com double) e criar uma exceção customizada chamada RegraNegocioException.