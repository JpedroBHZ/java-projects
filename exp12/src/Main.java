//O MOLDE: definição da Classe
class Livro{
    //ATRIBUTOS (Características que todo Livro terá)
    String titulo;
    String autor;
    int paginas;

    //SEU PRIMEIRO CONSTRUTOR: Forçando os dados obrigatórios
    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo; //this.titulo é o atributo. "titulo" é o parametro
        this.autor = autor;
        this.paginas = paginas;
    }

    //MÉTODO (comportamento que o livro sabe executar)
    void exibirFichaTecnica(){
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}

class Carro{
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("--- Dados do Carro ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    static void main(String[] args) {
        //Agora criamos o objeto e passamos os dados DIRETO no parênteses do 'new'
        Livro livroFavorito = new Livro("O senhor dos Anéis", "J.R.R Tolkien", 1200);
        //Se você tentasse fazer Livro livroErro = new Livro();
        //O Java nem compilaria o código, acusando erro de cara
        livroFavorito.exibirFichaTecnica();

        Carro meuCarro = new Carro("Volkswagen", "Polo", 2024);
        meuCarro.exibirDados();
    }
}
