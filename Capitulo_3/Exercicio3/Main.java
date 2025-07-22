package Capitulo_3.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(-123);
        conta.depositar(500);
        conta.getSaldo();
    }
}
