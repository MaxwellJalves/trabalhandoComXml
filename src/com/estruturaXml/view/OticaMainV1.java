package com.estruturaXml.view;

import com.estruturaXml.uteis.Header;
import com.estruturaXml.Entity.Produto;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OticaMainV1 {


public static void main(String[] args) throws Exception{
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = factory.newDocumentBuilder();
    Document doc = dBuilder.parse("src/com/estruturaXml/schemas/modulo/otica.xml");

    Element documento = doc.getDocumentElement();

    NodeList produtos = doc.getElementsByTagName("produto");

    List<Produto> produtosList = new ArrayList<>();

    for(int i = 0; i < produtos.getLength(); i++) {
        try{
            produtosList.add(new Produto(Integer.parseInt(doc.getElementsByTagName("item").item(i).getTextContent()),
                                    doc.getElementsByTagName("descricao").item(i).getTextContent(),
                                   new BigDecimal(doc.getElementsByTagName("valor").item(i).getTextContent()).setScale(2),
                                    doc.getElementsByTagName("observacao").item(i).getTextContent()));
        }catch(Exception e){
            System.out.println("ops! Ocorreu um erro ao ler os dados ");
        }
    }
    System.out.println("\n######------- [\t"+ Header.EMPRESA+"\t]------######\n");

        for(Produto p : produtosList){
            System.out.println("Código do Produto : "+p.getCodigo());
            System.out.println("Descrição         :"+ p.getDescricao());
            System.out.println("Valor Unitario    :"+ p.getValor());
            System.out.println("Observação do produto:"+ p.getDescricao() +"\n");
        }
    System.out.println("\n######-------Agradecemos a preferencia ------######\n");

}
}
