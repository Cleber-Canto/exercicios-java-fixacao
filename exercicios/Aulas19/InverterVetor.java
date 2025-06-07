import java.util.Scanner;

public class InverterVetor {
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

        // Construindo o vetor B invertido
        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i]; // Último de A vira primeiro de B, e assim por diante
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Elementos invertidos de A):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

