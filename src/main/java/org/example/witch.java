package org.example;
import java.util.Scanner;
public class witch {
    public static void main(String[]args){
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite o numero do bilhete: ");
        int numerosorte=leitor.nextInt();
        switch (numerosorte){
            case 22:
                System.out.println("Você foi o vencedor!");
                break;
            default:
                System.out.println("Não foi dessa vez!");
        }
        leitor.close();
    }
}
