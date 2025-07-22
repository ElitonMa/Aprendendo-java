package Capitulo_3.Exercicio10;

public class Filme {
    private String titulo;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setClassificacao(int classificacao) {
        if (classificacao < 0 || classificacao > 18) {
            System.err.println("Classificacao invalida.");
            return;
        }
        this.classificacao = classificacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
