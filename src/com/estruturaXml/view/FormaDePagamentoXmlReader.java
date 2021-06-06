package com.estruturaXml.view;

import com.estruturaXml.Entity.FormaDePagamento;
import com.estruturaXml.uteis.Location;
import com.estruturaXml.uteis.handlers.FormaDePagamentoHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParserFactory.html#newInstance()
 * */

public class FormaDePagamentoXmlReader {

    public static void main(String[] args) throws Exception {

        SAXParserFactory reader =  SAXParserFactory.newInstance();
        SAXParser analyzer = reader.newSAXParser();

        InputStream input = new FileInputStream(Location.ROUTE_FORMA_DE_PAGAMENTO_XML);

        FormaDePagamentoHandler pagamento = new FormaDePagamentoHandler();

        analyzer.parse(input,pagamento);

        pagamento.getFormaPagamento().forEach(e -> System.out.println(e));

         for(FormaDePagamento f : pagamento.getFormaPagamento()){
             if(f.getDescricao().equals("credito")){
                 System.out.println("\nPAGAMENTO REALIZADO COM O CARTÃO DE ".concat(f.getDescricao().toUpperCase()).concat(" BANDEIRA - MASTER CREDITO"));
                break;
             }
         }
    }

}
