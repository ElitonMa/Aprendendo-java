package Capitulo_3.Exercicio3;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double saldo) {
        if (saldo < 0) {
            System.out.println("Nao e permitido valores negativos.");
            return;
        }
        this.saldo = saldo;
    }
}
