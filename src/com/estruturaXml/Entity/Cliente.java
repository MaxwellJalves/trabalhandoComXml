package com.estruturaXml.Entity;

public class Cliente {
    private long id;
    private  String nome;
    private String endereco;
    private int numero;
    private String bairro;

    public Cliente(String nomeCli, String ruaCli, Integer numero, String bairro){
        this.nome = nomeCli;
        this.endereco = ruaCli;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Cliente(long id, String nome, String endereco, int numero, String bairro) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
