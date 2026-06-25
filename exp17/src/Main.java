import java.util.ArrayList;

class Livro{
    private String titulo;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

}

class Estante{
    private String categoria;
    //O ArrayList armazena multiplos objetos do tipo Livro de forma dinâmica
    private ArrayList<Livro> livros;

    public Estante(String categoria){
        this.categoria = categoria;
        this.livros = new ArrayList<>(); //Inicializando a lista vazia
    }

    //Metodo para adicionar um novo objeto a nossa coleção flexivel
    public void adicionarLivro(Livro novoLivro){
        this.livros.add(novoLivro);
        System.out.println("Livro " + novoLivro.getTitulo() + " adicionado a estante de " + this.categoria);
    }

    public void listarLivros(){
        System.out.println("Livros na estante de " + this.categoria);
        //Loop "for-each" para percorrer cada objeto da nossa lista dinâmica
        for (Livro livro : this.livros){
            System.out.println("- " + livro.getTitulo());
        }
    }
}

public class Main {
    static void main(String[] args) {
        //Criando nossa entidade gerenciadora (a estante)
        Estante minhaEstante = new Estante("Tecnologia");

        //Criando instancias isoladas dos objetos
        Livro l1 = new Livro("Java Efetivo");
        Livro l2 = new Livro("Clean code");
        Livro l3 = new Livro("Spring boot da Massa");

        //Alimentando a coleção sem se preocupar com tamanhos fixos
        minhaEstante.adicionarLivro(l1);
        minhaEstante.adicionarLivro(l2);
        minhaEstante.adicionarLivro(l3);

        //Exibindo todos os elementos capturados pela lista
        minhaEstante.listarLivros();
    }
}
