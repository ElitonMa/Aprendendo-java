package Capitulo_2.Exercicio11;

public class Main {
    public static void main(String[] args) {
        Relogio relogioMinutos60 = new Relogio(14, 60, 46);
        Relogio relogioSegundos60 = new Relogio(22, 32, 60);
        Relogio relogioHoras24 = new Relogio(24, 33, 24);
        Relogio relogioValido = new Relogio(12, 37, 14);

        relogioMinutos60.mostrarHora();
        relogioSegundos60.mostrarHora();
        relogioHoras24.mostrarHora();
        relogioValido.mostrarHora();
    }
}
