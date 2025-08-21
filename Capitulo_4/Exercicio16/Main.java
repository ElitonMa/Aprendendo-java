package Capitulo_4.Exercicio16;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Erick");
        Conta conta2 = new Conta("Eliton", 50);
        ContaCorrente contaCorrente = new ContaCorrente("Joaquim",120, 900);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Henrique", 500, 2.4f);

        conta.exibirDados();
        conta2.exibirDados();
        contaCorrente.exibirDados();
        contaPoupanca.exibirDados();
    }
}
