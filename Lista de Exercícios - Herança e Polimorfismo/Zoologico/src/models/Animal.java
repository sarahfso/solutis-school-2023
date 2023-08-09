package models;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo idade
    public int getIdade() {
        return idade;
    }

    // Setter para o atributo idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para emitir um som característico do animal
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

}
