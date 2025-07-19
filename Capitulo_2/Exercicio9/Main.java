package Capitulo_2.Exercicio9;

public class Main {
    public static void main(String[] args) {
        Ponto pontoA = new Ponto(5, 4);
        Ponto pontoB = new Ponto(2, 0);
        Reta reta = new Reta(pontoA, pontoB);
        reta.mostrarCordernadas();
    }
}
