package Capitulo_2.Exercicio9;

public class Reta {
    Ponto a;
    Ponto b;

    Reta(Ponto a, Ponto b) {
        this.a = a;
        this.b = b;
    }
    
    void mostrarCordernadas() {
        System.out.println("Ponto A: (" + a.x + "," + a.y + ") Ponto B: (" + b.y + "," + b.x + ")");
    }
}
