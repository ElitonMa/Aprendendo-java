package Capitulo_2.Exercicio5;

public class ContaBancaria {
    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void exibirSaldo() {
        System.out.println("O seu saldo atual é R$" + saldo);
    }

    void depositar(double valor) {
        if (valor < 0) {
            System.err.println("O valor não pode ser negativo");
            return;
        }
        else {
            System.out.println("Depositado " + valor);
            saldo += valor;
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Almeida", 0);

        conta.depositar(-5);
        conta.depositar(200);

        conta.exibirSaldo();
    }
}
