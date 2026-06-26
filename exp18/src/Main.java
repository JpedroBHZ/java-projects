import java.util.ArrayList;
import java.util.Objects;

class Livro{
    private String titulo;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    //Ensinando objeto a se comparar
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(getTitulo(), livro.getTitulo());
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
        Livro livroParaBuscar = new Livro("Clean Code");
        Livro resultado = estante.buscarLivro(livroParaBuscar);

        if (resultado != null){
            System.out.println("Encontrado: " + resultado.getTitulo());
        } else {
            System.out.println("Livro não encontrado");
        }
    }
}
