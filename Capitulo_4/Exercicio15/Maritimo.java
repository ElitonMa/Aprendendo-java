package Capitulo_4.Exercicio15;

public class Maritimo extends Transporte {
    protected int profundidadeMaxima;

    public Maritimo(String nome, float capacidade, int profundidadeMaxima) {
        super(nome, capacidade);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    public void exibirDados() {
        System.out.println("O veiculo maritimo '" + nome + "' tem capacidade de " + capacidade + " pessoas e profundidade maxima de " + profundidadeMaxima + "M");
    }

    // Getters
    public int getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    // Setters
    public void setProfundidadeMaxima(int profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
