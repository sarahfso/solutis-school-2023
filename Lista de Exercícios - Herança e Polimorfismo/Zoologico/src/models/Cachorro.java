package models;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    // Método específico para o cachorro correr
    public void correr() {
        System.out.println("O cachorro está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

}
