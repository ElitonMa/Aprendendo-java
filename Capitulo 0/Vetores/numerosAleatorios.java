package Vetores;
import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[10];

        Random gerador = new Random();
        boolean numeroUnico = false;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            do {
                int numeroGerado = 1 + gerador.nextInt(10);
                for (int j = 0; j < numerosAleatorios.length; j++) {
                    if (numeroGerado == numerosAleatorios[j]) {
                        numeroUnico = false;
                        break;
                    }
                    else if (j == numerosAleatorios.length - 1) {
                        numerosAleatorios[i] = numeroGerado; 
                        System.out.println(numerosAleatorios[i]);
                        numeroUnico = true;
                    }
                }
            } while (!numeroUnico);
        }
    }
}
