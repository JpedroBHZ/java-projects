🧠 O Conceito: Exercício 11 – Criação de Classe: Modelagem de um Objeto   Na programação procedural, você costuma estruturar seus dados de forma solta: cria uma variável para o nome, outra para a idade, e funções isoladas que recebem esses dados por parâmetro. 

Na Orientação a Objetos (OO), nós mudamos a perspectiva: começamos a enxergar o sistema como "peças de Lego", onde agrupamos características (dados) e comportamentos (funções) dentro de uma mesma estrutura chamada Classe.  A Classe: É a "planta baixa" ou o molde de fábrica. Ela define o que um objeto daquele tipo terá e fará, mas ela em si é apenas o desenho técnico.  O Objeto (ou Instância): É o brinquedo de Lego construído a partir daquele molde. 

Você pode usar a mesma planta baixa para criar vários objetos diferentes, cada um com seus próprios dados.Na prática backend, tudo vira um objeto: um Usuario, um Produto ou uma TransacaoBancaria. Modelar uma classe é o primeiro passo para organizar seu código em caixas independentes que cuidam estritamente do seu quadrado.  


💻 Exemplo Prático em JavaVamos modelar uma classe para representar um Livro em um sistema de biblioteca. Note que criamos a classe (o molde) e, dentro do método main, criamos os objetos reais baseados nela.Java// O MOLDE: Definição da Classe

````java

class Livro {
// ATRIBUTOS (Características que todo Livro terá)
String titulo;
String autor;
int paginas;

    // MÉTODO (Comportamento que o Livro sabe executar)
    void exibirFichaTecnica() {
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Páginas: " + paginas);
    }
}

// O MUNDO REAL: Onde o sistema roda e cria as instâncias
public class Main {
public static void main(String[] args) {
// Criando o primeiro objeto (instanciando a classe Livro)
Livro livroFavorito = new Livro();
livroFavorito.titulo = "O Senhor dos Anéis";
livroFavorito.autor = "J.R.R. Tolkien";
livroFavorito.paginas = 1200;

        // Criando o segundo objeto (outro espaço na memória, dados diferentes)
        Livro livroEstudo = new Livro();
        livroEstudo.titulo = "Java Como Programar";
        livroEstudo.autor = "Deitel";
        livroEstudo.paginas = 900;

        // Chamando o comportamento de cada objeto
        livroFavorito.exibirFichaTecnica();
        livroEstudo.exibirFichaTecnica();
    }
}
````

🛠️ Seu Desafio de Modificação   

Para testar a sua habilidade de modelar o mundo real dentro do código:  Modifique o código acima criando uma nova classe chamada Carro (fora da classe Main).Adicione pelo menos 3 atributos a ela (ex: modelo, marca, ano).Crie um método dentro da classe Carro chamado exibirDados() que imprima essas informações organizadas.No método main da classe Main, instancie (crie) dois carros diferentes, atribua valores para eles e chame o método exibirDados() de cada um.