package com.estruturaXml.Entity;

import com.estruturaXml.uteis.handlers.FormaDePagamentoHandler;

public class FormaDePagamento {

    private  String Descricao;

    public FormaDePagamento(){

    }

    public FormaDePagamento(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public FormaDePagamento setDescricao(String toString) {
        return new FormaDePagamento(toString);
    }

    @Override
    public String toString() {
        return "FormaDePagamento{" +
                "Descricao='" + Descricao + '\'' +
                '}';
    }
}
