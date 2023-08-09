package models;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Getter para o atributo ajudaDeCusto
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    // Setter para o atributo ajudaDeCusto
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    // Redefinindo o método calcularSalario da classe Empregado
    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario(); // Chama o método da classe base
        double salarioAdministrador = salarioEmpregado + ajudaDeCusto;
        return salarioAdministrador;
    }

}

