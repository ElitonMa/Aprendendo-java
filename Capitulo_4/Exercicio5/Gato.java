package Capitulo_4.Exercicio5;

public class Gato extends Animal {
    protected String corPelo;

    public Gato(String nome, String tipo, String corPelo) {
        super(nome, tipo);
        this.corPelo = corPelo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Esse gato se chama " + nome + " é do tipo " + tipo + " e a cor do seu pelo é " + corPelo);
    }

    // Getters
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }

    public String getCorPelo() {
        return corPelo;
    }

    // Setters
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
