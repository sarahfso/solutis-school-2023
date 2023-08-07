/*

Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r) deve ser 
informado pelo usuário e o resultado terá que ser arredondado.

*/

import java.util.Scanner;

public class CalculadoraAreaCirculo {

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        
        if (raio < 0) {
            System.out.println("O raio não pode ser negativo.");
        } else {
            double area = calcularAreaCirculo(raio);
            System.out.println("A área do círculo é: " + Math.round(area));
        }

        sc.close();
    }
}
