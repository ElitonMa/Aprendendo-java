package Vetores;
import java.util.Scanner;

public class notaDeAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notasAlunos = new int[5];

        for (int i = 0; i < notasAlunos.length; i++) {
            try {
                System.out.format("Digite a nota do %d° aluno",i+1);
                notasAlunos[i] = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Número invalido");
                scanner.close();
                return;
            }
            
            if (notasAlunos[i] >= 7) {
                System.out.println("Esse aluno esta aprovado!");
            }
            else {
                System.out.println("Esse aluno esta reprovado.");
            }
        }

        scanner.close();
    }   
}