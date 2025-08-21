package Capitulo_4.Exercicio17;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 924322143);
        Cliente cliente = new Cliente("Raimundo",599432995, 505, 900);
        Fornecedor fornecedor = new Fornecedor("Lucas", 550302359, 20187807, "Mesa de sinuca");

        pessoa.exibirDados();
        cliente.exibirDados();
        fornecedor.exibirDados();
    }
}
