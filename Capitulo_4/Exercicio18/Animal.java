package Capitulo_4.Exercicio18;

public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void exibirDados() {
        System.out.println("O animal '" + nome + "' é da espécie " + especie);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    // Setters
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
