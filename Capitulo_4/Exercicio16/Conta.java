package Capitulo_4.Exercicio16;

public class Conta {
    private String titular;
    private double saldoInicial;

    public void exibirDados() {
        System.out.println("Essa conta pertence a '" + titular + "' com saldo de " + saldoInicial );
    }

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }

    public Conta(String titular) {
        this.titular = titular;
        this.saldoInicial = 0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}
