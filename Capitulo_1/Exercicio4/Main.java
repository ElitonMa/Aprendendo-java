package Capitulo_1.Exercicio4;

public class Main {
    public static void main(String[] args) {

        ConversorTemperatura temperatura = new ConversorTemperatura();
        temperatura.c = 33;
        temperatura.f = 24;

        temperatura.celsiusParaFahrenheit(temperatura.c);
        temperatura.fahrenheitParaCelsius(temperatura.f);
    }
}
