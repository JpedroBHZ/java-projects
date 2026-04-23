public class Item {
    private String nome;
    private int preco;

    //Construtor
    public Item(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

}
