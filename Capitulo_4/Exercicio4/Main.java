package Capitulo_4.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Iracema", "José de Alencar");
        Ebook ebook = new Ebook("O Guarani", "José de Alencar", 73);

        livro.mostrarDados();
        ebook.mostrarDados();
    }
}
