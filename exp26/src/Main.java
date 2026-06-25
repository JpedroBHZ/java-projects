//O contrato: define o que deve ser feito
interface CanalNotificacao{
    void enviarAlerta(String mensagem); //Contrato puro
}

//Classe 1: Assina o contrato e resolve "como" usando a lógica de email
class NoticicacaoEmail implements CanalNotificacao{
    private String emailDestinatario;

    public NoticicacaoEmail(String emailDestinatario){
        this.emailDestinatario = emailDestinatario;
    }

    @Override
    public void enviarAlerta(String mensagem){
        System.out.println("[Email enviado para " + this.emailDestinatario + "]:" + mensagem);
    }
}

//Classe 2: Assina o mesmo contrato, mas resolve o "como" usando a lógica do Whatsapp
class NotificacaoWhatsapp implements CanalNotificacao{
    private String numeroTelefone;

    public NotificacaoWhatsapp(String numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarAlerta(String mensagem){
        System.out.println("[Whatsapp enviado para " + this.numeroTelefone + "]: Alerta urgente: " + mensagem);
    }
}

public class Main {
    static void main(String[] args) {
        //Duas classes com funções completamente diferentes
        CanalNotificacao email = new NoticicacaoEmail("cliente@empresa.com");
        CanalNotificacao whats = new NotificacaoWhatsapp("(11) 99999-9999");

        System.out.println("--- Rotina de avisos do escritório ---");

        //Respondendo exatamente ao mesmo comando do contrato!
        email.enviarAlerta("Sua guia do Simples Nacional vence amanhã");
        whats.enviarAlerta("Sua guia do simples nacional vence amanhã");
    }
}
