🧠 O Conceito: Exercício 32 – Padrão DTO (Data Transfer Object): Classe Simples Apenas para Transporte de Dados   

Quando construímos uma API, nunca devemos expor nossas entidades do banco de dados diretamente para o mundo externo (a internet), nem aceitar qualquer dado que o usuário envie direto nelas. Se a sua classe Empresa tem campos internos sensíveis (como senhas, dados de auditoria ou IDs internos), expor isso é uma grande falha de segurança e arquitetura.

A utilidade prática do Padrão DTO (Data Transfer Object) é criar objetos específicos, extremamente simples e sem lógica de negócio, feitos estritamente para transportar os dados que entram ou saem da sua API. O DTO funciona como uma barreira ou um filtro de segurança: ele dita exatamente o formato do JSON que a API vai aceitar receber ou devolver, protegendo a integridade do seu sistema.  

💻 Exemplo Prático em Java

Vamos simular o cenário onde o usuário quer cadastrar uma nova empresa na API do escritório. Em vez de receber a entidade do banco de dados direto na requisição, nós recebemos um EmpresaRequestDTO.