import java.util.Scanner;

public class DivisoresVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Exibindo cada elemento do vetor A e seus divisores
        System.out.println("\n📊 Relação de divisores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = " + A[i] + " → Divisores: ");
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

