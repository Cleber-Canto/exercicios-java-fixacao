import java.util.Scanner;

public class SerieHarmonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de termos ao usuário
        System.out.print("Digite o número de termos da série harmônica (N): ");
        int N = scanner.nextInt();

        while (N <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            N = scanner.nextInt();
        }

        double H = 0;
        System.out.print("\n✅ Série Harmônica: H = ");

        // Calcula a soma da série
        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;

            System.out.print("1/" + i);
            if (i < N) {
                System.out.print(" + ");
            }
        }

        // Exibe o valor final da série
        System.out.printf("\n✅ Valor de H para N = %d: %.4f%n", N, H);

        scanner.close();
    }
}
