package models;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    // Método específico para a preguiça subir em árvores
    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça faz um som: ...zzz...");
    }

}
