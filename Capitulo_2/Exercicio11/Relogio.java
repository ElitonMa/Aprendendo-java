package Capitulo_2.Exercicio11;

public class Relogio {
    int hora;
    int minuto;
    int segundo;

    void mostrarHora() {
        System.out.println( " " + hora + ":" + minuto + ":" + segundo);
    }

    Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        
        if (hora >= 24) {
            System.err.println("Hora invalida!");
            this.hora = 0;
        }
        else if (minuto >= 60) {
            System.err.println("Minutos invalidos!");
            this.minuto = 0;
        }
        else if (segundo >= 60) {
            System.err.println("Segundos invalidos!");
            this.segundo = 0;
        }
    }
}
