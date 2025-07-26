package Capitulo_3.Exercicio18;

public class PainelTemperatura {
    public SensorTemperatura[] sensores = new SensorTemperatura[5];
    
    public void verificarAlertas() {
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i].getTemperaturaAtual() > 38) {
                System.out.println("Sensor " + i + " com alerta de temperatura!");
            }
        }
    }
}
