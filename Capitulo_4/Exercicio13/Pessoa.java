package Capitulo_4.Exercicio13;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Essa pessoa chamada " + nome + " tem idade de " + idade + " anos");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
