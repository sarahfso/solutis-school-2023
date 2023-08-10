import models.Cachorro;
import models.Cavalo;
import models.Preguica;
import models.Veterinario;
import models.Zoologico;

public class App {
    public static void main(String[] args) throws Exception {

        //Implementação dos animais
        Cachorro cachorro = new Cachorro("Rex", 3);
        Preguica preguica = new Preguica("Soneca", 5);
        Cavalo cavalo = new Cavalo("Relâmpago", 7);

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade() + " anos");
        cachorro.emitirSom(); 

        System.out.println();

        System.out.println("Nome da preguiça: " + preguica.getNome());
        System.out.println("Idade da preguiça: " + preguica.getIdade() + " anos");
        preguica.emitirSom(); 

        System.out.println();

        System.out.println("Nome do cavalo: " + cavalo.getNome());
        System.out.println("Idade do cavalo: " + cavalo.getIdade() + " anos");
        cavalo.emitirSom(); 

        System.out.println("------------------------------------------------------");

        //Implementação da classe Veterinário
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(preguica);
        veterinario.examinar(cavalo);

        System.out.println("------------------------------------------------------");

        //Implementação da classe Zoológico
        new Zoologico(); 
    }
}
