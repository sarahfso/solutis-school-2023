package models;

import types.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe (String nome, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer(double input) {
        comidaIngerida += input;
        System.out.println("O peixe " + nome + " comeu um total de " + comidaIngerida + " kg de ração.");
    }

    @Override
    public void moverse(double input) {
        distanciaPercorrida += input;
        System.out.println("O peixe " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }

    @Override
    public void dormir(double input) {
        horasDormidas += input;
        System.out.println("O peixe " + nome + " dormiu um total de " + horasDormidas + " horas.");
    }

    @Override
    public void nadar(double input) {
        distanciaPercorrida += input;
        System.out.println("O peixe " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }

    
}
