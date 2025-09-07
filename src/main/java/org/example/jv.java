package org.example;
import java.util.Scanner;
public class jv {
    public static void main(String[]args){
      Scanner leitor=new Scanner(System.in);
      System.out.println("Digite seu nome:");
      String nome=leitor.next();
      switch(nome){
            case "joao":
                System.out.println("Liberado!");
            default:
                System.out.println("Negado!");
        }
        leitor.close();
    }
}
