O Conceito: Exercício 38 – Criando Recursos na API: Recebendo Dados no Corpo com @PostMapping e @RequestBody
Até agora, nos exercícios 36 e 37, nós focamos na leitura de dados (GET). Mas e quando um usuário preenche um formulário no aplicativo ou sistema web e clica em "Cadastrar Empresa"?

No ecossistema de APIs REST:

Para consultar/ler dados, usamos o método HTTP GET.

Para criar/cadastrar um novo registro no banco de dados, usamos o método HTTP POST.

Ao cadastrar algo novo, os dados não devem ir expostos na URL. Eles viajam escondidos e protegidos dentro do corpo da requisição (Request Body) no formato JSON.

As duas anotações fundamentais aqui são:

@PostMapping: Avisa ao Spring que este método deve ser acionado apenas quando a requisição for um HTTP POST na rota especificada.

@RequestBody: É o "mágico" do Spring Boot. Ele pega o texto JSON bruto que veio no corpo da requisição e o deserializa (converte) automaticamente para um objeto Java (geralmente o seu DTO)!

💻 Exemplo Prático em Java (Sintaxe Spring Boot)
Repare como o DTO que você aprendeu lá no Exercício 32 agora é recebido diretamente como parâmetro do método, anotado com @RequestBody:

##############################################

Explicação

Basicamente foi ensinado a usar o postmapping, uma rota que enviamos dados que são coletados e armazenados em variaveis
Notem a necessidade dos contrutores no dto, o vazio e o completo, para que o springboot se encarregue de transportar os dados nas variáveis