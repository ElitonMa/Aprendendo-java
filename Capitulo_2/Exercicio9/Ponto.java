package Capitulo_2.Exercicio9;


public class Ponto  {
    int x;
    int y;

    public class Reta {
        float pontoA;
        float pontoB;

        Reta(float pontoA, float pontoB) {
            this.pontoA = pontoA;
            this.pontoB = pontoB;
        }
        
        void mostrarCordernadas() {
            System.out.println("Ponto A: (" + pontoA + ") Ponto B: (" + pontoB + ")");
        }
    }

    public static void main(String[] args) {
        Ponto ponto = new Ponto();
        Reta reta = ponto.new Reta(5.4f, 2.1f);

        reta.mostrarCordernadas();
    }
}
