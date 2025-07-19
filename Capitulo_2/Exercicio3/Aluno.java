package Capitulo_2.Exercicio3;

public class Aluno {
    String nome;
    double nota;
    Aluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    void situacao() {
        if (this.nota > 6) {
            System.out.println("A nota do aluno " + nome + " é maior que 6.");
        }
        else {
            System.out.println("A nota do aluno " + nome + " é menor que 6.");
        }
    }

}
