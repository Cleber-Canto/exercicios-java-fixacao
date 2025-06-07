import java.util.Scanner;

public class ComparacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Preenchendo o vetor B
        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
        }

        // Criando o vetor C conforme as regras de comparação
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
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

        System.out.println("\n✅ Vetor C (Comparação entre A[i] e B[i]):");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

