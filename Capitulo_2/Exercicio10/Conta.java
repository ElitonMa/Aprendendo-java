package Capitulo_2.Exercicio10;

import java.util.Random;

public class Conta {
    String titular;
    int numeroConta;

    Random random = new Random();

    Conta(String titular) {
        this.titular = titular;
        numeroConta = 1000 + random.nextInt(10000);
    }

    void mostrarConta() {
        System.out.println("A conta numero " + numeroConta + " pertence ao titular " + titular);
    }
}
