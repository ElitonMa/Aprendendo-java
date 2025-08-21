package Capitulo_4.Exercicio15;

public class Main {
    public static void main(String[] args) {
        Transporte transporte = new Transporte("Bicicleta", 2);
        Maritimo maritimo = new Maritimo("Navio", 500, 10);
        Aereo aereo = new Aereo("Avião", 180, 3000);
        Terrestre terrestre = new Terrestre("Carro", 5, "Diesel");

        transporte.exibirDados();
        maritimo.exibirDados();
        aereo.exibirDados();
        terrestre.exibirDados();
    }
}
