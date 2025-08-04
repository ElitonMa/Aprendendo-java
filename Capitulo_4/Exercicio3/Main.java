package Capitulo_4.Exercicio3;

public class Main {
    public static void main (String[] args) {
        Produto produto = new Produto("Vinho branco", 23.42);

        ProdutoImportado importado = new ProdutoImportado(10,"Pamonha",100);
        importado.valorTotal();

        // Teste de erros
        importado.setTaxaImportacao(-0);
        importado.setTaxaImportacao(110);
    }
}
