package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 1. Avisa ao JPA que esta classe vai virar uma TABELA no banco de dados!
public class Empresa {

    @Id // 2. Define que este campo é a Chave Primária (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Auto-incremento no banco (1, 2, 3...)
    private Long id;

    private String cnpj;
    private String razaoSocial;
    private double faturamentoAnual;

    // Construtor vazio (Obrigatório para o JPA)
    public Empresa() {}

    public Empresa(String cnpj, String razaoSocial, double faturamentoAnual) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
    public double getFaturamentoAnual() { return faturamentoAnual; }
    public void setFaturamentoAnual(double faturamentoAnual) { this.faturamentoAnual = faturamentoAnual; }
}