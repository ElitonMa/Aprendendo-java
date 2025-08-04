package Capitulo_3.Exercicio11;

public class Cofrinho {
    private double total;

    public double getTotal() {
        return total;
    }

    public void adicionarValor(double valor) {
        if (valor < 0 ) {
            System.err.println("Nao e permitido adicionar valores negativos.");
            return;
        }
        this.total += valor;
    }
}
