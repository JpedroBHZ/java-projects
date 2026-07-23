package com.example.demo.controller;

import com.example.demo.dto.EmpresaCadastroDTO;
import com.example.demo.model.Empresa;
import com.example.demo.service.EmpresaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    // Injeção do Service no Construtor
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    // 1. ENDPOINT POST: Salva a Empresa no Banco de Dados H2
    // URL: POST http://localhost:8080/api/empresa/cadastrar
    @PostMapping("/cadastrar")
    public ResponseEntity<Empresa> cadastrar(@RequestBody EmpresaCadastroDTO dto) {

        // Converte o DTO recebido da Web em uma Entidade JPA
        Empresa novaEmpresa = new Empresa(dto.getCnpj(), dto.getRazaoSocial(), dto.getFaturamentoAnual());

        // O Service envia para o JpaRepository que executa o INSERT no H2
        Empresa empresaSalva = this.empresaService.salvar(novaEmpresa);

        // Retorna HTTP Status 201 (Created) com a Empresa cadastrada (já contendo o ID gerado pelo banco)
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaSalva);
    }

    // 2. ENDPOINT GET: Busca todas as empresas salvas no Banco H2
    // URL: GET http://localhost:8080/api/empresa/listar
    @GetMapping("/listar")
    public ResponseEntity<List<Empresa>> listarTodas() {

        // O Service chama o JpaRepository.findAll() que faz o "SELECT * FROM empresa"
        List<Empresa> empresas = this.empresaService.listarTodas();

        return ResponseEntity.ok(empresas);
    }
}