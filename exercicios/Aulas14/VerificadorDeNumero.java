import java.util.Scanner;

public class VerificadorDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um valor: ");
        double numero = scanner.nextDouble();

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        scanner.close();
    }
}
