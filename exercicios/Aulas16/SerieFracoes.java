import java.util.Scanner;

public class SerieFracoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de termos ao usuário
        System.out.print("Digite o número de termos da série (n): ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            n = scanner.nextInt();
        }

        double soma = 0;
        System.out.print("\n✅ Série gerada: S = ");

        // Calcula e exibe os termos da série
        for (int i = 1; i <= n; i++) {
            double termo = (double) i / (2 * i - 1);
            soma += termo;

            System.out.print(i + "/" + (2 * i - 1));
            if (i < n) {
                System.out.print(" + ");
            }
        }

        // Exibe a soma da série
        System.out.printf("\n✅ Soma da série: %.4f%n", soma);

        scanner.close();
    }
}
