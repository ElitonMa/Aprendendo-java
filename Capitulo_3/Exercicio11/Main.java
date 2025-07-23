
public class Main {
    public static void main(String[] args) {
        Cofrinho cofre = new Cofrinho();
        
        // Teste de validação
        cofre.adicionarValor(-14);
        
        cofre.adicionarValor(500);
        System.out.println("Saldo = " + cofre.getTotal() );
    }
}