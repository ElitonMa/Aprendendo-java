package Capitulo_4.Exercicio10;

public class ContaPoupanca extends ContaBancaria {

    protected float taxaRendimento;

    public ContaPoupanca(String titular, double saldo, float taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void exibirDados() {
        System.out.println("A conta poupança que pertence a " + titular + " com saldo de R$" + saldo + " e tem taxa de rendimento de " + taxaRendimento + "%");
    }

    // Getters
    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public String getTitular() {
        return super.getTitular();
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    // Setters
    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void setTitular(String titular) {
        super.setTitular(titular);
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
