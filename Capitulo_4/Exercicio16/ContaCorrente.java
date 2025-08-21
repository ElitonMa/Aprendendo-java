package Capitulo_4.Exercicio16;

public class ContaCorrente extends Conta {
    private float limiteChequeEspecial;

    public ContaCorrente(String titular, double saldoInicial, float limiteChequeEspecial) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public ContaCorrente(String titular, float limiteChequeEspecial) {
        super(titular, 0);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void exibirDados() {
        System.out.println("Essa conta corrente pertence a '" + getTitular() + "' tendo saldo inicial de " + getSaldoInicial() + " e limite de cheque especial de " + limiteChequeEspecial);
    }

    // Getters
    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    // Setters
    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
