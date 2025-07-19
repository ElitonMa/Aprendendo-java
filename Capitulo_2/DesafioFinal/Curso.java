package Capitulo_2.DesafioFinal;

public class Curso {
    String nomeCurso;
    int cargaHoraria;
    String instrutor;

    Curso(String nomeCurso, int cargaHoraria, String instrutor) {
        if (nomeCurso == null) {
            System.err.println("Nome invalido.");
            return;
        }
        if (cargaHoraria <= 0) {
            System.err.println("Carga horaria invalida.");
            return;
        }
        if (instrutor == null) {
            System.err.println("Instrutor invalido.");
            return;
        }
        
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.instrutor = instrutor;
    }
}
