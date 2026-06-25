class Livro{
    //ATRIBUTOS PRIVADOS: Ninguém de fora acessa diretamente
    private String titulo;
    private int paginas;

    //Construtor
    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        //Usamos o proprio setter no construtor para garantir a validação desde o nascimento
        setPaginas(paginas);
    }

    //GETTER para o Título (Permite apenas leitura)
    public String getTitulo(){
        return this.titulo;
    }

    //GETTER para as paginas
    public int getPaginas(){
        return this.paginas;
    }

    //SETTER para as páginas (Com a validação/blindagem do dado)
    public void setPaginas(int paginas){
        if (paginas > 0) {
            this.paginas = paginas;
        } else {
            System.out.println("Erro: a quantidade de páginas não pode ser menor ou igual a zero. Mantendo o valor anterior");
            this.paginas = 1; //Valor padrão seguro
        }
    }

}

public class Main {
    static void main(String[] args) {
        Livro livro = new Livro("Java efetivo", 400);

        //Livro.paginas = -50 ->Isso da erro de compilação agora. O atributo está protegido

        //Tentativa de alteração inválida via canal oficial (Setter)
        livro.setPaginas(-50);

        //Lendo o valor da forma segura via Getter
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Páginas reais no sistema " + livro.getPaginas()); //Continua 400
    }
}
