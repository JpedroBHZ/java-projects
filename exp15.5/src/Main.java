class Dono{
    private String nome;

    public Dono(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

class Livro {
    private String titulo;
    private Dono donoAtual;

    public Livro(String titulo){
        this.titulo = titulo;
    }
    public void setDono(Dono novoDono){
        this.donoAtual = novoDono;
    }

    public void doarLivro(Dono novoDono){
        if(novoDono != null){
            System.out.println(this.donoAtual.getNome() + " está dondo o livro " + this.titulo + " para " + novoDono.getNome());
        } else {
            System.out.println("O livro " + this.titulo + " saiu do estoque direto para as mãos de " + novoDono.getNome());
        }

        this.donoAtual = novoDono;
        System.out.println("Sucesso, o novo dono do livro " + this.titulo + " agora é: " + this.donoAtual.getNome());
    }

    public void removerDono() {
        this.donoAtual = null;
        System.out.println("O livro " + this.titulo + " agora está disponível prateleira");
    }

    public String getTitulo(){
        return titulo;
    }

    public String getNomeDoDono(){
        //If else de uma linha só, (if donoAtual != null) então donoAtual.getNome() se não "Sem dono"
        return (donoAtual != null) ? donoAtual.getNome() : "Sem dono";
    }

}

public class Main {
    static void main(String[] args) {
        Dono alex = new Dono("Alex");
        Dono joao = new Dono("João");

        Livro livroJava = new Livro("Java efetivo");
        System.out.println("O status inicial do livro é " + livroJava.getNomeDoDono());

        livroJava.setDono(alex);
        System.out.println("Após compra o dono atual: " + livroJava.getNomeDoDono());
        livroJava.doarLivro(joao);

        System.out.println("Staus final " + livroJava.getNomeDoDono());
    }
}