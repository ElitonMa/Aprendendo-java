package Matrizes;

public class maiorEMenor {
    public static void main(String[] args) {
        int[][] matriz = {  {1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25} };
        int numeroMaior = 0;
        int numeroMenor = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                numeroMaior = matriz[i][0];
                numeroMenor = matriz[i][0];
            }
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > numeroMaior) {
                    numeroMaior = matriz[i][j];
                }
                else if (matriz[i][j] < numeroMenor) {
                    numeroMenor = matriz[i][j];
                }
            }
        }
        System.out.println("Menor numero: " + numeroMenor + "\nMaior número: " + numeroMaior);
    }
}
