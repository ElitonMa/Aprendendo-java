package Capitulo_4.Exercicio8;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void exibirValor() {
        System.out.println("Esse ingresso custa R$" + valor);
    }

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Getters
    public double getValor() {
        return valor;
    }
}
