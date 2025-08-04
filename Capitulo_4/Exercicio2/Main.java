package Capitulo_4.Exercicio2;

public class Main {
    public static void main (String[] args) {

        Veiculo veiculo1 = new Veiculo("Ferrari");
        veiculo1.exibirMarca();

        Carro carro1 = new Carro("Golf","Wolkswagen");
        Carro carro2 = new Carro("Uno","Fiat");

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
