package Capitulo_4.Exercicio5;

public class Animal {
    protected String nome;
    protected String tipo;

    public Animal(String nome, String tipo) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Esse animal se chama " + nome + " e é do tipo " + tipo);
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
