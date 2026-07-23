O Conceito: Exercício 37 – Recebendo Parâmetros na URL com @PathVariable
No ecossistema REST, as URLs são usadas para identificar recursos específicos de forma clara e elegante. Em vez de criar um endpoint fixo como /resumo, muitas vezes você precisa consultar uma empresa específica informando o ID dela direto no endereço da requisição:

GET 

http://localhost:8080/api/empresa/42

A utilidade prática da anotação @PathVariable (Variável de Caminho) é instruir o Spring Boot a extrair aquele valor dinâmico digitado no meio da URL e passá-lo como argumento diretamente para o parâmetro do seu método Java.

💻 Exemplo Prático em Java (Sintaxe Spring Boot)
Repare em como usamos as chaves {id} na rota para indicar que aquele trecho do caminho é dinâmico e será capturado pelo @PathVariable:

###########################

Exemplo básico de getmapping, onde o usuário passa um valor pela url e ele é coletado e salvo em uma variavel long id, que está dentro de um metodo sendo usado como parametro
Depois é comparado para criar ou não o json usando o dto
E um outro exemplo onde simplesmente há um metodo que exibe a variavel que está sendo passada na tela