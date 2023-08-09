package types;

abstract class AnimalAB implements AnimalIF {
    protected double comidaIngerida;
    protected double distanciaPercorrida;
    protected double horasDormidas;

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB() {
        comidaIngerida = 0;
        distanciaPercorrida = 0;
        horasDormidas = 0;
    }

    @Override
    public abstract void comer(double comidaIngerida);

    @Override
    public abstract void moverse(double distanciaPercorrida);

    @Override
    public abstract void dormir(double horasDormidas);

}