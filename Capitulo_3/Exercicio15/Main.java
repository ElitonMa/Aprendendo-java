package Capitulo_3.Exercicio15;

public class Main {
    public static void main(String[] args) {
        Termometro tempTermometro = new Termometro();

        System.out.println("Temperatura atual: " + tempTermometro.getTemperatura());

        tempTermometro.setTemperatura(37);
        System.out.println("Temperatura atual: " + tempTermometro.getTemperatura());

        // Verificação de febre
        tempTermometro.setTemperatura(39);
        System.out.println("Temperatura atual: " + tempTermometro.getTemperatura());

        // Verificação menor que 0 kelvin
        tempTermometro.setTemperatura(-276);
        System.out.println("Temperatura atual: " + tempTermometro.getTemperatura());
    }
}
