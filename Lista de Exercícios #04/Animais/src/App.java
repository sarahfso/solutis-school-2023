import models.Cachorro;
import models.Gato;
import models.Elefante;
import models.Leao;
import models.Peixe;
import models.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Kiara", 3, "Doméstico", 50, 6.4);
        cachorro.comer(3);
        cachorro.moverse(12.5);
        cachorro.dormir(15);
        System.out.println(cachorro.toString());

        Peixe peixe = new Peixe("Nemo", 1, "Aquário", 5, 0.1);
        peixe.comer(0.25);
        peixe.nadar(10);
        peixe.dormir(4.5);
        System.out.println(peixe.toString());

        Pombo pombo = new Pombo("Jubileu", 2, "Urbano", 10, 0.3, 63);
        pombo.comer(0.5);
        pombo.voar(10);
        pombo.moverse(1.5);
        pombo.dormir(10);
        System.out.println(pombo.toString());
    }
}
