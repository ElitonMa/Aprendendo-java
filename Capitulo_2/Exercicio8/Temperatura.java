package Capitulo_2.Exercicio8;

public class Temperatura {
    double celsius;

    Temperatura(double fahrenheit) {
        double valorC = (fahrenheit - 32) * 5/9;
        this.celsius = valorC;
    }

    void mostrarCelsius() {
        System.out.println("O valor em celsius é: " + celsius);
    }
}
