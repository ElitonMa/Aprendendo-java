package Capitulo_4.Exercicio9;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Soldagem", 18);
        CursoTecnico cursoTecnico = new CursoTecnico("Técnico em alimentos", 24, "Alimentação");

        curso.exibirDados();
        cursoTecnico.exibirDados();
    }
}
