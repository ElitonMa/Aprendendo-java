package Capitulo_3.Exercicio4;

public class Animal {
    private int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("Idade invalida.");
            return;
        }
        this.idade = idade;
    } 
}
