package Capitulo_3.Exercicio5;

public class Carro {
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }
    public void acelerar(int velocidade) {
        if (velocidade < 0) {
            System.err.println("Nao sao permitidos valores negativos.");
            return;
        }
        this.velocidade = velocidade;  
    }
}
