package Capitulo_3.Exercicio14;

public class Elevador {
    private int capacidadeMaxima;
    private int ocupantes;

    Elevador (int capacidadeMaxima) {
        if (capacidadeMaxima < 0) {
            System.out.println("Capacidade nao pode ser menor que 0.");
            return;
        }
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void entrarPessoa(int quantidade) {
        if (quantidade > this.capacidadeMaxima) {
            System.out.println("Essa quantidade excede a capacidade maxima.");
            return;
        }
        else if (quantidade < 0) {
            System.out.println("Nao e permitido valores negativos.");
            return;
        }
        else {
            this.ocupantes += quantidade;
        }
    }

    public void sairPessoa(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade nao pode ser menor que 0");
            return;
        }
        if (quantidade >= ocupantes) {
            this.ocupantes = 0;
        }
        else {
            this.ocupantes -= quantidade;
        }
    }
}
