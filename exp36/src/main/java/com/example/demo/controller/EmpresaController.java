package com.example.demo.controller;

import com.example.demo.dto.EmpresaResumoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @GetMapping("/status")
    public String verificarStatusServico() {
        return "API do Escritório Contábil está no ar e operational!";
    }

    @GetMapping("/resumo")
    public EmpresaResumoDTO obterResumoEmpresa() {
        return new EmpresaResumoDTO("12.345.678/0001-99", "Contabilidade Nova Era", "Simples Nacional");
    }
}