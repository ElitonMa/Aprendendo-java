package Capitulo_3.Exercicio8;

public class Sensor {
    private double temperatura;

    public void setTemperatura(double temperatura) {
        if (temperatura > 100) {
            this.temperatura = 100;
        }
        this.temperatura = temperatura;
    }
    public double getTemperatura() {
        return temperatura;
    }
}
