package Capitulo_1.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    
        calculadora.somar(3, 9);
        calculadora.subtrair(15, 23);
        calculadora.multiplicar(9, 5);
        calculadora.dividir(15, 0); // Teste por 0
        calculadora.dividir(4, 2);
    }   
}
