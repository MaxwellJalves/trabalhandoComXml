package com.estruturaXml.view;


import com.estruturaXml.Entity.FormaDePagamento;
import com.estruturaXml.uteis.Location;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParserFactory.html#newInstance()
 * */

public class FormaDePagamentoXmlReader {

    public static void main(String[] args) throws Exception {

        SAXParserFactory reader =  SAXParserFactory.newInstance();
        SAXParser analyzer = reader.newSAXParser();

     // File fileLocation = new File(Location.ROUTE_FORMA_DE_PAGAMENTO_XML);
        InputStream input = new FileInputStream(Location.ROUTE_FORMA_DE_PAGAMENTO_XML);

        FormaDePagamento pagamento = new FormaDePagamento();
        analyzer.parse(input,pagamento);
    }

}
