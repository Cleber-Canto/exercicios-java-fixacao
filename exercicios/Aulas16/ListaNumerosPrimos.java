import java.util.Scanner;

public class ListaNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro positivo
        System.out.print("Digite um número inteiro N para encontrar os primos até N: ");
        int n = scanner.nextInt();

        while (n < 1) {
            System.out.print("❌ Entrada inválida! Digite um número maior ou igual a 1: ");
            n = scanner.nextInt();
        }

        System.out.println("\n✅ Números primos até " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) { // Melhorando a eficiência
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Adiciona uma quebra de linha no final
        scanner.close();
    }
}
