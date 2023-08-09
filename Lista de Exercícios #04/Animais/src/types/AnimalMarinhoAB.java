package types;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB () {
        this.tipoAnimal = "Marinho";
    }

    public abstract void nadar(double distanciaPercorrida);

    public String toString() {
        return 
        "\nInformações do Animal" +
        "\nNome: " + nome + 
        "\nTipo de Animal: " + tipoAnimal +
        "\nIdade: " + idade + " anos" +
        "\nHábitat: " + habitat +
        "\nAltura: " + altura + " cm" +
        "\nPeso: " + peso + " kg" +
        "\n---------------------------------" +
        "\nQuantidade de comida ingerida: " + comidaIngerida + " kg" +
        "\nDistância percorrida: " + distanciaPercorrida + " km" +
        "\nQuantidade de horas dormidas: " + horasDormidas + " horas\n";
    }
}
