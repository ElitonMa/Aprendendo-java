package Lacos_de_repeticao;
import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        
        Random geradorAleatorio = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroAleatorio = 1 + geradorAleatorio.nextInt(10);
        
        boolean acertouNumero = false;
        int numeroTentativa;
        
        do {
            try {
                System.out.println("Digite um número para tentar adivinhar o número gerado aleatoriamente");
                numeroTentativa = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Não é um número.");
                scanner.close();
                return;
            }

            if (numeroTentativa == numeroAleatorio) {
                System.out.println("Parabens você acertou o número!");
                acertouNumero = true;
            }
            else if (numeroTentativa < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número gerado");
            }
            else if (numeroTentativa > numeroAleatorio)  {
                System.out.println("O número digitado é maior que o número gerado");
            }

        } while (!acertouNumero);

        scanner.close();
    }
}
