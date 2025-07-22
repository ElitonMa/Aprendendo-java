package Capitulo_3.Exercicio9;

public class Banco {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Nao e possivel depositar valores negativos.");
            return;
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo < valor || valor < 0) {
            System.out.println("Valor maior que saldo.");
            return;
        }
        saldo -= valor;
    }
}
