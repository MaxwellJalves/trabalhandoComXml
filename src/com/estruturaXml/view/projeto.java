package com.estruturaXml.view;

import com.estruturaXml.uteis.Message;
import com.estruturaXml.uteis.Header;
import com.estruturaXml.Entity.Produto;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.math.BigDecimal;

public class projeto {


public static void main(String[] args) throws Exception{

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = factory.newDocumentBuilder();
        Document doc = dBuilder.parse("src/com/estruturaXml/schemas/modulo/otica.xml");
    //Validações Schema
        factory.setValidating(true);
        factory.setNamespaceAware(true);
        factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage","http://www.w3.org/2001/XMLSchema");

        Element documento = doc.getDocumentElement();

        NodeList produtos = doc.getElementsByTagName("produto");

        for(int i = 0; i < produtos.getLength(); i++) {

            int codigo  = Integer.parseInt(doc.getElementsByTagName("item").item(i).getTextContent());
            String nome = doc.getElementsByTagName("descricao").item(i).getTextContent();
            BigDecimal valor = new BigDecimal(doc.getElementsByTagName("valor").item(i).getTextContent()).setScale(2);
            String obs = doc.getElementsByTagName("observacao").item(i).getTextContent();

                Produto.setProduto(new Produto(codigo,nome,valor,obs));

        }

        System.out.println("\n######------- [\t"+ Header.EMPRESA+"\t]------######\n");
        Message.getItensPedido();
        System.out.println("\n######-------Agradecemos a preferencia ------######\n");

}
}
