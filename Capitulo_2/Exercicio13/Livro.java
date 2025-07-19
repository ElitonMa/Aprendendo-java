package Capitulo_2.Exercicio13;

public class Livro {
    String titulo;
    int isbn;

    static int contador = 0;
    {
        contador++;
        isbn = contador;
    }
    
    Livro(String titulo) {
        this.titulo = titulo;
    }

    
    void exibirDados() {
        System.out.println("O livro " + titulo + " tem isbn de " + isbn);
    }
}
