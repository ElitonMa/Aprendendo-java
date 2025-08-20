package Capitulo_4.Exercicio12;

public class Midia {
    protected String titulo;
    protected int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("A midia com titulo '" + titulo + "' originou no ano " + ano);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
