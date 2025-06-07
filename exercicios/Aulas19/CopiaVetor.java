import java.util.Scanner;

public class CopiaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];

        // Preenchendo o vetor A
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Copiando os elementos de A para B
        for (int i = 0; i < 5; i++) {
            B[i] = A[i];
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (cópia de A):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
