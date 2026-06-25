//O molde: Definição da classe
class Livro{
    //ATRIBUTOS (Características que todo livro terá)
    String titulo;
    String autor;
    int paginas;

    //MÉTODO (Comportamento que o Livro sabe executar)
    void exibirFichaTecnica(){
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + paginas);
    }
}

class Carro {
    String modelo;
    String marca;
    int ano;

    void exibirDados() {
        System.out.println("### Dados do veículo ###");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

//O MUNDO REAL: Onde o sistema roda e cria as instancias
public class Main {
    static void main(String[] args) {
        //Criando o primeiro objeto (instanciando a classe Livro)
        Livro livroFavorito = new Livro();
        livroFavorito.titulo = "O senhor dos Aneis";
        livroFavorito.autor = "J.R.R Tolkien";
        livroFavorito.paginas = 1200;

        Livro livroEstudo = new Livro();
        livroEstudo.titulo = "Java como Programar";
        livroEstudo.autor = "Deitel";
        livroEstudo.paginas = 900;

        //Chamando comportamento de cada objeto
        livroFavorito.exibirFichaTecnica();
        livroEstudo.exibirFichaTecnica();

        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Polo";
        carro1.ano = 2024;

        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.ano = 2025;

        carro1.exibirDados();
        carro2.exibirDados();
    }
}
