package Capitulo_3.Exercicio17;

public class Estoque {
    private String nomeProduto;
    private int quantidade;
    private int limiteMinimo;

    Estoque(String nomeProduto, int quantidade, int limiteMinimo) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.limiteMinimo = limiteMinimo;
    }

    public void adicionar(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Valor invalido.");
            return;
        }
        else {
            this.quantidade += quantidade;
        }
    }

    public void remover(int quantidade) {
        if (quantidade < 0 ) {
            System.out.println("Valor invalido.");
            return;
        }
        else if (quantidade > this.quantidade) {
            System.out.println("Esse valor excede a quantidade do produto.");
            return;
        }
        else {
            this.quantidade -= quantidade;
        }
    }
    
    public int getQuantidade() {
        if (this.quantidade < this.limiteMinimo) {
            System.out.println("!! Estoque baixo de " + this.nomeProduto)  ;
        }
        return quantidade;
    }
}
