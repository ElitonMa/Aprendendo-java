package Capitulo_3.Exercicio16;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel == false) {
            System.out.println("Livro ja emprestado.");
            return;
        }
        else {
            System.out.println("Livro emprestado com sucesso!");
            this.disponivel = false;
        }
    }

    public void devolver() {
        if (this.disponivel == true) {
            System.out.println("Livro ja disponivel.");
            return;
        }
        else {
            System.out.println("Livro devolvido com sucesso.");
            this.disponivel = true;
        }
    }

    public void isDisponivel() {
        if (this.disponivel == true) {
            System.out.println("Este livro esta disponivel.");
        }
        else {
            System.out.println("Este livro nao esta disponivel.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("O livro de titulo " + this.titulo + " foi escrito pelo autor " + this.autor);
    }
}
