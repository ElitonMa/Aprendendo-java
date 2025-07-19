package Capitulo_2.DesafioFinal;

public class Aluno {
    String nome;
    int matricula;
    Curso curso;

    Aluno (String nome, int matricula, Curso curso) {
        if (matricula <= 0 ) {
            System.err.println("Matricula invalida.");
            return;
        }
        if (curso == null) {
            System.err.println("Curso invalido.");
            return;
        }   
        if (nome == null) {
            System.err.println("Nome nao pode estar em branco.");
            return;
        }

        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    void exibirFicha() {
        System.out.println("O aluno " + nome + " com a matricula " + matricula + " esta no curso " + curso.nomeCurso + " com carga horario de " + curso.cargaHoraria + " e instrutor " + curso.instrutor);
    }
}
