package com.estruturaXml.view;


import com.estruturaXml.Entity.FormaDePagamento;
import com.estruturaXml.uteis.Location;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParserFactory.html#newInstance()
 * */

public class FormaDePagamentoXmlReader {

    public static void main(String[] args) throws Exception {

        SAXParserFactory reader =  SAXParserFactory.newInstance();
        SAXParser analyzer = reader.newSAXParser();

        InputStream input = new FileInputStream(Location.ROUTE_FORMA_DE_PAGAMENTO_XML);

        FormaDePagamento pagamento = new FormaDePagamento();

        analyzer.parse(input,pagamento);

         pagamento.getFormaPagamento().forEach(e -> System.out.println(e));
         System.out.println("Coletando descrição do pagamento ->\nUtilizar essa abordagem quando retornar apenas um elemento: retorno [".concat(pagamento.getDescricao()).concat("]"));
    }

}
