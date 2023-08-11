package br.com.cursopcv.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod;
    private String nome;
    private String descricao;
    private double preco;

    public Produto () {
        
    }

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String novaDescricao) {
        descricao = novaDescricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            preco = novoPreco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
}

