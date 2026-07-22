package com.example.demo.service;

import com.example.demo.dto.EmpresaCadastroDTO;
import com.example.demo.repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

// @Service: Avisa ao Spring que esta classe contém o cérebro / regras de negócio da aplicação
@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    // INJEÇÃO AUTOMÁTICA DO SPRING: O Spring injeta o Bean do Repository aqui no construtor!
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public void cadastrarEmpresa(EmpresaCadastroDTO dto) {
        // Validação de Negócio
        if (dto.getCnpj() == null || dto.getCnpj().length() != 14) {
            throw new IllegalArgumentException("CNPJ deve conter exatamente 14 dígitos!");
        }

        System.out.println("⚙️ [SERVICE] Dados validados com sucesso!");
        // Delegação para o Repository salvar no banco
        this.empresaRepository.salvar(dto);
    }

    public List<EmpresaCadastroDTO> listarTodas() {
        return this.empresaRepository.buscarTodas();
    }
}