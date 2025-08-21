package Capitulo_4.Exercicio14;

public class Main {
    public static void main(String[] args ) {
        Empregado empregado = new Empregado("Jérson", 1900, "Finanças");
        Vendedor vendedor = new Vendedor("Geraldo", 2000, "Conduta", 5.5);
        Gerente gerente = new Gerente("Anilson", 2100, "Serviçal", 3500);

        empregado.exibirDados();
        vendedor.exibirDados();
        gerente.exibirDados();
    }
}
