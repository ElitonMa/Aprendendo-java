package Capitulo_4.Exercicio10;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Erick Maffisoni", 54.3f);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Eliton Masurek", 5000.35, 3.2f);

        contaBancaria.exibirDados();
        contaPoupanca.exibirDados();
    }
}
