import java.util.Scanner;

public class categoriaNatacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        String categoriaNatacao = null;

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade <= 0) {
            System.err.println("Idade invalida!");
        }
        else if (idade >= 5 && idade <= 7) {
            categoriaNatacao = "Infantil A";
        }
        else if (idade >= 8 && idade <= 10) {
            categoriaNatacao = "Infantil B";
        }
        else if (idade >= 11 && idade <= 13) {
            categoriaNatacao = "Juvenil A";
        }
        else if (idade >= 14 && idade <= 17) {
            categoriaNatacao = "Juvenil B";
        }
        else {
            categoriaNatacao = "Adulto";
        }
        
        System.out.println("Sua categoria é: " + categoriaNatacao);
        
        scanner.close();
    }
}
