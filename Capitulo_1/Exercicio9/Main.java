package Capitulo_1.Exercicio9;

public class Main {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[5];

        // Incializar cada contato
        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Contato();
        }

        contatos[0].nome = "Eliton Masurek";
        contatos[1].nome = "Erick Maffisoni";
        contatos[2].nome = "Kaua Coelho";
        contatos[3].nome = "Polyana Lemes";
        contatos[4].nome = "Matheus Xavier";

        contatos[0].telefone = 48991234567L;
        contatos[1].telefone = 11987654321L;
        contatos[2].telefone = 21911112222L;
        contatos[3].telefone = 51955556666L;
        contatos[4].telefone = 71922223333L;

        contatos[0].email = "Eliton@email.com";     
        contatos[1].email = "Erick@email.com";
        contatos[2].email = "Kaua@email.com";
        contatos[3].email = "Polyana@email.com";
        contatos[4].email = "Matheus@email.com";        

        for (int i = 0; i < contatos.length; i++) {
            if (i == 0) {
                System.out.println("Nome           |Telefone   | Email");
            }
                System.out.format("%-15s %-12d %s.%n",contatos[i].nome, contatos[i].telefone, contatos[i].email);
        }


    }
}
