/*

Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.

*/

public class QuadradoNumeros {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é: " + quadrado);
        }
    }
}
