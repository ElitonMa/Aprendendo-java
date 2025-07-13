package Capitulo_1.Exercicio3;

public class Retangulo {

    float largura = 0f;
    float altura = 0f;

    void calcularArea() {
        float area = 0f;
        area = largura * altura;
        System.out.println("A area de seu retangulo é: " + area);
    }
    void calcularPerimetro(){
        float perimetro = 0f;
        perimetro = largura + largura + altura + altura;
        System.out.println("O perimetro deste retangulo e: " + perimetro);
    }
}
