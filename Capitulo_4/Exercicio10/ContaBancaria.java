package Capitulo_4.Exercicio10;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void exibirDados() {
        System.out.println("Essa conta bancaria pertence a " + titular + " e tem saldo de R$" + saldo);
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
