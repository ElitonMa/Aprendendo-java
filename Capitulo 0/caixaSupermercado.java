import java.util.Scanner;

public class caixaSupermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair = 0;
        float precoTotal = 0;

        do {
            float precoProduto = 0;

            System.out.println("Bem-vindo a simulação de um supermercado\ndigite -1 para sair\ndigite -2 para ver o total das compras");
            System.out.println("Digite o preço de um produto: ");
            precoProduto = scanner.nextFloat();

            precoTotal += precoProduto;

            if (precoProduto == -2) {
                System.out.println("Seu preço total é: " + precoTotal);
            }
            else if (precoProduto == -1) {
                System.out.println("Saido com sucesso!");
                sair = -1;
            }

        } while (sair != -1);
        scanner.close();
    }
}
