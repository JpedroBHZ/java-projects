🧠 O Conceito: Exercício 08 – Tratamento de Dados: Formatador de Nomes e Strings No desenvolvimento backend e na construção de APIs, você raramente pode confiar na forma como o usuário digita os dados de texto. Um usuário pode cadastrar o nome como "joão silva", outro como "MARIA SOUZA", e um terceiro pode apertar a barra de espaço várias vezes sem querer, enviando "   Pedro   ".  

Se você salvar os dados bagunçados assim no banco de dados, a busca por esses registros fica inconsistente e a interface do sistema fica com uma aparência amadora. Em Java, a classe String nos fornece métodos prontos para limpar e formatar esses textos, garantindo a padronização dos dados (como remover espaços extras e padronizar maiúsculas/minúsculas) antes que eles cheguem às camadas de serviço ou persistência.  

💻 Exemplo Prático em JavaVamos simular a entrada de um nome vindo de um formulário web totalmente desconfigurado. Veja como usamos .trim() para remover os espaços inúteis das pontas e .toUpperCase() para padronizar o texto em letras maiúsculas:

````java
Javapublic class FormatadorNomes {
public static void main(String[] args) {
// Simulando uma entrada de dados com espaços extras e caixa mista
String nomeBruto = "   joão pedro bergamasco   ";

        // 1. .trim() remove os espaços em branco no início e no fim da String
        String nomeSemEspacos = nomeBruto.trim();

        // 2. .toUpperCase() transforma todos os caracteres em maiúsculo
        String nomePadronizado = nomeSemEspacos.toUpperCase();

        System.out.println("Texto Original: '" + nomeBruto + "'");
        System.out.println("Texto Tratado: '" + nomePadronizado + "'");
    }
}
````

🛠️ Seu Desafio de ModificaçãoAlém de limpar espaços e mudar a caixa do texto, muitas vezes precisamos substituir pedaços de uma String (como trocar caracteres inválidos ou censurar palavras).

Para isso, o Java possui o método .replace("alvo", "substituto").Modifique o código acima para simular um formatador de códigos de produto ou CPF. O sistema receberá uma String documentoBruto = "123.456.789-00";Você deve aplicar o método .replace() para remover os pontos (.) e o hífen (-), transformando-o em uma String contendo apenas os números limpos (12345678900).

Dica: Você pode encadear os métodos, chamando um .replace() logo atrás do outro, por exemplo: texto.replace(".", "").replace("-", "").