import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Domínio de Estrutura do Programa e Impressão de Mensagens (System.out.print) 

        System.out.println("Hello world!");
        System.out.println("Eliton");
        System.out.println("Masurek");
        System.out.println("Eliton\n16");

        // Domínio de Variáveis e Suas Operações (+,-,*,/)
        int numeroI = 10;
        System.out.println("Numero inteiro: " + numeroI);

        float numeroF = 3.14f;
        System.out.println("Numero float: " + numeroF);

        String texto = "Isso é um texto em uma string";
        System.out.println("Exemplo de texto: " + texto);

        int primeiraNota = 7;
        int segundaNota = 9;
        int terceiraNota = 3;

        float mediaNotas = (primeiraNota+segundaNota+terceiraNota)/3f;
        System.out.println("Média das três notas: " + mediaNotas);

        int variavelIncrementada = 1;

        for (int i = 0; i < 3; i++) {
            variavelIncrementada++;
            System.out.println(variavelIncrementada);

        }

        String primeiroTexto = "Oi esse é um texto qualquer";
        String segundoTexto = "Esse também é outro texto qualquer";
        String somaDeStrings = primeiroTexto + segundoTexto;
        System.out.println(somaDeStrings);

        // Domínio de Recebimento de Informações (Scanner)

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um número inteiro");
        int numero = scanner.nextInt();

        System.out.println("O dobro do número digitado é: " + numero*2);

        System.out.println("Digite um valor em reais");
        float dinheiro = scanner.nextFloat();

        dinheiro = dinheiro*110/100;

        System.out.println("O valor aumentado em 10% é: R$" + dinheiro);


        System.out.println("Digite uma distância em milhas para convertar para quilomêtros");
        float milhas = scanner.nextFloat();

        float quilometros = milhas * 1.06934f;

        System.out.println("Este valor em quilomêtros é: " + quilometros);


        System.out.println("Digite a base de um retângulo");

        float base = scanner.nextFloat();

        System.out.println("Digite a altura desse retângulo");
        float altura = scanner.nextFloat();

        float perimetro = 2 * (base + altura);
        System.out.println("O perimetro desse retângulo é: " + perimetro);

        scanner.close();
    }
}