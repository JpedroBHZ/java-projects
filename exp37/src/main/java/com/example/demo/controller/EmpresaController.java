package com.example.demo.controller;

import com.example.demo.dto.EmpresaResumoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @GetMapping("/{id}")
    public EmpresaResumoDTO buscarPorId(@PathVariable Long id) {

        System.out.println("🔍 [CONTROLLER] O cliente solicitou a busca da empresa com o ID: " + id);

        if (id == 42L) {
            return new EmpresaResumoDTO("12.345.678/0001-99", "Contabilidade Nova Era", "Simples Nacional");
        }

        return new EmpresaResumoDTO("00.000.000/0000-00", "Empresa Genérica", "Lucro Presumido");
    }

    // 2. Você também pode usar texto/String como variável de caminho
    // Exemplo de URL: GET http://localhost:8080/api/empresa/cnpj/98765432000188
    @GetMapping("/cnpj/{cnpjDigitado}")
    public String buscarPorCnpj(@PathVariable String cnpjDigitado) {
        return "🔎 Buscando no banco de dados a empresa com o CNPJ: " + cnpjDigitado;
    }
}