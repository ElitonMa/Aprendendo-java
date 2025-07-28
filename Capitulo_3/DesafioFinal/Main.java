package Capitulo_3.DesafioFinal;

public class Main {
    public static void main(String[] args) {
        AlunoAcademia academia1 = new AlunoAcademia("Pedro", 16, 1.76d, 77d);
        AlunoAcademia academia2 = new AlunoAcademia("Eduardo", 22, 1.89d, 59d);

        System.out.format("A pessoa com nome de %s tem imc de %.2f com classificação %s.\n", academia1.getNome(), academia1.calcularIMC(), academia1.classificarIMC() );

        academia2.setAltura(-14);
        academia2.setPeso(-30);
    }
}
