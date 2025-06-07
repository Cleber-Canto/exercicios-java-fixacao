import java.util.Scanner;

public class ExibirParesAteElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Exibindo os elementos de A e seus pares correspondentes
        System.out.println("\n📊 Relação de pares:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = " + A[i] + " → Pares: ");
            for (int j = 0; j <= A[i]; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
