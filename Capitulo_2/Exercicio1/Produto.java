package Capitulo_2.Exercicio1;

public class Produto {
    String nome;

    Produto(){};

    Produto (String nome) {
        this.nome = nome;
    }

    void exibirNome(){
        System.out.println("O nome desse produto é: " + nome);
    }
}
