package Matrizes;

public class contarNaoZero {
    public static void main(String[] args) {
        int[][] matriz = {  {1,2,0,0,0,0},
                            {5,6,7,0,0,0},
                            {2,2,2,0,0,0},
                            {0,0,0,12,0,0},
                            {14,16,18,0,3,0},
                            {21,0,0,0,0,0} };
        int qntDiferenteDeZero = 0;
                    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != 0) {
                    qntDiferenteDeZero++;
                }
            }
        }
        System.out.println("Quantidade de elementos diferentes de zero: "+qntDiferenteDeZero);
    }
}
