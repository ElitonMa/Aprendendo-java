package Capitulo_4.Exercicio9;

public class Curso {
    protected String nome;
    protected int duracaoMeses;

    public Curso(String nome, int duracaoMeses) {
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
    }

    public void exibirDados() {
        System.out.println("O curso " + nome + " tem duração de " + duracaoMeses + " meses");
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }
}
