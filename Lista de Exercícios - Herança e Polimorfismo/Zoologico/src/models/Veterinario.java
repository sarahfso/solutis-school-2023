package models;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o(a) " + animal.getNome() + "...");
        animal.emitirSom();
        System.out.println();
    }
}
