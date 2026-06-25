O Conceito: Exercício 24 – Classes Abstratas: Criando Moldes Conceituais Bloqueados para Instanciação

Até agora, usamos a classe Contribuinte como nossa classe mãe. Mas pare para pensar: no mundo real do escritório contábil, existe uma pessoa que é apenas um "contribuinte genérico"? Não. Ou a pessoa é uma Pessoa Física (CPF), ou ela é uma Pessoa Jurídica (CNPJ). A classe mãe serve apenas como um conceito, um molde abstrato para unir as regras comuns.

A utilidade prática das Classes Abstratas (usando a palavra-chave abstract) é justamente proibir que alguém dê um new Contribuinte() por engano no sistema, pois uma entidade puramente genérica não deveria existir na memória.

Além disso, ela permite criar Métodos Abstratos: métodos que não possuem corpo {} (sem lógica), servindo como um "contrato obrigatório". Ao declarar um método abstrato na classe mãe, você obriga, sob pena de erro de compilação, todas as classes filhas a implementarem e escreverem suas próprias versões daquela lógica.

💻 Exemplo Prático em Java

Repare que agora a classe Contribuinte ganhou a palavra-chave abstract. Se tentarmos instanciá-la diretamente no main, o Java vai impedir.