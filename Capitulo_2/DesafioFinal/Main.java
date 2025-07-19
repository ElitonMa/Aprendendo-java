package Capitulo_2.DesafioFinal;

public class Main {
    public static void main(String[] args) {
        Curso cursoMatematica = new Curso("Matematica Avancada", 440, "Leandro da Silva");
        Aluno aluno1 = new Aluno("Lucas dos Santos", 253256, cursoMatematica);
        aluno1.exibirFicha();
    }
}
