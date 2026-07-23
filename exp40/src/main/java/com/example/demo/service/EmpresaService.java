package com.example.demo.service;

import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa salvar(Empresa empresa) {
        // O método .save() já faz o INSERT no banco H2 automaticamente!
        return this.empresaRepository.save(empresa);
    }

    public List<Empresa> listarTodas() {
        // O método .findAll() já faz o SELECT * FROM empresa no H2!
        return this.empresaRepository.findAll();
    }
}