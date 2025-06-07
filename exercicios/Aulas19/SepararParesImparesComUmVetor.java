import java.util.Scanner;

public class SepararParesImparesComUmVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int indicePar = 0;
        int indiceImpar = 19; // Começa no final do vetor B

        // Preenchendo o vetor A
        System.out.println("Digite 20 números inteiros para o vetor A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Separando pares e ímpares no vetor B
            if (A[i] % 2 == 0) {
                B[indicePar++] = A[i]; // Adiciona os pares no início
            } else {
                B[indiceImpar--] = A[i]; // Adiciona os ímpares no final
            }
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Pares no início, ímpares no final):");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
