package Capitulo_4.Exercicio1;

public class Aluno extends Pessoa {
    private int  matricula;

    public void exibirDados() {
        System.out.println("O aluno " + this.nome + " com idade de " + this.idade + " anos tem como matricula " + this.matricula);
    }

    public Aluno(String nome , int matricula,  int idade) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
