/*

Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente. 
Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.

*/

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 7: ");
        int numeroDia = sc.nextInt();

        if (numeroDia >= 1 && numeroDia <= 7) {
            String diaDaSemana = diasDaSemana[numeroDia - 1];
            System.out.println("Dia da semana correspondente: " + diaDaSemana);
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 7.");
        }

        sc.close();
    }
}
