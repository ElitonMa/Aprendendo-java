package Capitulo_1.Classes;

public class DesafioFixacao {
        //
        //     Crie uma classe chamada `Livro` com os seguintes atributos:
        // - `titulo` (String)
        // - `autor` (String)
        // - `numeroPaginas` (int)
        // E um método chamado `exibirDetalhes()` que exibe os dados do livro.
        // No `main`, crie dois objetos da classe `Livro`, preencha os dados e chame `exibirDetalhes()` para cada um.
        //

        public static void main(String[] args) {
            Livro livro1 = new Livro();
            Livro livro2 = new Livro();
        
            livro1.titulo = "A song of ice and fire";
            livro1.autor = "George R. R. Martin";
            livro1.numeroPaginas = 700;

            livro2.titulo = "le petit prince";
            livro2.autor = "Antoine de Saint-Exupéry";
            livro2.numeroPaginas = 96;

            livro1.exibirDetalhes();
            livro2.exibirDetalhes();
        }

}
