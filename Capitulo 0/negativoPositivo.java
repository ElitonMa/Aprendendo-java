import java.util.Scanner;

public class negativoPositivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        float numero = scanner.nextFloat();

        if (numero >= 0) {
            System.out.println("Seu número " + numero + " é positivo!");
        }
        else {
            System.out.println("Seu número " + numero + " é negativo");
        }

        scanner.close();
        return;
    }
}
