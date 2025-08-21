package Capitulo_4.Exercicio18;

public class Elefante extends Animal {
    private float peso;

    public Elefante(String nome, String especie, float peso) {
        super(nome, especie);
        this.peso = peso;
    }

    @Override
    public void exibirDados() {
    System.out.println("O elefante '" + getNome() + "' da espécie " +getEspecie() + " tem peso");
    }

    // Getters
    public float getPeso() {
        return peso;
    }

    // Setters
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
