import models.Administrador;
import models.Empregado;
import models.Fornecedor;
import models.Operario;
import models.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {

        //Teste da classe Fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor1", "Rua X, 789", "555555555", 10000.0, 5000.0);
        fornecedor.exibirInformacoes();
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println("----------------------------------------------");

        //Teste da classe Empregado
        Empregado empregado = new Empregado("Empregado1", "Rua Y, 123", "777777777", 101, 3000.0, 10.0);
        empregado.exibirInformacoes();
        System.out.println("Salário Líquido: " + empregado.calcularSalario());

        System.out.println("----------------------------------------------");

        //Teste da classe Administrador
        Administrador administrador = new Administrador("Administrador1", "Rua Z, 456", "888888888", 102, 4000.0, 15.0, 500.0);
        administrador.exibirInformacoes();
        System.out.println("Salário Líquido (com ajuda de custo): " + administrador.calcularSalario());

        System.out.println("----------------------------------------------");

        //Teste da classe Operário
        Operario operario = new Operario("Operario1", "Rua W, 789", "999999999", 103, 2500.0, 12.0, 3000.0, 5.0);
        operario.exibirInformacoes();
        System.out.println("Salário Líquido (com comissão): " + operario.calcularSalario());

        System.out.println("----------------------------------------------");

        //Teste da classe Vendedor
        Vendedor vendedor = new Vendedor("Vendedor1", "Rua V, 123", "123123123", 104, 2000.0, 8.0, 15000.0, 2.5);
        vendedor.exibirInformacoes();
        System.out.println("Salário Líquido (com comissão): " + vendedor.calcularSalario());
    }
}
