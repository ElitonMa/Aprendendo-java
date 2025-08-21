package Capitulo_4.Exercicio18;

public class Macaco extends Animal {
    private String tipoAlimentacao;

    public Macaco(String nome, String especie, String tipoAlimentacao) {
        super(nome, especie);
        this.tipoAlimentacao = tipoAlimentacao;
    }

    @Override
    public void exibirDados() {
        System.out.println("O macaco '" + getNome() +"' da espécie " + getEspecie()+ " tem o tipo de alimentação " + tipoAlimentacao);
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }
}
