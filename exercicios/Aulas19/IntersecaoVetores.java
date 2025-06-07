import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class IntersecaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        ArrayList<Integer> C = new ArrayList<>();
        HashSet<Integer> setA = new HashSet<>();

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
            setA.add(A[i]); // Armazena os elementos de A em um conjunto (set)
        }

        // Preenchendo o vetor B
        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();

            // Adiciona ao vetor C se o elemento também estiver em A (interseção)
            if (setA.contains(B[i]) && !C.contains(B[i])) {
                C.add(B[i]);
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

        System.out.println("\n✅ Vetor C (Interseção de A e B):");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
