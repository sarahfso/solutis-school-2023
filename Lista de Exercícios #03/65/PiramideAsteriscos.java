import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da pirâmide:");
        int linhas = input.nextInt();

        for (int i = 1; i <= linhas; i++) {
            // Espaços em branco antes dos asteriscos
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
