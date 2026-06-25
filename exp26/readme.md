O Conceito: Exercício 26 – Implementação de Interface: Fazendo Diferentes Classes Assinarem o Mesmo Contrato

No exercício anterior (25), nós criamos o conceito puro da Interface. Agora, a utilidade prática é ver o poder do desacoplamento acontecendo : fazer classes de universos totalmente diferentes assinarem e executarem esse mesmo contrato de comportamento.  

Imagine que, no sistema do escritório contábil, você precise de uma rotina para enviar notificações de alertas urgentes aos clientes. Não importa se o alerta vai por E-mail ou por WhatsApp; o sistema principal só quer disparar a mensagem sem precisar saber como cada tecnologia funciona por baixo dos panos. Criamos a interface e fazemos as classes concretas a implementarem.  