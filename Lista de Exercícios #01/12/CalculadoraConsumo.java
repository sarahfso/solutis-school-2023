/*

Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou vários tanques 
cheios de gasolina registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para 
cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de 
gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo em 
quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível 
consumidos até esse ponto. Todos os cálculos de média devem produzir resultados de ponto flutuante.

*/

import java.util.Scanner;

public class CalculadoraConsumo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotal = 0;

        System.out.println("Digite a quantidade de tanques a monitorar: ");
        int n = sc.nextInt();

        System.out.println("------------------------------------------------------------");
        
        if(n >= 1) {
            for(int tanque = 1; tanque <= n; tanque++) {
                System.out.print("Digite a quilometragem dirigida no tanque " + tanque + ": ");
                int quilometragem = sc.nextInt();

                if (quilometragem == -1) {
                    break;
                }

                System.out.print("Digite a quantidade de litros de gasolina consumidos no tanque " + tanque + ": ");
                int litros = sc.nextInt();

                double consumoPorLitro = (double) quilometragem / litros;
                System.out.println("Consumo no tanque " + tanque + ": " + consumoPorLitro + " km/l");
                System.out.println("------------------------------------------------------------");

                quilometragemTotal += quilometragem;
                litrosTotal += litros;
            }
            System.out.println("Quilometragem combinada: " + quilometragemTotal + " km");
            System.out.println("Total de litros consumidos: " + litrosTotal + " litros");
        }else{
            System.out.println("Nenhum tanque cheio informado. O programa será encerrado.");
        }

        sc.close();
    }
}
