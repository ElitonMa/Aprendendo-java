package Capitulo_4.Exercicio12;

public class Main {
    public static void main(String[] args) {
        Midia midia = new Midia("A Fabrica Show", 2015);
        DVD dvd = new DVD("A volta dos que já foram", 2009, 94);

        midia.exibirDados();
        dvd.exibirDados();
    }
}
