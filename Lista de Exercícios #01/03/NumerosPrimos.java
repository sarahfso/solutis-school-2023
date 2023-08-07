/*

Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado e imprime todos 
os números primos menores que ele.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {

    public static boolean ehPrimo(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> encontrarPrimosAte(int numero) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int num = 2; num < numero; num++) {
            if (ehPrimo(num)) {
                primos.add(num);
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 2) {
            System.out.println("O número deve ser maior ou igual a 2.");
        } else {
            ArrayList<Integer> primosAteNumero = encontrarPrimosAte(numero);
            if (!primosAteNumero.isEmpty()) {
                System.out.println("Números primos menores que " + numero + ":");
                for (int primo : primosAteNumero) {
                    System.out.print(primo + " ");
                }
                System.out.println();
            } else {
                System.out.println("Não há números primos menores que " + numero + ".");
            }
        }

        sc.close();
    }
}
