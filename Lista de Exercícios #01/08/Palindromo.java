/*

Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a palavra fornecida seja uma 
palavra que pode ser lida da esquerda pra direita ou da direita pra esquerda obtendo-se a mesma palavra.

*/

import java.util.Scanner;

public class Palindromo {

    public static boolean ehPalindromo(String palavra) {
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }

        sc.close();
    }
}
