package Capitulo_4.Exercicio2;

public class Veiculo {
    protected String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void exibirMarca() {
        System.out.println("A marca deste carro é: " + this.marca);
    }
}
