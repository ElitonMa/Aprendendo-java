package Capitulo_2.Exercicio12;

public class Livro {
    String titulo;
    String autor;
    int ano;

    Livro (String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        ano = 2020;
    }

    void exibirInformacoes() {
        System.out.println("O livro " + titulo + " criado no ano " + ano + " tem como autor " + autor);
    }
}
