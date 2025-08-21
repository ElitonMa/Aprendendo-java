package Capitulo_4.Exercicio14;

public class Vendedor extends Empregado {
    protected double comissaoMensal;

    public Vendedor(String nome, double salarioBase, String departamento, double comissaoMensal) {
        super(nome, salarioBase, departamento);
        this.comissaoMensal = comissaoMensal;
    }

    @Override
    public void exibirDados() {
        System.out.println("O vendedor " + nome + " tem salário de R$" + salarioBase + " trabalha no departamento '" + departamento + "' e tem comissão de " + comissaoMensal + "%");
    }

    // Setters
    public void setComissaoMensal(double comissaoMensal) {
        this.comissaoMensal = comissaoMensal;
    }

    // Getters
    public double getComissaoMensal() {
        return comissaoMensal;
    }
}
