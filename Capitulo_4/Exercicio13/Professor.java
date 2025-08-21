package Capitulo_4.Exercicio13;

public class Professor extends Pessoa {
    protected String disciplina;
    protected int cargaHorariaSemanal;

    public Professor(String nome, int idade, String disciplina, int cargaHorariaSemanal) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    @Override
    public void exibirDados() {
        System.out.println("O professor " + nome + " de " + disciplina + " tem " + idade + " anos" + " com carga horária de " + cargaHorariaSemanal);
    }

    // Getters
    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public String getDisciplina() {
        return disciplina;
    }

    // Setters
    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
