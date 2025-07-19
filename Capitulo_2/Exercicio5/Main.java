package Capitulo_2.Exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Almeida", 0);

        conta.depositar(-5);
        conta.depositar(200);

        conta.exibirSaldo();
    }
}
