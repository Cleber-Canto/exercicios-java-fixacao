import java.util.Scanner;

public class VetorFatorial {
    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[15];
        long[] B = new long[15]; // Vetor B usa tipo 'long' para armazenar grandes valores

        // Preenchendo o vetor A
        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
            B[i] = calcularFatorial(A[i]); // Calcula e armazena o fatorial em B
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Fatorial dos elementos de A):");
        for (long num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
