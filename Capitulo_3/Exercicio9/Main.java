package Capitulo_3.Exercicio9;

public class Main {
    public static void main(String[] args) {
        Banco conta = new Banco();

        conta.getSaldo();
        conta.depositar(-14);
        conta.depositar(500);
        conta.sacar(500);
        conta.sacar(600);
        conta.sacar(-300);        
    }
}

