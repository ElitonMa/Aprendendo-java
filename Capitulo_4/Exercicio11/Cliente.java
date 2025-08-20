package Capitulo_4.Exercicio11;

public class Cliente {
    protected String nome;
    protected int CPF;

    public Cliente(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void exibirDados() {
        System.out.println("O cliente " + nome + " tem o CPF " + CPF);
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }
}
