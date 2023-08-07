import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Receber três números do usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        // Verificar qual é o menor número
        int menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            meio = Math.min(num2, num3);
            maior = Math.max(num2, num3);
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            meio = Math.min(num1, num3);
            maior = Math.max(num1, num3);
        } else {
            menor = num3;
            meio = Math.min(num1, num2);
            maior = Math.max(num1, num2);
        }

        // Imprimir os números em ordem crescente
        System.out.println("Em ordem crescente: " + menor + ", " + meio + ", " + maior);

        sc.close();
    }
}

