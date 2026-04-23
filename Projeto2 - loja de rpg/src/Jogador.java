import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogador {
    private String nome;
    private int ouro, vida;
    private List<Item> inventario;

    public Jogador(String nome, int ouro, int vida) {
        this.nome = nome;
        this.ouro = ouro;
        this.vida = vida;
        this.inventario = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void matarMonstro() {
        Random gerador = new Random();
        int drop = gerador.nextInt(20) + 10;
        System.out.println("Você ganhou: " + drop + " ouros");
        this.ouro += drop;
    }

    public void comprar(Item item) {
        if (this.ouro >= item.getPreco()) {
            this.ouro -= item.getPreco();
            this.inventario.add(item);
            System.out.println("Você comprou: " + item.getNome());
        } else {
            System.out.println("Ouro insuficiente!");
        }
    }
}