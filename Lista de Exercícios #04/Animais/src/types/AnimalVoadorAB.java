package types;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadePatas;
    public int quantidadeAsas;
    public double envergaduraAsa;

    public AnimalVoadorAB () {
        this.tipoAnimal = "Voador";
    }

    public abstract void voar(double distanciaPercorrida);

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
        "\nQuantidade de asas: " + quantidadeAsas +
        "\nEnvergadura da asa: " + envergaduraAsa + " cm" +
        "\n---------------------------------" +
        "\nQuantidade de comida ingerida: " + comidaIngerida + " kg" +
        "\nDistância percorrida: " + distanciaPercorrida + " km" +
        "\nQuantidade de horas dormidas: " + horasDormidas + " horas\n";
    }
}
