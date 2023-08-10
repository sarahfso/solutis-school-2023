package models;

public class FuncionarioComEnsinoBasico extends Funcionario {
    private String nomeEscola;
    private double acrescimoRenda = 0.1;

    public FuncionarioComEnsinoBasico(String nome, int codigoFuncional, String nomeEscolaEnsinoBasico) {
        super(nome, codigoFuncional);
        this.nomeEscola = nomeEscolaEnsinoBasico;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    // Método para calcular a renda total
    @Override
    public double calcularRendaTotal() {
        double rendaFuncionario = super.calcularRendaTotal();
        double rendaFuncionarioComEnsinoBasico = rendaFuncionario + (rendaFuncionario * acrescimoRenda);
        return rendaFuncionarioComEnsinoBasico;
    }
}