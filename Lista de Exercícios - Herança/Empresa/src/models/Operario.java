package models;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getter para o atributo valorProducao
    public double getValorProducao() {
        return valorProducao;
    }

    // Setter para o atributo valorProducao
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    // Getter para o atributo comissao
    public double getComissao() {
        return comissao;
    }

    // Setter para o atributo comissao
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefinindo o método calcularSalario da classe Empregado
    @Override
    public double calcularSalario() {
        double salarioEmpregado = super.calcularSalario(); // Chama o método da classe base
        double salarioOperario = salarioEmpregado + (valorProducao * (comissao / 100));
        return salarioOperario;
    }

}

