package models;

import types.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo (String nome, int idade, String habitat, double altura, double peso, double envergaduraAsa) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.quantidadePatas = 2;
        this.quantidadeAsas = 2;
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public void comer(double input) {
        comidaIngerida += input;
        System.out.println("O pombo " + nome + " comeu um total de " + comidaIngerida + " kg de ração.");
    }

    @Override
    public void moverse(double input) {
        distanciaPercorrida += input;
        System.out.println("O pombo " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }

    @Override
    public void dormir(double input) {
        horasDormidas += input;
        System.out.println("O pombo " + nome + " dormiu um total de " + horasDormidas + " horas.");
    }

    @Override
    public void voar(double input) {
        distanciaPercorrida += input;
        System.out.println("O pombo " + nome + " percorreu um total de " + distanciaPercorrida + " km.");
    }
}
