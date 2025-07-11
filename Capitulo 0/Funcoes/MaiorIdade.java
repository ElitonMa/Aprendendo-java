package Funcoes;

import java.util.Scanner;

class MaiorIdade {
    public static void verificarMaiorIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    }
    
    public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

            int idade = 0;

            try {
                System.out.println("Digite sua idade: ");
                idade = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Idade invalida!");
                scanner.close();
                return;
            }

            verificarMaiorIdade(idade);
            scanner.close();
    }
}