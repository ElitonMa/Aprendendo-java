package Capitulo_3.Exercicio12;

public class ContaLimite {
    private double saldo;
    private double limiteCredito;

    ContaLimite(double limiteCredito) {
        this.limiteCredito = limiteCredito;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Esse valor e maior que seu saldo atual.");
            return;
        }
        else if (valor <= (this.saldo + this.limiteCredito) && valor >= 0) {
            this.saldo -= valor;
        }
        else {
            System.err.println("Voce nao pode sacar esse valor.");
            return;
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.err.println("Nao pode depositar valores negativos.");
            return;
        }
        this.saldo += valor;
    }
}
