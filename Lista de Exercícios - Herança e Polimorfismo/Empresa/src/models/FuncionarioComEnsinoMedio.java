package models;

public class FuncionarioComEnsinoMedio extends FuncionarioComEnsinoBasico {
    private String nomeEscola;
    private double acrescimoRenda = 0.5;

    public FuncionarioComEnsinoMedio(String nome, int codigoFuncional, String nomeEscolaEnsinoBasico, String nomeEscolaEnsinoMedio) {
        super(nome, codigoFuncional, nomeEscolaEnsinoBasico);
        this.nomeEscola = nomeEscolaEnsinoMedio;
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
        double rendaFuncionarioComEnsinoBasico = super.calcularRendaTotal();
        double rendaFuncionarioComEnsinoMedio = rendaFuncionarioComEnsinoBasico + (rendaFuncionarioComEnsinoBasico * acrescimoRenda );
        return rendaFuncionarioComEnsinoMedio;
    }
}
