import java.util.Scanner;

public class RestoDivisaoVetor {
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

        // Criando o vetor B com o resto da divisão de A[i] por 2
        for (int i = 0; i < 10; i++) {
            B[i] = A[i] % 2;
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (A[i] % 2):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
