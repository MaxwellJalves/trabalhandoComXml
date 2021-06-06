package com.estruturaXml.view;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class LendoTxt {

public static void main(String[] args) throws IOException {

  //-------Forma 1
    //Criando uma lista para armazenar os produtos contidos em um arquivo txt
    List<String> produtos = new ArrayList<>();

    InputStream leitor = new FileInputStream("src/t.txt");
    Scanner scanner = new Scanner(leitor);

    while (scanner.hasNext()){
        String produtoAtual = scanner.nextLine();
        produtos.add(produtoAtual);
    }

    produtos.forEach(e -> System.out.println(e));

    if (produtos.contains("QUEIJO")){
        System.out.println("Produto Localizador  no valor de R$ 25,00 kg");
    }
 //--------Forma 2 JAVA 11
    String texto = new Scanner(new File("src/t.txt"), "UTF-8").useDelimiter("-").next();
      System.out.println("\n\nSEGUNDA FORMA \n".concat(texto));


 // -------Forma 3BufferReader
    BufferedReader bf = new BufferedReader(new FileReader("src/t.txt"));
    int contador = 1;
    while(bf.ready()){
        var buffer = bf.readLine();
        System.out.println(contador+" : "+buffer);
        contador++;
    }


}

}
