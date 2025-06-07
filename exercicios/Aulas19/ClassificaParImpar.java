import java.util.Scanner;

public class ClassificaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Definindo os valores de B conforme as regras
            B[i] = (A[i] % 2 == 0) ? 1 : 0;
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (1 para par, 0 para ímpar):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
