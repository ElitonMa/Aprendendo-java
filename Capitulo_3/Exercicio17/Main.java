package Capitulo_3.Exercicio17;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Ketchup", 300, 200);

        // Verificação adicionar
        estoque.adicionar(-14);
        estoque.adicionar(50);
        System.out.println("Quantidade atual: " + estoque.getQuantidade());

        // Verificação remover
        estoque.remover(-500);
        estoque.remover(351); 
        estoque.remover(151);

        // Deve imprimir que o estoque está baixo
        System.out.println("Quantidade atual: " + estoque.getQuantidade()); 
    }
}
