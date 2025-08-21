package Capitulo_4.Exercicio16;

public class ContaPoupanca extends Conta {
    private float taxaRendimentoMensal;

    public ContaPoupanca(String titular, double saldoInicial, float taxaRendimentoMensal) {
        super(titular, saldoInicial);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    public ContaPoupanca(String titular, float taxaRendimentoMensal) {
        super(titular, 0);
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }

    @Override
    public void exibirDados() {
        System.out.println("Essa conta poupança pertence a '" + getTitular() + "' tendo saldo inicial de " + getSaldoInicial() + " e taxa de rendimento mensal de " + taxaRendimentoMensal + "%");
    }

    // Getters
    public float getTaxaRendimentoMensal() {
        return taxaRendimentoMensal;
    }

    // Setters
    public void setTaxaRendimentoMensal(float taxaRendimentoMensal) {
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }
}
