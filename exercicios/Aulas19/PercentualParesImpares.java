import java.util.Scanner;

public class PercentualParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int qtdPares = 0, qtdImpares = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Verifica se é par ou ímpar
            if (A[i] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        // Calculando percentuais
        double percPares = (qtdPares / 10.0) * 100;
        double percImpares = (qtdImpares / 10.0) * 100;

        // Exibindo os resultados
        System.out.printf("\n✅ Percentual de números pares: %.2f%%\n", percPares);
        System.out.printf("✅ Percentual de números ímpares: %.2f%%\n", percImpares);

        scanner.close();
    }
}
