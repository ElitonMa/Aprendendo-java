package Capitulo_4.Exercicio12;

public class DVD extends Midia {
    protected int duracaoMinutos;

    public DVD(String titulo, int ano, int duracaoMinutos) {
        super(titulo, ano);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void exibirDados() {
        System.out.println("O DVD com titulo '" + titulo + "' criado no ano " + ano + " tem duração de " + duracaoMinutos + " minutos");
    }

    // Getters
    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    // Setters
    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
