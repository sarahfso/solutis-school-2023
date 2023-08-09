package models;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    // Getter para o atributo valorCredito
    public double getValorCredito() {
        return valorCredito;
    }

    // Setter para o atributo valorCredito
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    // Getter para o atributo valorDivida
    public double getValorDivida() {
        return valorDivida;
    }

    // Setter para o atributo valorDivida
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    // Método para calcular o saldo (diferença entre valorCredito e valorDivida)
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}
