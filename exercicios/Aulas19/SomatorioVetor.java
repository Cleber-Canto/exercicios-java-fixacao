import java.util.Scanner;

public class SomatorioVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Construindo o vetor B com somatórios
        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = i; j < 10; j++) {
                soma += A[j];
            }
            B[i] = soma;
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Somatório dos elementos de A a partir de cada índice):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

