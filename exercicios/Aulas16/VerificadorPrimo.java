import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro
        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Determina se o número é primo
        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) { // Verifica até a raiz quadrada do número
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println("✅ O número " + numero + " é primo.");
        } else {
            System.out.println("❌ O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
