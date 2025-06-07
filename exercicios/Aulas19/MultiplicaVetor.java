import java.util.Scanner;

public class MultiplicaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[8];
        int[] B = new int[8];

        // Preenchendo o vetor A
        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Criando o vetor B multiplicando os elementos de A por 2
        for (int i = 0; i < 8; i++) {
            B[i] = A[i] * 2;
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (A[i] * 2):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
