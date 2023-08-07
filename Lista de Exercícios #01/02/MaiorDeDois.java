/*

Faça um programa que receba 2 valores e retorne o maior entre eles.

*/

import java.util.Scanner;

public class MaiorDeDois {

    public static double encontrarMaior(double valor1, double valor2) {
        return valor1 > valor2 ? valor1 : valor2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        double maiorValor = encontrarMaior(valor1, valor2);

        System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + maiorValor);

        sc.close();
    }

}

