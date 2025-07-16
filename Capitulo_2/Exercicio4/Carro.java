package Capitulo_2.Exercicio4;

public class Carro {
    String modelo;
    int ano;

    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirCarro() {
        System.out.println("O carro de modelo " + modelo + " foi fabricado no ano de " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Uno", 2015);
        Carro carro2 = new Carro("Corsa", 1996);
        Carro carro3 = new Carro("Volkswagen", 2000);
        
        carro1.exibirCarro();
        carro2.exibirCarro();
        carro3.exibirCarro();
    }
}
