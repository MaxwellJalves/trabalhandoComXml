# JAXB - Java Architecture for XMl Binding

O Java Architecture for XML Binding (JAXB) é um tecnologia Java que fornece uma maneira fácil e conveniente de mapear classes Java e esquema XML para desenvolvimento simplificado de serviços da Web. O JAXB potencializa a flexibilidade de dados XML neutros à plataforma nos aplicativos Java para ligar o esquema XML aos aplicativos Java sem requerer conhecimento extensivo para programação XML. O JAXB fornece a ferramenta do compilador de esquema xjc, a ferramenta do gerador de esquema schemagen para transformação entre esquema XML e classes Java.


Referencias utilizada para o estudo:

https://www.ibm.com/docs/pt-br/was-nd/8.5.5?topic=services-wsdl

#  SAX - Simple API for XML
- ### Classe SAXParserFactory 
No java 11 a Classe XMLReaderFactory foi Descontinuada e como sugestão o site da oracle recomenda a utilização do  <b>SAXParserFactory </b>
REF : https://docs.oracle.com/en/java/javase/11/docs/api/java.xml/javax/xml/parsers/SAXParserFactory.html#newInstance()

- A classe SAXParserFactory  possui uma abordagem parecida com o DocumentBuilderFactory, no ponto de vista de implementação porém é necessario um File ou InputFile e DefaultHadler que é a Classe base padrão para manipuladores de eventos SAX2.    O objetivo de utilizar a classe SAXParserFactory  e reduzir o custo de memória e só pegar os dados que interessam para regra de négocio.

<b>Observação</b> o código a baixo tem como objetivo entender o funcionamento dos eventos e as formas que podemos construir as informações. por esse motivo existe o overload do construtor.

![DefaultHandleXml](https://user-images.githubusercontent.com/65586669/120912674-85950880-c667-11eb-9e49-a1f4195f86ac.jpg)

