package Capitulo_4.Exercicio4;

public class Livro {
    protected String titulo;
    protected String autor;

    public Livro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarDados() {
        System.out.println("O livro " + titulo + " tem como autor " + autor);
    }
}
