package models;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Getter para o atributo valorVendas
    public double getValorVendas() {
        return valorVendas;
    }

    // Setter para o atributo valorVendas
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
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
        double salarioVendedor = salarioEmpregado + (valorVendas * (comissao / 100));
        return salarioVendedor;
    }

}
