package models;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.0;
    private double comissao = 0.0;

    // Construtor
    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public void atribuirCargo(Comissao cargo) {
        this.comissao = cargo.getValorAdicional();
    }

    // Método para calcular a renda total
    public double calcularRendaTotal() {
        return rendaBasica + comissao;
    }

    public String toString() {
        return "Nome: " + getNome() +
                "\nComissão: R$" + comissao +
                "\nSalário Total: R$" + calcularRendaTotal();
    }

}
