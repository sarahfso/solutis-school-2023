import java.util.Scanner;

public class ComissaoGarcom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da despesa do cliente: R$ ");
        double valorDespesa = sc.nextDouble();

        double comissao = calcularComissao(valorDespesa);

        System.out.printf("A comissão do garçom é: R$ %.2f%n", comissao);

        sc.close();
    }

    public static double calcularComissao(double valorDespesa) {
        double comissao = valorDespesa * 0.1;
        return comissao;
    }
}
