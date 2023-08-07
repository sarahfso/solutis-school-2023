/*

Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas, converte-a para quilômetros 
e apresenta o resultado no console.

*/

import java.util.Scanner;

public class ConversorMilhas {

    public static double converterMilhasParaQuilometros(double milhas) {
        return milhas * 1.609;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = sc.nextDouble();
        sc.close();

        double quilometros = converterMilhasParaQuilometros(milhas);
        System.out.println("A distância em quilômetros é: " + quilometros + " km.");
    }
}
