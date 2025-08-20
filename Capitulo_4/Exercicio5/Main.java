package Capitulo_4.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Chocolinho", "Cachorro");
        Gato gato = new Gato("Bolinha", "Gato", "Branco");

        animal.exibirDados();
        gato.exibirDados();
    }
}
