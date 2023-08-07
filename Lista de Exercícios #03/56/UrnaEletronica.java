import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Obter os nomes dos candidatos
        String[] candidatos = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = input.nextLine();
        }

        // Variáveis para armazenar os votos e votos em branco
        int[] votos = new int[3];
        int votosEmBranco = 0;

        // Receber os votos até que o usuário digite -1
        int voto;
        do {
            System.out.println("Digite o número do candidato que deseja votar, -1 para voto em branco ou -2 para apurar o resultado:");
            voto = input.nextInt();

            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else if (voto == -1) {
                votosEmBranco++;
            } else {
                System.out.println("Voto inválido! Tente novamente.");
            }
        } while (voto != -2);

        // Calcular o total de votos
        int totalVotos = 0;
        for (int votoCount : votos) {
            totalVotos += votoCount;
        }
        totalVotos += votosEmBranco;

        // Calcular e exibir os resultados
        System.out.println("\nResultados da eleição:\n");
        for (int i = 0; i < 3; i++) {
            double percentualVotos = (votos[i] * 100.0) / totalVotos;
            System.out.println("Candidato " + candidatos[i] + ": " + votos[i] + " votos (" + percentualVotos + "%)");
        }

        double percentualVotosEmBranco = (votosEmBranco * 100.0) / totalVotos;
        System.out.println("Votos em branco: " + votosEmBranco + " votos (" + percentualVotosEmBranco + "%)");

        // Encontrar o ganhador
        int indiceGanhador = 0;
        for (int i = 1; i < 3; i++) {
            if (votos[i] > votos[indiceGanhador]) {
                indiceGanhador = i;
            }
        }

        System.out.println("\nO ganhador da eleição é o candidato " + candidatos[indiceGanhador] + "!");

        input.close();
    }
}
