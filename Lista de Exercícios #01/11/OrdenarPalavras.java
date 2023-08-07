/*

Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética 
(utilize o método compareTo da classe String). Informe também, qual das palavras tem o maior número de caracteres.

*/

import java.util.Scanner;

public class OrdenarPalavras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {
            System.out.println("Palavras em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (comparacao > 0) {
            System.out.println("Palavras em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais em ordem alfabética.");
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra " + palavra1 + " tem o maior número de caracteres.");
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra " + palavra2 + " tem o maior número de caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }

        sc.close();
    }
}
