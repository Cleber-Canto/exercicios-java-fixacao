import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class DiferencaConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        ArrayList<Integer> C = new ArrayList<>();
        HashSet<Integer> setB = new HashSet<>();

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Preenchendo o vetor B e armazenando elementos em um conjunto (setB)
        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
            setB.add(B[i]);
        }

        // Construindo o vetor C com a diferença dos conjuntos (elementos de A que não estão em B)
        for (int i = 0; i < 10; i++) {
            if (!setB.contains(A[i])) {
                C.add(A[i]);
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

        System.out.println("\n✅ Vetor C (Diferença de A e B - elementos de A que não estão em B):");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
