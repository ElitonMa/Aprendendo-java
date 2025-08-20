package Capitulo_4.Exercicio7;

public class Computador extends Equipamento {
    protected String processador;
    protected int memoriaRAM;

    public Computador(String fabricante, int anoFabricacao, String processador, int memoriaRAM) {
        super(fabricante, anoFabricacao);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void exibirDados() {
        System.out.println("O computador do fabricante " + fabricante + " fabricado no ano de " + anoFabricacao + " tem como processador " + processador + " e " + memoriaRAM + "GB de memória RAM");
    }

    // Getters
    @Override
    public String getFabricante() {
        return super.getFabricante();
    }

    @Override
    public int getAnoFabricacao() {
        return super.getAnoFabricacao();
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    // Setters
    @Override
    public void setAnoFabricacao(int anoFabricacao) {
        super.setAnoFabricacao(anoFabricacao);
    }

    @Override
    public void setFabricante(String fabricante) {
        super.setFabricante(fabricante);
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
