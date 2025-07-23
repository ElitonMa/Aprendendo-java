package Capitulo_3.Exercicio12;

public class Main {
    public static void main(String[] args) {
        ContaLimite conta = new ContaLimite(400);
        
        
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Limite de credito: " + conta.getLimiteCredito());
        
        conta.depositar(150);
        System.out.println("Novo saldo: " + conta.getSaldo());
        
        conta.sacar(150);
        System.out.println("Novo saldo: " + conta.getSaldo());
        // Teste de verificacao sacar
        conta.sacar(401);
        conta.sacar(-30);
        conta.sacar(1); // Saldo = 0
        
        // Teste de verificacao depositar
        conta.depositar(-14);
    }
}
