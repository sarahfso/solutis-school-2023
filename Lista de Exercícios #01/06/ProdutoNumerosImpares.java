/*

Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.

*/

public class ProdutoNumerosImpares {

    public static void main(String[] args) {
        int produto = 1;
        for (int num = 15; num <= 30; num++) {
            if (num % 2 != 0) { // Verifica se é ímpar
                produto *= num;
            }
        }
        System.out.println("Produto dos números ímpares de 15 a 30: " + produto);
    }
}
