package Capitulo_4.Exercicio15;

public class Transporte {
    protected String nome;
    protected int capacidade;

    public void exibirDados() {
        System.out.println("O transporte '" + nome + "' tem capacidade de " + capacidade + " pessoas");
    }

    public Transporte(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = (int) capacidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = (int) capacidade;
    }
}
