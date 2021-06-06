package com.estruturaXml.uteis;

import com.estruturaXml.Entity.Produto;

import java.text.DecimalFormat;

public class Message {
    /**
     * @Author Maxwell.costa
     * @param id Identificador  do pedido
     * @param cdLoja Código da loja parceira
     * @param cdCliente Código do cliente
     * */
    public static void getCabecalho(int id,int cdLoja,int cdCliente){
        System.out.println( "###_"+Header.FOOD+"_####\n\n"+
                "Código Pedido \t\t:\t" + id +
                "\nCódigo Loja Parceira:\t" + cdLoja+
                "\nCódigo Cliente      :\t" + cdCliente);
    }

    /**
     * <em> Retorna a lista de itens do pedido</em>
     * @Author Maxwell.costa
     * Retorna todos os dados utilizado na regra de negócio para o procedimento
     */

    public static void getItensPedido(){
        for(Produto p : Produto.getProduto()){
            System.out.println("\nCódigo do Produto : "+p.getCodigo());
            System.out.println("Descrição         :"+ p.getDescricao());
            System.out.println("Valor Unitario    :"+ p.getValor());
            String observacao = p.getObservacaoItem() != null ? "Observação do produto:" + p.getObservacaoItem() : "";
            System.out.println( observacao +"\n");
        }
    }
}

