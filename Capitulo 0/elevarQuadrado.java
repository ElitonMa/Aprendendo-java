import java.util.Scanner;

public class elevarQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        float numero = scanner.nextFloat();

        if (numero >= 0) {
            float numeroSquared = numero*numero;
            System.out.println("Seu número elevado ao quadrado é: " + numeroSquared);
        }
        else {
            System.out.println("Número invalido!");
        }

        scanner.close();
        return;
    }
}
