O Conceito: Exercício 21 – Herança: Criando uma Classe Base e Suas Classes Derivadas

No desenvolvimento backend e na modelagem de sistemas, é muito comum termos entidades que compartilham as mesmas características, mas possuem propósitos ligeiramente diferentes. Imagine um sistema para o escritório contábil: você tem clientes que são "Pessoa Física" (CPF) e clientes que são "Pessoa Jurídica" (CNPJ). Ambos possuem nome, e-mail e telefone. Em vez de reescrever esses mesmos atributos em duas classes separadas — o que violaria o princípio de reaproveitamento de código —, nós usamos a Herança.  

A utilidade prática da Herança é permitir que você crie uma Classe Base (ou Mãe) com tudo o que é genérico e comum, e depois crie Classes Derivadas (ou Filhas) que estendem essa classe mãe usando a palavra-chave extends. As classes filhas "herdam" automaticamente todos os atributos e métodos da classe mãe e ganham o direito de focar estritamente nas suas particularidades.

