package Capitulo_3.Exercicio6;

public class Livro {
    private String titulo;
    private int paginas;

    public void setPaginas(int paginas) {
        if (paginas <= 0) {
            System.err.println("O valor deve ser maior que 0.");
            return;
        }
        this.paginas = paginas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getPaginas() {
        return paginas;
    }
    public String getTitulo() {
        return titulo;
    }
}
