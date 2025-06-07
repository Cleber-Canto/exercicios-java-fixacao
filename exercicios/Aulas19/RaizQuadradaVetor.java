import java.util.Scanner;

public class RaizQuadradaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[15];
        double[] B = new double[15]; // Vetor B com valores de raiz quadrada

        // Preenchendo o vetor A
        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Criando o vetor B com a raiz quadrada dos elementos de A
        for (int i = 0; i < 15; i++) {
            B[i] = Math.sqrt(A[i]); // Calcula sqrt(A[i])
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Raiz quadrada de A[i]):");
        for (double num : B) {
            System.out.printf("%.2f ", num); // Exibe com duas casas decimais
        }

        scanner.close();
    }
}
