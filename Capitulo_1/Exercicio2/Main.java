package Capitulo_1.Exercicio2;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.autor = "J.K Rowling";
        livro1.titulo = "Harry Potter";

        livro2.autor = "Arthurt Conan Doyle";
        livro2.titulo = "Sherlock Holmes";

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
