import java.util.ArrayList;

class Livro{
    private String titulo;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Estante{
    private ArrayList<Livro> livros;

    public Estante(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro novoLivro) {
        this.livros.add(novoLivro);
    }

    //Método de remoção: remove todos os itens que atenderem à condição
    public boolean removerPorTitulo(String tituloParaRemover) {
        // O Java varre a lista e remove se o título for igual (ignorando maiúsculas/minúsculas)
        return this.livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(tituloParaRemover));
    }

    public void listarEstante() {
        if (this.livros.isEmpty()) {
            System.out.println("A estante está completamente vazia.");
        } else {
            for (Livro livro : this.livros) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}

public class Main {
    static void main(String[] args) {
        Estante estante = new Estante();
        estante.adicionarLivro(new Livro("Java Efetivo"));
        estante.adicionarLivro(new Livro("Clean Code"));
        estante.adicionarLivro(new Livro("Arquitetura Limpa"));

        System.out.println("----- Estante antes da remoção -----");
        estante.listarEstante();

        System.out.println("Tentando remover o livro 'Clean Code'...");
        boolean foiRemovido = estante.removerPorTitulo("clean code");

        System.out.println("----- Estante após remoção -----");
        if (foiRemovido) {
            System.out.println("Remoção concluida");
        } else {
            System.out.println("Livro não encontrado");
        }
        estante.listarEstante();
    }
}
