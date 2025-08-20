package Capitulo_4.Exercicio8;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(30);
        IngressoVIP ingressoVIP = new IngressoVIP(30, 20);

        ingresso.exibirValor();
        ingressoVIP.exibirValor();
    }
}
