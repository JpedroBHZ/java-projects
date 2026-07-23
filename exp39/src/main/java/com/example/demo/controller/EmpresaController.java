package com.example.demo.controller;

import com.example.demo.dto.EmpresaCadastroDTO;
import com.example.demo.service.EmpresaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    // INJEÇÃO AUTOMÁTICA DO SPRING: O Spring injeta o Bean do Service no Controller!
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    // ROTA POST: Cadastra uma nova empresa
    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody EmpresaCadastroDTO dto) {
        System.out.println("🌐 [CONTROLLER] Recebeu requisição HTTP POST.");
        try {
            this.empresaService.cadastrarEmpresa(dto);
            return "✅ Empresa " + dto.getRazaoSocial() + " cadastrada com sucesso!";
        } catch (IllegalArgumentException e) {
            return "❌ Erro ao cadastrar: " + e.getMessage();
        }
    }

    // ROTA GET: Consulta todas as empresas salvas no banco
    @GetMapping("/listar")
    public List<EmpresaCadastroDTO> listar() {
        System.out.println("🌐 [CONTROLLER] Recebeu requisição HTTP GET para listar.");
        return this.empresaService.listarTodas();
    }
}