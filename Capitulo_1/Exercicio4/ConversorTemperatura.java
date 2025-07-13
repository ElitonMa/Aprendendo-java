package Capitulo_1.Exercicio4;

public class ConversorTemperatura {
    double c;
    double f;

    void celsiusParaFahrenheit(double c) {
        double valorF = (c * 9/5) + 32;
        System.out.println("O seu valor em Fahrenheit é: " + valorF);
    }
    void fahrenheitParaCelsius(double f) {
        double valorC = (f - 32) * 5/9;
        System.out.println("O seu valor em Celsius é: " + valorC);
    }
}
