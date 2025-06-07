import java.util.Scanner;

public class SomaElementosVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
            soma += A[i]; // Acumula a soma dos elementos
        }

        // Exibindo a soma total dos elementos
        System.out.println("\n✅ A soma de todos os elementos do vetor A é: " + soma);

        scanner.close();
    }
}
