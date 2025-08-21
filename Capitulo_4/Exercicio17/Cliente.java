package Capitulo_4.Exercicio17;

public class Cliente extends Pessoa {
    private int codigoCliente;
    private float limiteCredito;

    public Cliente(String nome, int telefone, int codigoCliente, int limiteCredito) {
        super(nome, telefone);
        this.codigoCliente = codigoCliente;
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void exibirDados() {
        System.out.println("O cliente '" + getNome() + "' tem o telefone " + getTelefone() + " o código " + codigoCliente + " e limite de crédito de R$" + limiteCredito);
    }

    // Getters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    // Setters
    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
