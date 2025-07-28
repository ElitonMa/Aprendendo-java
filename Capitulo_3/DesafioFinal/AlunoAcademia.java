package Capitulo_3.DesafioFinal;

public class AlunoAcademia {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    AlunoAcademia(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            System.err.println("Valor da altura nao pode ser menor que 0.");
            return;            
        }
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        if (peso < 0) {
            System.err.println("Valor do peso nao pode ser menor que 0.");
            return;
        }
        this.peso = peso;
    }

    public double calcularIMC() {
        double resultado;
        resultado = ( peso / (altura*altura) );
        return resultado;
    }

    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5d) {
            return "Abaixo do peso.";
        }
        else if (imc <= 18.5 && imc <= 24.9) {
            return "Peso normal.";
        }
        else if (imc <= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        }
        else if (imc >= 30) {
            return "Obesidade.";
        }
        else {
            return "Error. Nao identificado";
        }
    }
}
