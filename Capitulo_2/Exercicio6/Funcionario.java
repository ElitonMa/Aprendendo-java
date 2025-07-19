package Capitulo_2.Exercicio6;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        if (salario < 0) {
          this.salario = 0;
          System.err.println("O salario nao pode ser menor que 0.");  
        }
        this.nome = nome;
    }
}
