import java.util.Scanner;

public class DivisaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        double[] C = new double[10]; // Vetor C com resultados em ponto flutuante

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Preenchendo o vetor B
        System.out.println("\nDigite 10 números inteiros para o vetor B (não pode conter zeros!):");
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("B[" + i + "] = ");
                B[i] = scanner.nextInt();
                if (B[i] == 0) {
                    System.out.println("❌ Erro: B[i] não pode ser zero. Tente novamente.");
                }
            } while (B[i] == 0);
        }

        // Criando o vetor C com a divisão dos elementos de A por B
        for (int i = 0; i < 10; i++) {
            C[i] = (double) A[i] / B[i]; // Garantindo cálculo em ponto flutuante
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B:");
        for (int num : B) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor C (A[i] / B[i]):");
        for (double num : C) {
            System.out.printf("%.2f ", num); // Exibe o resultado com duas casas decimais
        }

        scanner.close();
    }
}
