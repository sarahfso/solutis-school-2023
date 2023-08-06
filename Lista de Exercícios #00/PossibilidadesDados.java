/*

Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como 
resultado da soma dos valores de cada dado.


*/

public class PossibilidadesDados {
    public static void main(String[] args) {
        int soma = 7;

        System.out.println("Possibilidades de soma igual a 7 nos lançamentos dos dados:");
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == soma) {
                    System.out.println("Dado 1: " + dado1 + " e Dado 2: " + dado2);
                }
            }
        }
    }
}
