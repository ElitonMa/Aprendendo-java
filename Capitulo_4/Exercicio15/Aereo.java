package Capitulo_4.Exercicio15;

public class Aereo extends Transporte {
    protected int altitudeMaxima;

    public Aereo(String nome, float capacidade, int altitudeMaxima) {
        super(nome, capacidade);
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public void exibirDados() {
        System.out.println("O veiculo aereo '" + nome + "' tem capacidade de " + capacidade + " pessoas e altitude maxima de " + altitudeMaxima + "M");
    }

    // Getters
    public int getAltitudeMaxima() {
        return altitudeMaxima;
    }

    // Setters
    public void setAltitudeMaxima(int altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }
}
