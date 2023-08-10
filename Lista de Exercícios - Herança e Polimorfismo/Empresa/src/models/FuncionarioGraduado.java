package models;

public class FuncionarioGraduado extends FuncionarioComEnsinoMedio {
    private String nomeUniversidade;
    private double acrescimoRenda = 1;

    public FuncionarioGraduado(String nome, int codigoFuncional, String nomeEscolaEnsinoBasico, String nomeEscolaEnsinoMedio, String nomeUniversidade) {
        super(nome, codigoFuncional, nomeEscolaEnsinoBasico, nomeEscolaEnsinoMedio);
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeEscola) {
        this.nomeUniversidade = nomeEscola;
    }

    // Método para calcular a renda total
    @Override
    public double calcularRendaTotal() {
        double rendaFuncionarioComEnsinoMedio = super.calcularRendaTotal();
        double rendaFuncionarioGraduado = rendaFuncionarioComEnsinoMedio + (rendaFuncionarioComEnsinoMedio * acrescimoRenda);
        return rendaFuncionarioGraduado;
    }
}