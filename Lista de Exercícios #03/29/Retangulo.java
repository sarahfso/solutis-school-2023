import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Receber os dois pontos do retângulo
        System.out.print("Informe a coordenada x do vértice superior esquerdo do retângulo: ");
        int x1 = sc.nextInt();
        System.out.print("Informe a coordenada y do vértice superior esquerdo do retângulo: ");
        int y1 = sc.nextInt();

        System.out.print("Informe a coordenada x do vértice inferior direito do retângulo: ");
        int x2 = sc.nextInt();
        System.out.print("Informe a coordenada y do vértice inferior direito do retângulo: ");
        int y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2) {
            System.out.println("É uma reta vertical.");
        } else if (y1 == y2) {
            System.out.println("É uma reta horizontal.");
        }else {
            System.out.println("É um retângulo.");
            // Calcular a área do retângulo
            int base = Math.abs(x2 - x1);
            int altura = Math.abs(y2 - y1);
            int area = base * altura;
            System.out.println("Área do retângulo: " + area);
        }

        // Receber outro ponto
        System.out.print("Informe a coordenada x do ponto: ");
        int xPonto = sc.nextInt();
        System.out.print("Informe a coordenada y do ponto: ");
        int yPonto = sc.nextInt();

        // Verificar a posição do ponto em relação ao retângulo
        if (xPonto < x1 && yPonto > y1) {
            System.out.println("Acima e à esquerda do retângulo.");
        } else if (xPonto < x1 && yPonto <= y1 && yPonto >= y2) {
            System.out.println("À esquerda do retângulo.");
        } else if (xPonto < x1 && yPonto < y2) {
            System.out.println("Embaixo e à esquerda do retângulo.");
        } else if (xPonto >= x1 && xPonto <= x2 && yPonto > y1) {
            System.out.println("Acima do retângulo.");
        } else if (xPonto >= x1 && xPonto <= x2 && yPonto < y2) {
            System.out.println("Embaixo do retângulo.");
        } else if (xPonto > x2 && yPonto > y1) {
            System.out.println("Acima e à direita do retângulo.");
        } else if (xPonto > x2 && yPonto <= y1 && yPonto >= y2) {
            System.out.println("À direita do retângulo.");
        } else if (xPonto > x2 && yPonto < y2) {
            System.out.println("Embaixo e à direita do retângulo.");
        } else if (xPonto > x1 && xPonto < x2 && yPonto < y1 && yPonto > y2) {
            System.out.println("Dentro do retângulo.");
        } else {
            System.out.println("Na linha do retângulo.");
        }

        sc.close();
    }
}
