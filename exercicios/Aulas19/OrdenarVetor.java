import java.util.Arrays;
import java.util.Scanner;

public class OrdenarVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Ordenando o vetor A em ordem crescente
        Arrays.sort(A);

        // Exibindo o vetor ordenado
        System.out.println("\n✅ Vetor A ordenado em ordem crescente:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

