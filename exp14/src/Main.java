class Livro{
    private String titulo;
    private boolean emprestado; //Por padrão boolean nasce false

    public Livro(String titulo){
        this.titulo = titulo;
    }

    //MÉTODO DO OBJETO: Regra de negócio interna
    public void emprestarLivro(){
        if (!this.emprestado){ //Se NÃO tiver emprestado
            this.emprestado = true;
            System.out.println("Sucesso, o livro: '" + this.titulo + "' foi emprestado");
        } else {
            System.out.println("Aviso: o livro: '" + this.titulo + "´ já está ocupado no momento");
        }
    }

    //MÉTODO DE OBJETO: Outro comportamento que muda o estado do objeto
    public void devolverLivro(){
        if (this.emprestado){
            this.emprestado = false;
            System.out.println("Sucesso: o livro " + this.titulo + " foi devolvido e está disponível ");
        } else {
            System.out.println("Aviso: este livro já estava na prateleira");
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    //Getters de boolean começam com is
    public boolean isEmprestado() {
        return emprestado;
    }
}

public class Main {
    static void main(String[] args) {
        Livro livro = new Livro("Design Patterns");

        //Tentando interagir com o objeto através de suas ações
        livro.emprestarLivro(); //Sucesso
        livro.emprestarLivro(); //Já emprestado
        livro.devolverLivro(); //Sucesso
    }
}
