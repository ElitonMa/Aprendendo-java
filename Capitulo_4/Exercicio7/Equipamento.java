package Capitulo_4.Exercicio7;

public class Equipamento {
    protected String fabricante;
    protected int anoFabricacao;

    public Equipamento(String fabricante, int anoFabricacao) {
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirDados() {
        System.out.println("Esse equipamento tem como fabricante " + fabricante + " que foi fabricado no ano de " + anoFabricacao);
    }

    // Setters
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    // Getters
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }
}
