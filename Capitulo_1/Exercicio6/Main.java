package Capitulo_1.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2=  new Pessoa();

        pessoa1.nome =  "Eduardo Gomes";
        pessoa1.idade = 32;
        pessoa1.profissao = "Engenheiro Civil";

        pessoa2.nome = "Gloria dos Santos";
        pessoa2.idade = 53;
        pessoa2.profissao = "Consultor mobiliario";

        pessoa1.apresentar();
        pessoa2.apresentar();
    }   
}
