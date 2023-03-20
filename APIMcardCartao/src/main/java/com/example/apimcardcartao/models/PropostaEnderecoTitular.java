package com.example.apimcardcartao.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PropostaEnderecoTitular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idTitular;

    private String tipo;

    private String endereco;

    private String numero;

    private String bairro;

    private String cidade;

    private String uf;

    private String complemento;

    private String cep;

    private boolean correspondencia;

    // Construtor vazio
    public PropostaEnderecoTitular() {}

    // Construtor com parâmetros
    public PropostaEnderecoTitular(int idTitular, String tipo, String endereco, String numero, String bairro,
                                   String cidade, String uf, String complemento, String cep, boolean correspondencia) {
        this.idTitular = idTitular;
        this.tipo = tipo;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
        this.cep = cep;
        this.correspondencia = correspondencia;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTitular() {
        return idTitular;
    }

    public void setIdTitular(int idTitular) {
        this.idTitular = idTitular;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isCorrespondencia() {
        return correspondencia;
    }

    public void setCorrespondencia(boolean correspondencia) {
        this.correspondencia = correspondencia;
    }
}
