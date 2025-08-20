package Capitulo_4.Exercicio11;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente( "Erick Maffisoni", 1014675898);
        ClienteEmpresarial clienteEmpresarial = new ClienteEmpresarial("Eliton Masurek", 148395723, 92054468, "Doçes da Vovó LTDA");

        cliente.exibirDados();
        clienteEmpresarial.exibirDados();
    }
}
