package Capitulo_1.Classes;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void exibirDetalhes() {
        System.out.println("O titulo desse livro é: " + titulo + ", O autor é: " + autor + ", E a quantidade de páginas é: " + numeroPaginas);
    }
}
