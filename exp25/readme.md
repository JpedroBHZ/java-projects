O Conceito: Exercício 25 – Interfaces: O Nível Máximo de Desacoplamento e Contratos de Comportamento

Se as classes abstratas são moldes, as Interfaces são contratos puros. No Java, uma classe só pode herdar de uma única classe mãe (não existe herança múltipla). Mas e se você precisar que uma classe tenha comportamentos de mundos totalmente diferentes? É aí que entram as interfaces.

Imagine que, no escritório contábil, além de calcular impostos, algumas empresas específicas precisam emitir nota fiscal eletrônica e outras precisam passar por uma auditoria internacional. Nem todo contribuinte faz isso. Em vez de entupir a classe mãe Contribuinte com esses métodos, nós criamos contratos isolados chamados Interfaces (usando a palavra-chave interface).

A utilidade prática da interface é definir o que uma classe deve fazer, mas deixando totalmente a critério da classe decidir como fazer. Uma classe pode implementar (implements) quantas interfaces ela quiser. No Spring Boot, as interfaces são a lei: elas permitem que você troque toda a lógica de um sistema (como mudar o banco de dados de MySQL para PostgreSQL) sem quebrar nenhuma outra linha de código, porque o "contrato" da interface continua o mesmo.

💻 Exemplo Prático em Java

Vamos criar a interface EmissorNota e fazer apenas a PessoaJuridica assinar esse contrato.