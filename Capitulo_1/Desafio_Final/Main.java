import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean escolheuSair = false;
        int escolhasOpcoes = 0;
        double escolhaValor = 0;
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        do {
            System.out.println("Bem-vindo ao simualdor de conta bancária.");
            try {
                System.out.println("0 = sair, 1 = depositar, 2 = sacar, 3 = exibir saldo"); 
                escolhasOpcoes = scanner.nextInt();      
            } catch (Exception e) {
                System.err.println("Valor invalido!");
                break;
            }

            switch (escolhasOpcoes) {
                case 0:
                    escolheuSair = true;
                    break;
                case 1:
                    try {
                        System.out.println("Quantos reais deseja depositar?");
                        escolhaValor = scanner.nextInt();
                        } catch (Exception e) {
                        System.err.println("Valor invalido!");
                        break;
                        }
                    finally {
                        conta.depositar(escolhaValor);
                    }
                break;

                case 2:
                    try {
                        System.out.println("Quantos reais deseja sacar?");
                        escolhaValor = scanner.nextDouble();
                    } catch (Exception e) {
                        System.err.println("Valor invalido!");
                        break;
                    }
                    finally {
                        conta.sacar(escolhaValor);
                    }
                break;
                
                case 3:
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
