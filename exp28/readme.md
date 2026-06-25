O Conceito: Exercício 28 – Desacoplamento: Classe de Fluxo Principal que Recebe uma Interface sem Depender de Classes Concretas   

Este exercício é o ponto alto da Fase 3 e representa a virada de chave definitiva para você entender como o Spring Boot organiza o fluxo de uma API.   

Na programação procedural ou em códigos acoplados, quando uma classe principal precisa executar uma ação, ela dá um new diretamente na classe que resolve o problema. Isso gera uma dependência rígida: se a classe que você instanciou mudar, seu fluxo principal quebra.   

A utilidade prática do Desacoplamento total é fazer com que a sua classe de fluxo principal (que no futuro será o seu @Service ou @Controller) converse apenas com a Interface.  Ela passa a receber o contrato pelo construtor. Quem decide qual classe concreta (qual "peça de Lego") vai rodar ali dentro é quem chama o fluxo principal. O seu motor principal fica 100% blindado contra alterações de regras de negócio.   

💻 Exemplo Prático em Java

Vamos criar o ProcessadorHonorarioContabil (nosso fluxo principal). Repare que ele não faz nenhum new. Ele apenas recebe o contrato EstrategiaHonorario criado no exercício anterior e manda executar.   