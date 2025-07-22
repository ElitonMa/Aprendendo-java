package Capitulo_3.Exercicio1;

public class Pessoa {
    private String nome;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.println("O nome é: " + this.nome);
    }
}
