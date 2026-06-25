public class ValidarMaioridade {
    static void main(String[] args){
        //Declarando a variável com seu tipo (int para números inteiros)
        int idade = 17;

        //A estrtura condicional avalia a regra de negocio
        if (idade >= 65) {
            System.out.println("Acesso liberado. O usuário é idoso e tem prioridade.");
        } else if (idade > 18) {
            System.out.println("Acesso liberado. O usuário é maior de idade.");
        } else {
            System.out.println("Acesso negado. Usuário menor de idade");
        }
    }
}
