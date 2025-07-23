package Capitulo_3.Exercicio13;

public class Jogador {
    private int vida;

    Jogador (int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void tomarDano(int dano) {
        if ( (vida - dano) < 0) {
            this.vida = 0;
        }
        else if (dano < 0) {
            System.out.println("Dano nao pode ser menor que 0");
            return;
        }
        else {
            this.vida -= dano;
        }
    }
    public void curar(int vida) {
        if ( (this.vida + vida) > 100) {
            this.vida = 100;
        }
        else if (vida < 0) {
            System.out.println("Cura nao pode ser menor que 0.");
            return;
        }
        else {
            this.vida += vida;
        }
    }
}
