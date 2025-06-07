import java.util.Scanner;
import java.util.ArrayList;

public class SepararParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();

        // Preenchendo o vetor A
        System.out.println("Digite 20 números inteiros para o vetor A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Separando pares e ímpares
            if (A[i] % 2 == 0) {
                B.add(A[i]); // Armazena pares em B
            } else {
                C.add(A[i]); // Armazena ímpares em C
            }
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Pares de A):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor C (Ímpares de A):");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

