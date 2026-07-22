package com.example.demo.dto;

public class EmpresaResumoDTO {
    private String cnpj;
    private String razaoSocial;
    private String regimeTributario;

    public EmpresaResumoDTO(String cnpj, String razaoSocial, String regimeTributario) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.regimeTributario = regimeTributario;
    }

    public String getCnpj() { return cnpj; }
    public String getRazaoSocial() { return razaoSocial; }
    public String getRegimeTributario() { return regimeTributario; }
}
