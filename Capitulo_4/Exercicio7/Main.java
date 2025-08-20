package Capitulo_4.Exercicio7;

public class Main {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Razer", 2023);
        Computador computador = new Computador("Nvidia", 2024, "AMD Radeon RX 6400", 16);

        equipamento.exibirDados();
        computador.exibirDados();
    }
}
