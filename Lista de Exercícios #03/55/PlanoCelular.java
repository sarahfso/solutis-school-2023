import java.util.Scanner;

public class PlanoCelular {
    public static void main(String[] args) {
        final double VALOR_PLANO = 50.00;
        final int MINUTOS_INCLUSOS = 100;
        final int MINUTOS_VAI_VAI = 50;
        final double VALOR_MINUTO_OUTRAS_OPERADORAS = 0.65;
        final double VALOR_MINUTO_VAI_VAI = 0.20;
        final double VALOR_MINUTO_TELEFONE_FIXO = VALOR_MINUTO_OUTRAS_OPERADORAS / 2;

        Scanner sc = new Scanner(System.in);

        char continuar = 's';
        do {
            System.out.println("Digite o tipo de ligação ('o' para outras operadoras, 'v' para a própria Vai-Vai ou 'f' para telefone fixo):");
            char tipoLigacao = sc.next().charAt(0);

            System.out.println("Digite a quantidade de minutos:");
            int minutos = sc.nextInt();

            double valorPagar;
            double saldo = VALOR_PLANO;

            if (tipoLigacao == 'o') {
                valorPagar = (minutos > MINUTOS_INCLUSOS) ? (minutos - MINUTOS_INCLUSOS) * VALOR_MINUTO_OUTRAS_OPERADORAS : 0;
                if(valorPagar > saldo) {
                    System.out.println("Saldo insuficiente para realizar esta ligação.");
                }else{
                    saldo = saldo - valorPagar;
                }
            } else if (tipoLigacao == 'v') {
                valorPagar = (minutos > (MINUTOS_INCLUSOS + MINUTOS_VAI_VAI)) ? ((minutos - MINUTOS_INCLUSOS - MINUTOS_VAI_VAI) * VALOR_MINUTO_VAI_VAI) : 0;
                if(valorPagar > saldo) {
                    System.out.println("Saldo insuficiente para realizar esta ligação.");
                }else{
                    saldo = saldo - valorPagar;
                }
            } else if (tipoLigacao == 'f') {
                valorPagar = (minutos > MINUTOS_INCLUSOS) ? ((minutos - MINUTOS_INCLUSOS) * VALOR_MINUTO_TELEFONE_FIXO) : 0;
                if(valorPagar > saldo) {
                    System.out.println("Saldo insuficiente para realizar esta ligação.");
                }else{
                    saldo = saldo - valorPagar;
                }
            } else {
                System.out.println("Tipo de ligação inválido!");
                continue;
            }

            System.out.println("Saldo: R$" + saldo);
            System.out.println("Valor da ligação: R$" + valorPagar);

            System.out.println("Deseja inserir mais uma ligação? (s/n)");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa encerrado.");

        sc.close();
    }
}
