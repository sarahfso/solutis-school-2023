/*

A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite
100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma
promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor
do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada
entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
enquanto ele indicar que existem mais ligações a serem digitadas.

*/

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
