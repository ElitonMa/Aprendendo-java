import java.util.Scanner;

public class calculoImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        float imposto = 0;

        System.out.println("Digite seu salário");
        salario = scanner.nextDouble();

        if (salario <= 1903.98f) {
            imposto = 0f;
        }
        else if (salario >= 1903.99f && salario <= 2826.65f) {
            imposto = 7.5f;
        }
        else if (salario >= 2826.66f && salario <= 3751.05) {
            imposto = 15f;
        }
        else if (salario >= 3751.06 && salario <= 4664.68) {
            imposto = 22.5f;
        }
        else if (salario > 4664.68 ) {
            imposto = 27.5f;
        }

        double taxaImposto = salario + (salario * (imposto/100));

        System.out.println("Seu imposto de renda é: " + taxaImposto);
        scanner.close();
     }
}
