import java.util.Scanner;

public class QuadradoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];

        // Preenchendo o vetor A
        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Criando o vetor B com os quadrados dos elementos de A
        for (int i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Quadrado de A[i]):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
