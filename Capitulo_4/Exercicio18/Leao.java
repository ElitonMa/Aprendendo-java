package Capitulo_4.Exercicio18;

public class Leao extends Animal {
    private String territorio;

    public Leao(String nome, String especie, String territorio) {
        super(nome, especie);
        this.territorio = territorio;
    }

    @Override
    public void exibirDados() {
        System.out.println("O leão '" + getNome() + "' da espécie " + getEspecie() + "tem como território " + territorio);
    }

    // Getters
    public String getTerritorio() {
        return territorio;
    }

    // Setters
    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }
}
