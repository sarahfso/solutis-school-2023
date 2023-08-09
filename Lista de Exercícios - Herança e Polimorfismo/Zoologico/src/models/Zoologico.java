package models;

public class Zoologico {
    Animal[] jaulas;

    public Zoologico () {
        jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Rex", 3);
        jaulas[1] = new Preguica("Soneca", 5);
        jaulas[2] = new Cavalo("Relâmpago", 7);
        jaulas[3] = new Cachorro("Fido", 2);
        jaulas[4] = new Preguica("Dorminhoca", 4);
        jaulas[5] = new Cavalo("Trotsky", 6);
        jaulas[6] = new Cachorro("Luna", 1);
        jaulas[7] = new Preguica("Molenga", 3);
        jaulas[8] = new Cavalo("Pégasus", 8);
        jaulas[9] = new Cachorro("Buddy", 4);

        for (Animal animal : jaulas) {
            System.out.println("Animal na jaula: " + animal.getNome());
            animal.emitirSom();

            if (animal instanceof Cavalo) {
                Cavalo cavalo = (Cavalo) animal;
                cavalo.correr();
            }

            if (animal instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animal;
                cachorro.correr();
            }

            System.out.println();
        }
    }
    
}

