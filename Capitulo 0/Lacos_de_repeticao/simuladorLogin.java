package Lacos_de_repeticao;
import java.util.Scanner;

public class simuladorLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean senhaCorreta = false;
        String senhaFixa = "teste";
        String senhaTentativa = null;

        do {
            System.out.println("Digite a sua senha");
            senhaTentativa = scanner.nextLine();

            if (senhaTentativa.equals(senhaFixa)) {
                System.out.println("Acesso permitido");
                senhaCorreta = true;
            }
            else {
                System.err.println("Senha incorreta!");
            }

        } while (!senhaCorreta);
        scanner.close();
    }
}
