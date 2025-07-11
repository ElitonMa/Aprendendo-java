package Funcoes;
import java.util.Scanner;

public class CalculoPotencia {
    
    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        for (int i = 1; i < expoente; i++) {
            base *= base;
        }
        return base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = 0;
        int expoente = 0;

        System.out.println("Digite a base e expoente");

        base = scanner.nextInt();
        expoente = scanner.nextInt();

        int valor = calcularPotencia(base, expoente);

        System.out.println("O numero " + base + " Elevado a " + expoente + " = " + valor);

        scanner.close();
    }
}
