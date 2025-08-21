package Capitulo_4.Exercicio13;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Edison", 43);
        Professor professor = new Professor("Fábio", 28, "Física", 24);

        pessoa.exibirDados();
        professor.exibirDados();
    }
}
