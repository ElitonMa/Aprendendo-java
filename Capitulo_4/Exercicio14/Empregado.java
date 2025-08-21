package Capitulo_4.Exercicio14;

public class Empregado {
    protected String nome;
    protected double salarioBase;
    protected String departamento;

    public Empregado(String nome, double salarioBase, String departamento) {
        this.departamento = departamento;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        System.out.println("O empregado " + nome + " tem salário de R$" + salarioBase + " e está no departamento '" + departamento + "'");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
