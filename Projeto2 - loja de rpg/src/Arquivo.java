import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arquivo {
    private static final String CAMINHO = "save.txt";

    // MÉTODO PARA SALVAR
    public static void salvar(Jogador jogador) {
        try (PrintWriter writer = new PrintWriter(new File(CAMINHO))) {
            // Salva os dados básicos separados por ;
            writer.println(jogador.getNome() + ";" + jogador.getOuro() + ";" + jogador.getVida());
            
            // Salva cada item do inventário em uma linha
            for (Item i : jogador.getInventario()) {
                writer.println(i.getNome());
            }
            System.out.println("Jogo salvo!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    // MÉTODO PARA CARREGAR
    public static Jogador carregar() {
        try (Scanner leitorArquivo = new Scanner(new File(CAMINHO))) {
            if (leitorArquivo.hasNextLine()) {
                // Lê a primeira linha e separa os dados
                String[] dados = leitorArquivo.nextLine().split(";");
                String nome = dados[0];
                int ouro = Integer.parseInt(dados[1]);
                int vida = Integer.parseInt(dados[2]);

                Jogador jogadorCarregado = new Jogador(nome, ouro, vida);

                // Lê o restante das linhas (itens)
                while (leitorArquivo.hasNextLine()) {
                    String nomeItem = leitorArquivo.nextLine();
                    // Aqui criamos o item com preço 0 pois ele já foi comprado
                    jogadorCarregado.getInventario().add(new Item(nomeItem, 0));
                }
                return jogadorCarregado;
            }
        } catch (Exception e) {
            // Se o arquivo não existir, apenas retorna null para criar um novo
        }
        return null;
    }
}