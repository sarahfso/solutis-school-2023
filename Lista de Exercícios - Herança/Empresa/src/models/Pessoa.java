package models;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com todos os atributos
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Construtor com nome e telefone (endereço vazio)
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = "";
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }

    // Setter para o atributo endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter para o atributo telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter para o atributo telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
