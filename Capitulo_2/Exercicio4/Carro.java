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
}
