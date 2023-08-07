import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = sc.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os três números são iguais.");
        }else{
            int maiorNumero = encontrarMaior(numero1, numero2, numero3);
            System.out.println("O maior número é: " + maiorNumero);
        }

        sc.close();
    }

    public static int encontrarMaior(int num1, int num2, int num3) {
        int maior = num1;
        
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        return maior;
    }
}
