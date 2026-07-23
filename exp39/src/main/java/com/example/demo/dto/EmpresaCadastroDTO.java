package com.example.demo.dto;

public class EmpresaCadastroDTO {
    private String cnpj;
    private String razaoSocial;
    private double faturamentoAnual;

    // Construtor vazio (Obrigatório para o Spring conseguir montar o JSON)
    public EmpresaCadastroDTO() {
    }

    public EmpresaCadastroDTO(String cnpj, String razaoSocial, double faturamentoAnual) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public void setFaturamentoAnual(double faturamentoAnual) {
        this.faturamentoAnual = faturamentoAnual;
    }
}