/*

Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles.

*/

import java.util.Scanner;

public class MediaAritmetica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        System.out.println("Digite 50 números:");

        do {
            int numero = sc.nextInt();
            soma += numero;
            contador++;
        } while (contador < 50);

        double media = (double) soma / 50;
        System.out.println("A média aritmética dos 50 números é " + media);

        sc.close();
    }
}
