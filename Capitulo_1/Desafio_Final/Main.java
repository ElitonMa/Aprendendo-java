import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean escolheuSair = false;
        double escolhasBanco;
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        do {
            System.out.println("Bem-vindo ao simualdor de conta bancária.");
            try {
                System.out.println("0 = sair, 1 = depositar, 2 = sacar, 3 = exibir saldo"); 
                escolhasBanco = scanner.nextDouble();      
            } catch (Exception e) {
                System.err.println("Valor invalido!");
                break;
            }

            switch (escolhasBanco) {
                case 0d:
                    escolheuSair = true;
                    break;
                case 1d:
                    try {
                        System.out.println("Quantos reais deseja depositar?");
                        escolhasBanco = scanner.nextDouble();
                        } catch (Exception e) {
                        System.err.println("Valor invalido!");
                        break;
                        }
                    finally {
                        conta.depositar(escolhasBanco);
                    }
                break;

                case 2d:
                    try {
                        System.out.println("Quantos reais deseja sacar?");
                        escolhasBanco = scanner.nextDouble();
                    } catch (Exception e) {
                        System.err.println("Valor invalido!");
                        break;
                    }
                    finally {
                        conta.sacar(escolhasBanco);
                    }
                break;
                
                case 3d:
                    conta.exibirSaldo();
                break;

                default:
                    System.err.println("O valor deve ser entre 0 e 3.");
                break;
            }
        } while (!escolheuSair);
        scanner.close();
    }
}
