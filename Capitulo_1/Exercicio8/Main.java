package Capitulo_1.Exercicio8;

public class Main {
    public static void main(String[] args) {
        Livro[] livro = new Livro[3];

        // Inicializar cada index
        livro[0] = new Livro();
        livro[1] = new Livro();
        livro[2] = new Livro();
        
        livro[0].autor = "Machado de Assis";
        livro[1].autor = "Jorge Amado";
        livro[2].autor = "Clarisce Lispector";

        livro[0].titulo = "Memorias Postumas de Bras Cuba";
        livro[1].titulo = "Mar Morto";
        livro[2].titulo = "A Descoberta do Mundo";

        for (int i = 0; i < livro.length; i++) {
            livro[i].exibirInformacoes();
        }
    } 
}
