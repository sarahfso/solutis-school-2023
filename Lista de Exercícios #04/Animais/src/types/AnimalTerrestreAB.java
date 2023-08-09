package types;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB () {
        tipoAnimal = "Terrestre";
    }

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
        "\nQuantidade de patas: " + quantidadePatas +
        "\n---------------------------------" +
        "\nQuantidade de comida ingerida: " + comidaIngerida + " kg" +
        "\nDistância percorrida: " + distanciaPercorrida + " km" +
        "\nQuantidade de horas dormidas: " + horasDormidas + " horas\n";
    }
}
