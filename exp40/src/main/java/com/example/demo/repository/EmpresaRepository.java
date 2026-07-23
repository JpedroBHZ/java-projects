package com.example.demo.repository;

import com.example.demo.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Passamos a Entidade (Empresa) e o tipo da Chave Primária (Long)
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    // Pronto! Herdamos métodos como:
    // .save(empresa)
    // .findAll()
    // .findById(id)
    // .deleteById(id)
    // Sem precisar escrever NENHUMA linha de código ou SQL!
}