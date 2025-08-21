package Capitulo_4.Exercicio14;

public class Gerente extends Empregado {
    protected double bonusAnual;

    public Gerente(String nome, double salarioBase, String departamento, double bonusAnual) {
        super(nome, salarioBase, departamento);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void exibirDados() {
        System.out.println("O gerente " + nome + " tem salário de R$" + salarioBase + " trabalha no departamento '" + departamento + "' e ganha um bonus anual de R$" + bonusAnual);
    }

    // Getters
    public double getBonusAnual() {
        return bonusAnual;
    }

    // Setters
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}
