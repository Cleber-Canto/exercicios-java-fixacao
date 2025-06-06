import java.util.Scanner;

public class VerificadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é inteiro ou decimal
        if (numero == Math.floor(numero)) {
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }

        scanner.close();
    }
}
