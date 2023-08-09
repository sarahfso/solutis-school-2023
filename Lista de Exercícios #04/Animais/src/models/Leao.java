package models;

import types.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {
    public Leao (String nome, int idade, String habitat, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadePatas = 4;
    }

    @Override
    public void comer(double input) {
        comidaIngerida += input;
        System.out.println("O leão " + nome + " comeu um total de " + comidaIngerida + " kg de ração.");
    }

    @Override
    public void moverse(double input) {
        distanciaPercorrida += input;
        System.out.println("O leão " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }

    @Override
    public void dormir(double input) {
        horasDormidas += input;
        System.out.println("O leão " + nome + " dormiu um total de " + horasDormidas + " horas.");
    }
}
