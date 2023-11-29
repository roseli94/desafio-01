import model.Cliente;

public class Projeto {
    
    public static void main(String[] args) {
        System.out.println("Criando um projeto");

        // Aqui começa apresentação de pessoas 
        Cliente pessoa1 = new Cliente (5,"João", "12345678901", "215326835306", "M", "Rua K");
        System.out.println(pessoa1.seApresentar());
       
        Cliente pessoa2 = new Cliente (7,"Maria", "23456789012", "315326835307", "F", "Rua L");
        System.out.println(pessoa2.seApresentar());

        Cliente  pessoa3 = new Cliente (9,"Pedro", "34567890123", "415326835308", "M", "Rua M");
        System.out.println(pessoa3.seApresentar());
    }
}
