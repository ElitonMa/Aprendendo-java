package Capitulo_3.Exercicio15;

public class Termometro {
    private double temperaturaAtual;

    public double getTemperatura() {
        if (this.temperaturaAtual > 38) {
            System.out.println("Alerta: febre!");
        }
        return temperaturaAtual;
    }

    public void setTemperatura(double temperaturaAtual) {
        // Verificação se é menor que o zero absoluto
        if (temperaturaAtual < -273.15) {
            System.err.println("Temperatura invalida.");
            return;
        }
        this.temperaturaAtual = temperaturaAtual;
    }

}
