package Capitulo_3.Exercicio7;

public class Aluno {
    private double nota;

    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            System.err.println("Nota invalida.");
            this.nota = 0d;
            return;
        }
        this.nota = nota;
    }
}
