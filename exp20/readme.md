Em APIs REST, o banco de dados nos envia cópias de dados o tempo todo. Se duas instâncias diferentes na memória possuem o mesmo CNPJ, elas representam a mesma empresa no mundo real.  

equals() dentro do objeto: Garante que o sistema saiba que Empresa A e Empresa B são a mesma entidade se o CNPJ for igual, não importando se estão em lugares diferentes da memória.

hashCode() dentro do objeto: Garante que, ao usar um HashMap ou HashSet, o Java calcule o mesmo código de "gaveta" para o CNPJ, permitindo que a busca seja instantânea.  