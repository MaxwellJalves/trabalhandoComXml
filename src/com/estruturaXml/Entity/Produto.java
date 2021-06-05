package com.estruturaXml.Entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Produto {



private int codigo;
    private String descricao;
    private BigDecimal valor = BigDecimal.ZERO;
    private double quantidade;
    private String observacaoItem;

    private static List<Produto> findAll = new ArrayList<>();

    public Produto(int cd, String descricao, BigDecimal valor,String observacao){
        this.codigo = cd;
        this.descricao = descricao;
        this.valor= valor;
        this.observacaoItem = observacao;
    }

    public Produto(int codigo, String descricao, BigDecimal valor, double quantidade, String observacaoItem) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.observacaoItem = observacaoItem;
    }

    public Produto(int codigo, String descricao, BigDecimal valor, double quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    public double getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
            return codigo;
        }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getObservacaoItem() {
        return observacaoItem;
    }

    public static List<Produto> getProduto() {
        return findAll;
    }

    public static void setProduto(Produto produto) {
        findAll.add(produto);
    }

@Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", observacaoItem='" + observacaoItem + '\'' +
                '}';
    }
}
