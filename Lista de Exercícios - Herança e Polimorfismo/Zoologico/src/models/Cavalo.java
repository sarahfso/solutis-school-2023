package models;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    // Método específico para o cavalo correr
    public void correr() {
        System.out.println("O cavalo está correndo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Hiin in in!");
    }
}
