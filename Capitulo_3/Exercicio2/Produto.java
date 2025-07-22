package Capitulo_3.Exercicio2;

public class Produto {
    private double preco;

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            System.err.println("Não pode atribuir valores negativos.");
            return;
        }
        this.preco = preco;
    }
    
    void exibirPreco() {
        System.out.println("Preco: R$" + this.preco);
    }
}
