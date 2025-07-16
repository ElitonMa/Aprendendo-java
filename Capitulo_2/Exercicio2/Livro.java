package Capitulo_2.Exercicio2;

public class Livro {
    String titulo;
    String autor;

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibirInformacoes() {
        System.out.println("O livro " + titulo + " tem como autor " + autor);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Le Petit Prince","Antoine de Saint-Exupéry");
        livro.exibirInformacoes();
    }
}
