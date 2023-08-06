/*

Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

*/

import java.util.Scanner;

public class ParImparChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor
        System.out.print("Digite o valor: ");
        int numero = sc.nextInt();

        ParOrImpar(numero);

        sc.close();
    }

    public static void ParOrImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }
}
