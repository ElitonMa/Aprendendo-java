package Capitulo_3.Exercicio16;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("A Tartaruga E A Raposa", "Andre dos Santos");

        livro.isDisponivel();

        // Deve imprimir que esta disponivel
        livro.devolver();

        // Deve imprimir que emprestou com sucesso
        livro.emprestar();

        // Deve imprimir que nao esta dispnivel
        livro.isDisponivel();

        // Deve imprimir que ja foi emprestado
        livro.emprestar();

        livro.exibirInformacoes();
    }
}
