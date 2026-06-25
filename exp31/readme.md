O Conceito: Exercício 31 – Injeção de Dependências Manual: Passando Serviços Via Construtor de Outra Classe

Parabéns por chegar à Fase 4! A partir daqui, nosso foco total é entender como as "peças de Lego" se encaixam no ecossistema de uma API com Spring Boot.  

No Exercício 28, você viu o poder do desacoplamento ao fazer uma classe depender apenas de uma interface. A Injeção de Dependências é o ato prático de "entregar" a instância de que uma classe precisa para trabalhar, em vez de deixar que ela mesma crie essa instância com um new.  

No desenvolvimento backend, se a sua classe EmpresaController precisa da classe EmpresaService para validar dados, você injeta o Service dentro do Controller via construtor. Fazer isso manualmente agora vai clarear sua mente para quando o Spring Boot assumir essa tarefa e fizer a injeção de forma 100% automática com a anotação @Autowired.  

💻 Exemplo Prático em Java

Vamos simular o esqueleto de duas camadas de uma API do escritório contábil. Repare que a classe principal recebe sua dependência estritamente pelo construtor. 