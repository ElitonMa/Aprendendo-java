package Capitulo_4.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gerson", 2742);
        Gerente gerente = new Gerente("Joaquim", 3250, "Finanças");

        funcionario.exibirInfo();
        gerente.exibirInfo();
    }
}
