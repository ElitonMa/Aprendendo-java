package Capitulo_4.Exercicio15;

public class Terrestre extends Transporte {
    protected String tipoCombustivel;

    public Terrestre(String nome, float capacidade, String tipoCombustivel) {
        super(nome, capacidade);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDados() {
        System.out.println("O transporte terrestre '" + nome + "' tem capacidade de " + capacidade + " pessoas e usa o combustivel '" + tipoCombustivel + "'");
    }

    // Getters
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    // Setters
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
