package Capitulo_1.Exercicio7;

public class Calculadora {
    
    void somar(int a, int b) {
        float valor = a + b;
        System.out.println("O valor de sua soma eh: " + valor);
    }
    void subtrair(int a, int b) {
        float valor = a - b;
        System.out.println("O valor de sua subtracao eh: " + valor);
    }
    void multiplicar(int a, int b) {
        float valor = a * b;
        System.out.println("O valor da sua multiplicacao eh: " + valor);
    }
    void dividir(int a, int b) {
        if (a == 0 || b == 0) {
            System.err.println("Indefinido.");
            return;
        }
        float valor = a / b;
        System.out.println("O valor de sua divisao eh: " + valor);
    }
}
