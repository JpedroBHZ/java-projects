//Primeira peça de lego: O dono
class Dono{
    private String nome;
    private String email;

    public Dono(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){ return nome; }
    public String getEmail(){ return email; }
}

//Segunda peça de lego: O livro (que usa a classe dono)
class Livro{
    private String titulo;
    private Dono dono; //O atributo não é string, int.. é um objeto da classe dono

    public Livro(String titulo){
        this.titulo = titulo;
    }

    //Metodo para associar um dono a este livro
    public void setDono(Dono dono){
        this.dono = dono;
    }

    public void exibirFicha(){
        System.out.println("Livro: " + titulo);
        if (dono != null){
            //Acessamos os dados do dono de dentro do objeto livro
            System.out.println("Dono do livro: " + dono.getNome() + " (" + dono.getEmail() + ")");
        } else {
            System.out.println("Este livro não tem um dono associado");
        }
    }
}

public class Main {
    static void main(String[] args) {
        //1. Criamos o livro
        Livro livro = new Livro("Clean code");

        //2. Criamos o dono isoladamente
        Dono donoDoCodigo = new Dono("Alex", "alex@email.com");

        //3. Fazemos a ASSOCIAÇÃO (coonectamos as duas peças de lego)
        livro.setDono(donoDoCodigo);

        //4. Exibimos o resultado
        livro.exibirFicha();

    }
}
