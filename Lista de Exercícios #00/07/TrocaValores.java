/*

Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe a possuir 
o valor da variável B e que a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 
*/

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores para A e B
        System.out.print("Digite o valor para A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor para B: ");
        int B = sc.nextInt();

        // Troca dos valores usando uma variável auxiliar
        int aux = A;
        A = B;
        B = aux;

        // Apresentação dos valores trocados
        System.out.println("Valores trocados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        sc.close();
    }
}
