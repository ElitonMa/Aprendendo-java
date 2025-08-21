package Capitulo_4.Exercicio17;

public class Fornecedor  extends Pessoa {
    private int CNPJ;
    private String produtoFornecido;

    public Fornecedor(String nome, int telefone, int CNPJ, String produtoFornecido) {
        super(nome, telefone);
        this.CNPJ = CNPJ;
        this.produtoFornecido = produtoFornecido;
    }

    @Override
    public void exibirDados() {
        System.out.println("O fornecedor '" + getNome() + "' tem o telefone " + getTelefone() + " com CNPJ " + CNPJ + " e produto fornecido " + produtoFornecido);
    }

    // Getters
    public String getProdutoFornecido() {
        return produtoFornecido;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    // Setters
    public void setProdutoFornecido(String produtoFornecido) {
        this.produtoFornecido = produtoFornecido;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
}
