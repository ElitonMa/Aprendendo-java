package Capitulo_1.Exercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o nome de um aluno");
            aluno1.nome =  scanner.nextLine();
    
            System.out.println("Digite a idade desse aluno");
            aluno1.idade = scanner.nextInt();
    
            System.out.println("Digite a nota desse aluno");
            aluno1.nota = scanner.nextFloat();
        } catch (Exception e) {
            System.err.println("Valor invalido!");
            scanner.close();
            return;
        }
   
        aluno1.mostrarDados();
        scanner.close();
    }
}
