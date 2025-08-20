package Capitulo_4.Exercicio9;

public class CursoTecnico extends Curso {
    public String areaTecnica;

    public CursoTecnico(String nome, int duracaoMeses, String areaTecnica) {
        super(nome, duracaoMeses);
        this.areaTecnica = areaTecnica;
    }

    @Override
    public void exibirDados() {
        System.out.println("O curso técnico com o nome de " + nome + " tem duração de " + duracaoMeses + " meses" + " especializando na área de " + areaTecnica);
    }

    // Getters
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getDuracaoMeses() {
        return super.getDuracaoMeses();
    }

    public String getAreaTecnica() {
        return areaTecnica;
    }

    // Setters
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setDuracaoMeses(int duracaoMeses) {
        super.setDuracaoMeses(duracaoMeses);
    }

    public void setAreaTecnica(String areaTecnica) {
        this.areaTecnica = areaTecnica;
    }
}
