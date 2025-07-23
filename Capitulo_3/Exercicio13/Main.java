package Capitulo_3.Exercicio13;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador(50);

        System.out.println("Vida atual: " + jogador.getVida());
        
        // Verificacao dano
        jogador.tomarDano(5000);
        System.out.println("Vida (dano 5000): " + jogador.getVida());
        jogador.tomarDano(-15);

        // Verificacao cura
        jogador.curar(1000);
        System.out.println("Vida (cura 1000): " + jogador.getVida());
        jogador.curar(-50);
    }
}
