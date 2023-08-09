package models;

import types.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {
    public Gato (String nome, int idade, String habitat, double altura, double peso) {
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
        System.out.println("O gato " + nome + " comeu um total de " + comidaIngerida + " kg de ração.");
    }

    @Override
    public void moverse(double input) {
        distanciaPercorrida += input;
        System.out.println("O gato " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }

    @Override
    public void dormir(double input) {
        horasDormidas += input;
        System.out.println("O gato " + nome + " dormiu um total de " + horasDormidas + " horas.");
    }
}
