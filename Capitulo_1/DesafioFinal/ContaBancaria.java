package Capitulo_1.DesafioFinal;

public class ContaBancaria {
    String nomeCliente;
    double numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor < 0) {
            System.out.println("O valor deve ser maior que 0.");
            return;
        }
        saldo += valor;
        System.out.println("Depositado R$" + valor);
    }
    void sacar(double valor) {
        if (valor < 0) {
            System.out.println("O valor deve ser maior que 0.");
            return;
        }
        else if (valor > saldo) {
            System.out.println("Você não pode sacar mais do que tem.");
            return;
        }
        saldo -= valor;
        System.out.println("Sacado R$" + valor);
    }
    void exibirSaldo() {
        System.out.println("Seu saldo atual é R$" + saldo);
    }
}