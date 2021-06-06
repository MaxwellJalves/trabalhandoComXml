package com.estruturaXml.Entity;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

public class FormaDePagamento extends DefaultHandler {

    private String descricao;
    private List<FormaDePagamento> formaPagamento = new ArrayList<>();
    private StringBuilder sb;
    private boolean tipo = false;

    public FormaDePagamento(){}

    public FormaDePagamento(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Quando for reconhecido um elemento é chamado o método startElement
     * <p>Caso tente iniciar o StringBuilder no inicio da classe os dados ficaram sendo listados em duplicidade, pos esse motivo,
     * nos testes optei em iniciar o StringBuilder no momento da verificação das Tags do XMl</p>*/
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("tipo")){
            tipo = true;
            sb= new StringBuilder();
        }
    }

    /**
     * <em>Evento utilizado para pegar o conteudo da tag definida, onde precisamos pegar o retorno e salvar</em>
     * <p>
     *     O método abaixo percorre todos os dados da tag e adiciona a informação no StringBuilder para formar a palavra
     *     cotida no conteúdo das tags.
     *
     * </p>*/
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = new String(ch,start,length);
        if(tipo){
            sb.append(s);
        }
    }

    /**
     * <em> Ao encontrar a tag que desejamos salvar na memoria é feito a chamada da lista Forma de pagamento para adicionar
     * a Forma de pagamento e podermos listar as formas utilizadas na view.</em>*/
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("tipo")){
             formaPagamento.add(new FormaDePagamento(sb.toString()));
        }
    }

    public String getDescricao() throws  Exception{
      return descricao == null ? "erro ao localizar a descrição :( tente realizar a chamado pelo método getFormaPagamento()" :
              descricao;
    }

    @Override
    public String toString() {
        return "FormaDePagamento{" +
                " Tipo de Pagamento='" + descricao + '\'' +
                '}';
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<FormaDePagamento> getFormaPagamento() {
        return formaPagamento;
    }


}
