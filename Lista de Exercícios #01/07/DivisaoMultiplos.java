/*

Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double.

*/

public class DivisaoMultiplos {

    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0) { // Verifica se é múltiplo de 3
                if (num % 2 == 0) {
                    int resultadoInt = num / 2;
                    System.out.println(num + " dividido por 2 é igual a " + resultadoInt);
                } else {
                    double resultadoDouble = (double) num / 2;
                    System.out.println(num + " dividido por 2 é igual a " + resultadoDouble);
                }
            }
        }
    }
}
