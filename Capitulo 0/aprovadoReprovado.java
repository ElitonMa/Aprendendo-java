import java.util.Scanner;

public class aprovadoReprovado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float notaFinal;
        float numeroFaltas;
        float quantidadeAulas = 200;

        System.out.println("Digite a nota final de um aluno");
        notaFinal = scanner.nextFloat();

        System.out.println("Digite sua quantidade de faltas");
        numeroFaltas = scanner.nextFloat();

        if (numeroFaltas > (quantidadeAulas*0.25f)) {
            System.out.println("Esse aluno esta reprovado por falta!");
        }
        else if (notaFinal < 7) {
            System.out.println("Esse aluno esta reprovado por nota!");
        }
        else if (numeroFaltas <= (quantidadeAulas*0.25f) & notaFinal >= 7) {
            System.out.println("Esse aluno esta aprovado!");
        }

        scanner.close();
    }   
}
