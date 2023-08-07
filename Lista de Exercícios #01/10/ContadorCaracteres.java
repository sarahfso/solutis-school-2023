/*

Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.

*/


import java.util.Scanner;

public class ContadorCaracteres {

    public static void contarCaracteres(String texto) {
        int vogais = 0;
        int espacos = 0;
        int consoantes = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vogais++;
            } else if (ch == ' ') {
                espacos++;
            } else if (Character.isLetter(ch)) { // Verificar se é uma letra (excluindo espaços e outros caracteres)
                consoantes++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma cadeia de caracteres: ");
        String texto = sc.nextLine();

        contarCaracteres(texto);

        sc.close();
    }
}
