package Capitulo_4.Exercicio17;

public class Pessoa {
    private String nome;
    private int telefone;

    public Pessoa(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("A pessoa '" + nome + "' tem o telefone " + telefone);
    }

    // Getters
    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
