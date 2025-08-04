package Capitulo_4.Exercicio2;

public class Carro extends Veiculo {
    protected String modelo;

    public Carro(String modelo, String marca) {
        super(marca);
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDetalhes() {
        System.out.println("O carro de modelo " + this.modelo + " tem como marca " + this.marca);
    }
}
