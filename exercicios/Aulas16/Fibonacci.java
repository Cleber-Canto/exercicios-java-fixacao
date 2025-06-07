import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de termos desejados
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Validação para evitar entradas inválidas
        while (n <= 0) {
            System.out.print("Número inválido! Digite um valor maior que zero: ");
            n = scanner.nextInt();
        }

        System.out.println("\n✅ Sequência de Fibonacci até " + n + " termos:");
        int primeiro = 1, segundo = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); // Quebra de linha no final
        scanner.close();
    }
}
