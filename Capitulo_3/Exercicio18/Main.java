package Capitulo_3.Exercicio18;

public class Main {
    public static void main(String[] args) {

        SensorTemperatura sensor1 = new SensorTemperatura(30d);
        SensorTemperatura sensor2 = new SensorTemperatura(37d);
        SensorTemperatura sensor3 = new SensorTemperatura(40d);
        SensorTemperatura sensor4 = new SensorTemperatura(80d);
        SensorTemperatura sensor5 = new SensorTemperatura(12d);
        PainelTemperatura painel = new PainelTemperatura();

        painel.sensores[0] = sensor1;
        painel.sensores[1] = sensor2;
        painel.sensores[2] = sensor3;
        painel.sensores[3] = sensor4;
        painel.sensores[4] = sensor5;

        painel.verificarAlertas();
    }
}
