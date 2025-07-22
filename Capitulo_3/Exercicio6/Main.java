package Capitulo_3.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
    
        livro.setPaginas(14);
        livro.setPaginas(-3);
        livro.getPaginas();

        livro.setTitulo("A noz na arvore");
        livro.getTitulo();
    }
}
