package com.example.demo.repository;

import com.example.demo.dto.EmpresaCadastroDTO;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

// @Repository: Avisa ao Spring que esta classe cuida do acesso ao Banco de Dados
@Repository
public class EmpresaRepository {

    // Simulação do banco de dados em memória RAM
    private final List<EmpresaCadastroDTO> tabelaEmpresas = new ArrayList<>();

    public void salvar(EmpresaCadastroDTO empresa) {
        tabelaEmpresas.add(empresa);
        System.out.println("💾 [REPOSITORY] Registro salvo no 'banco de dados' em memória!");
    }

    public List<EmpresaCadastroDTO> buscarTodas() {
        return tabelaEmpresas;
    }
}