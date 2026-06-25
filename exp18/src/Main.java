import java.util.ArrayList;

class Livro{
    private String titulo;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    //Ensinando objeto a se comparar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mesmo endereço de memória? É igual.
        if (obj == null || getClass() != obj.getClass()) return false; // Nulo ou classes diferentes? Diferente.

        Livro outroLivro = (Livro) obj; // Cast (conversão) para a classe Livro
        return this.titulo.equalsIgnoreCase(outroLivro.titulo); // Regra: Títulos iguais = Livros iguais
    }

    public String getTitulo(){
        return titulo;
    }
}

class Estante{
    private ArrayList<Livro> livros;

    public Estante(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro novoLivro){
        this.livros.add(novoLivro);
    }

    //Método de busca
    public Livro buscarLivro(Livro livroBuscado){
        for(Livro livroDaLista : this.livros){
            if(livroDaLista.equals(livroBuscado)){
                return livroDaLista;
            }
        }
        return null;
    }
}

public class Main {
    static void main(String[] args) {
        Estante estante = new Estante();
        estante.adicionarLivro(new Livro("Java Efetivo"));
        estante.adicionarLivro(new Livro("Clean Code"));

        //Criamos um molde com o titulo que o usuário digitou para buscar no sistema
        Livro livroParaBuscar = new Livro("clean code");
        Livro resultado = estante.buscarLivro(livroParaBuscar);

        if (resultado != null){
            System.out.println("Encontrado: " + resultado.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}
