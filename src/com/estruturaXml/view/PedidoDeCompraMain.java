package com.estruturaXml.view;

import com.estruturaXml.Entity.Pedido;
import com.estruturaXml.uteis.Message;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class PedidoDeCompraMain {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("src/com/estruturaXml/schemas/pedidoDeCompra.xml");

        Integer identificador = Integer.parseInt(doc.getElementsByTagName("identificador").item(0).getTextContent());
        Integer codigoLojaParceira = Integer.parseInt(doc.getElementsByTagName("codigoLojaParceira").item(0).getTextContent());
        Integer codigoDoCliente = Integer.parseInt(doc.getElementsByTagName("codigoDoCliente").item(0).getTextContent());

        Pedido pedido = new Pedido(identificador,codigoLojaParceira);

        Message.getCabecalho(identificador,codigoLojaParceira,codigoDoCliente);
    }

}
//Adicionar cabeçalho do pedido coletado do XML e apresentar as informções no console
//Criar Schema para padronizar o pedido de Compra
//Adicionar ao projeto as Annotations e refatorar o projeto com o JAXB


/*
*   <pedidos>
         <produto>
             <codigo>1020</codigo>
             <nome>COCA COLA</nome>
             <valor>5.20</valor>
             <quantidade>2</quantidade>
         </produto>
     </pedidos>
*
* */


/*
* https://www.w3.org/TR/xmlschema-1/#element-complexType
*
* */
