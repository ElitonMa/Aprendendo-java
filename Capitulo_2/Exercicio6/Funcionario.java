package Capitulo_2.Exercicio6;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        if (salario < 0) {
          this.salario = 0;
          System.err.println("O salario não pode ser menor que 0.");  
        }
        this.nome = nome;
    }

    // Necessário para remover aviso de variavel não usada.
    @SuppressWarnings("unused") 
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Matheus dos Santos", -222);
        Funcionario funcionario2 = new Funcionario("Henrique Oliveira", 2001);
    }
}
