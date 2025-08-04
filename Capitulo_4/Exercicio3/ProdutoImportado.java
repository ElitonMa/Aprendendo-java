package Capitulo_4.Exercicio3;

public class ProdutoImportado extends Produto {
    // Utilizar valores entre 0 e 100
    protected double taxaImportacao;

    public ProdutoImportado(double taxaImportacao, String nome, double preco) {
        super(nome,preco);
        if (taxaImportacao < 0 || taxaImportacao > 100) {
            System.out.println("Valor inválido para taxa. Resetando para 0.");
            this.taxaImportacao = 0;
            return;
        }
        this.taxaImportacao = taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        if (taxaImportacao < 0 || taxaImportacao > 100) {
            System.out.println("Valor inválido para taxa. Resetando para 0.");
            this.taxaImportacao = 0;
            return;
        }
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void valorTotal() {
        double precoTotal = preco + (preco * (taxaImportacao/100) );
        System.out.println("O valor total do produto após taxas é: " + precoTotal);
    }
}
