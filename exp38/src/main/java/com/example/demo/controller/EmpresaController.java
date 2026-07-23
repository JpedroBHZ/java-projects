package com.example.demo.controller;

import com.example.demo.dto.EmpresaCadastroDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @PostMapping("/cadastrar")
    public String cadastrarNovaEmpresa(@RequestBody EmpresaCadastroDTO dadosRecebidos) {

        System.out.println("📥 [CONTROLLER] Novo cadastro recebido via HTTP POST!");
        System.out.println("CNPJ: " + dadosRecebidos.getCnpj());
        System.out.println("Razão Social: " + dadosRecebidos.getRazaoSocial());
        System.out.println("Faturamento: R$ " + dadosRecebidos.getFaturamentoAnual());

        return "✅ Empresa '" + dadosRecebidos.getRazaoSocial() + "' cadastrada com sucesso na API!";
    }
}