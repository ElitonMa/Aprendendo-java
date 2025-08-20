package Capitulo_4.Exercicio4;

public class Ebook extends Livro {
    protected int tamanhoArquivoMB;

    public Ebook(String titulo, String autor, int tamanhoArquivoMB) {
        super(titulo, autor);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public void setTamanhoArquivoMB(int tamanhoArquivoMB) {
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public int getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void mostrarDados() {
        System.out.println("O livro " + titulo + " tem como autor " + autor + " e " + tamanhoArquivoMB + " Megabytes");
    }
}
