package Capitulo_3.Exercicio14;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(10);

        // verificacao entrarPessoa
        elevador.entrarPessoa(1);
        System.out.println("Pessoas (1 entrou): " + elevador.getOcupantes());
        elevador.entrarPessoa(11);
        System.out.println("Pessoas (11 entrou): " + elevador.getOcupantes());        
        elevador.entrarPessoa(-15);
        System.out.println("Pessoas (-15 entrou): " + elevador.getOcupantes());

        // verificacao sairPessoa
        elevador.sairPessoa(1);
        System.out.println("Pessoas (1 saiu): " + elevador.getOcupantes());
        elevador.sairPessoa(10);
        System.out.println("Pessoas (10 saiu): " + elevador.getOcupantes());
        elevador.sairPessoa(-3);
        System.out.println("Pessoas (-3 saiu): " + elevador.getOcupantes());
    }
}
