import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void limpar() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // Se der erro, ele apenas pula a limpeza
        }
    }

    public static void main(String[] args) throws Exception {

        limpar();
        Scanner leitor = new Scanner(System.in);

        // Tenta carregar o progresso
        Jogador jogador = Arquivo.carregar();

        if (jogador == null) {
            System.out.println("Aventura rpg");
            System.out.print("Digite o nome do heroi: ");
            String nome = leitor.next();
            jogador = new Jogador(nome, 0, 10);
        } else {
            System.out.println("Bem-vindo de volta, " + jogador.getNome() + "!");
        }

        Thread.sleep(1000);
        List<Item> loja = new ArrayList<>();
        loja.add(new Item("Espadinha", 10));
        loja.add(new Item("Espadão", 50));
        loja.add(new Item("Cajado", 100));

        while (jogador.getVida() > 0) {

            limpar();
            System.out.println("O que quer fazer?");
            System.out.println("1 - Matar mobs");
            System.out.println("2 - Comprar item");
            System.out.println("3 - Ver inventario");
            System.out.println("4 - Salvar e sair");
            int opcao = leitor.nextInt();

            limpar();
            switch (opcao) {
                case 1:
                    jogador.matarMonstro();
                    break;
                case 2:
                    System.out.println("Bem vindo a loja, o que gostaria de comprar?" + " ouro:" + jogador.getOuro());

                    // Lista todos os itens da lista 'loja' automaticamente
                    for (int i = 0; i < loja.size(); i++) {
                        Item item = loja.get(i);
                        System.out.println((i + 1) + " - " + item.getNome() + " : " + item.getPreco() + " ouro");
                    }

                    System.out.println("0 - Sair da loja");
                    int escolha = leitor.nextInt();
                    limpar();

                    if (escolha > 0 && escolha <= loja.size()) {
                        // Pegamos o item da lista (ajustando o -1 porque a lista começa em 0)
                        Item itemEscolhido = loja.get(escolha - 1);
                        jogador.comprar(itemEscolhido);
                    } else if (escolha != 0) {
                        System.out.println("Opção inválida!");
                    }

                    break;
                case 3:
                    if (jogador.getInventario().isEmpty()) {
                        System.out.println("Você ainda não tem itens.");
                    } else {
                        for (Item i : jogador.getInventario()) {
                            System.out.println("*" + i.getNome());
                        }
                    }
                    break;
                case 4:
                    Arquivo.salvar(jogador);
                    jogador.setVida(0);
                    break;
                default:
                    System.out.println("Opcão invalida");
                    break;
            }
            Thread.sleep(1000);

        }

        leitor.close();
    }
}
