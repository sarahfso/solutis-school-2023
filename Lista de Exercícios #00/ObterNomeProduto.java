/*

Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.

*/

import java.util.Scanner;

public class ObterNomeProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        String codigoProduto = sc.nextLine();
        String nomeProduto = obterNomeProduto(codigoProduto);
        System.out.println("O produto com código " + codigoProduto + " é: " + nomeProduto);
        sc.close();
    }

    public static String obterNomeProduto(String codigo) {
        if (codigo.equals("001")) {
            return "Parafuso";
        } else if (codigo.equals("002")) {
            return "Porca";
        } else if (codigo.equals("003")) {
            return "Prego";
        } else {
            return "Diversos";
        }
    }
}
