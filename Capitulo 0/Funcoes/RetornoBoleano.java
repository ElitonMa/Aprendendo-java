package Funcoes;
import java.util.Scanner;

public class RetornoBoleano {
    
    public static boolean ehPositivo(int numero) {
        if (numero >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Numero invalido!");
            scanner.close();
            return;
        }

        if (ehPositivo(numero)){
            System.out.println("Esse número é positivo!");
        }
        else if (!ehPositivo(numero)){
            System.out.println("Esse número não e positivo.");
        }

        scanner.close();
    }

}
