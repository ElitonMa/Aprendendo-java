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

            System.out.println(senhaTentativa);
            if (senhaTentativa != senhaFixa) {
                System.err.println("Senha incorreta!");
            }
            else if (senhaTentativa == senhaFixa) {
                System.out.println("Acesso permitido");
                senhaCorreta = true;
            }
            
        } while (!senhaCorreta);
        scanner.close();
    }
}
