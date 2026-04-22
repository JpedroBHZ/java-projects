import java.util.ArrayList;
import java.util.List;

public class Jogador {
    public String nome;
    public int ouro;
    public List<Item> inventario; //Lista de objetos do tipo item

    public Jogador(String nome, int ouro){
        this.nome = nome;
        this.ouro = ouro;
        this.inventario = new ArrayList<>();
    }

    public void comprar(Item item){
        if (this.ouro >= item.preco){
            this.ouro -= item.preco;
            this.inventario.add(item);
            System.out.println("Você comprou: " + item.nome);
        } else {
            System.out.println("Ouro insuficiente para comprar");
        }
    }

}
