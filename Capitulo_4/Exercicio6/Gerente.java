package Capitulo_4.Exercicio6;

public class Gerente extends Funcionario {
    protected String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInfo() {
        System.out.println("O gerente " + nome + " com salário de R$" + salario + " supervisiona o departamento " + departamento);
    }

    // Getters
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    // Setters
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
