package com.estruturaXml.view;

import com.estruturaXml.Entity.Cliente;
import com.estruturaXml.Entity.Pedido;
import com.estruturaXml.Entity.Produto;
import com.estruturaXml.uteis.Message;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.math.BigDecimal;

public class PedidoDeCompraMain {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
        factory.setNamespaceAware(true);
        factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage","http://www.w3.org/2001/XMLSchema");
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("src/com/estruturaXml/schemas/pedidoDeCompra.xml");

//        NodeList lista = doc.getElementsByTagName("pedidoDeCompra");
//        System.out.println(lista.item(0).getTextContent());

        Integer identificador = Integer.parseInt(doc.getElementsByTagName("identificador").item(0).getTextContent());
        Integer codigoLojaParceira = Integer.parseInt(doc.getElementsByTagName("codigoLojaParceira").item(0).getTextContent());
        Integer codigoDoCliente = Integer.parseInt(doc.getElementsByTagName("codigoDoCliente").item(0).getTextContent());

        Pedido pedido = new Pedido(identificador,codigoLojaParceira);

        Message.getCabecalho(identificador,codigoLojaParceira,codigoDoCliente);
        NodeList itensvenda = doc.getElementsByTagName("produtos");
        for(int i=0; i < doc.getElementsByTagName("produto").getLength();i++){
            Integer codigoProduto = Integer.parseInt(doc.getElementsByTagName("codigo").item(i).getTextContent());
            String nome = doc.getElementsByTagName("nome").item(i).getTextContent();
            BigDecimal valor= BigDecimal.valueOf(Double.parseDouble(doc.getElementsByTagName("valor").item(i).getTextContent()));
            Double quantidade = Double.parseDouble(doc.getElementsByTagName("quantidade").item(i).getTextContent());
            Produto p = new Produto(codigoProduto,nome,valor,quantidade);
            Produto.setProduto(p);
        }
            Message.getItensPedido();

        NodeList clie = doc.getDocumentElement().getElementsByTagName("dadosDoCliente");
        String nomeCli = doc.getElementsByTagName("nome").item(0).getTextContent();
        String ruaCli = doc.getElementsByTagName("endereco").item(0).getTextContent();
        Integer numero = Integer.parseInt(doc.getElementsByTagName("numero").item(0).getTextContent());
        String bairro = doc.getElementsByTagName("bairro").item(0).getTextContent();
        Cliente cli = new Cliente(nomeCli,ruaCli,numero,bairro);
        System.out.println(cli);

    }

}


/*
* https://www.w3.org/TR/xmlschema-1/#element-complexType
*
* */
