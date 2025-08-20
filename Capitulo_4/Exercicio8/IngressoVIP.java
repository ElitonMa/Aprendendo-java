package Capitulo_4.Exercicio8;

public class IngressoVIP extends Ingresso {
    public double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void exibirValor() {
        double valorTotal = valorAdicional + valor;
        System.out.println("Esse ingresso VIP custa R$" + valorTotal);
    }

    // Setters
    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    // Getters
    @Override
    public double getValor() {
        return super.getValor();
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
}
