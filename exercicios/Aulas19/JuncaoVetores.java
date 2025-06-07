import java.util.Scanner;

public class JuncaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20]; // Vetor C com o dobro do tamanho

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
            C[i] = A[i]; // Coloca os elementos de A nos primeiros 10 índices de C
        }

        // Preenchendo o vetor B
        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
            C[i + 10] = B[i]; // Coloca os elementos de B nos últimos 10 índices de C
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

        System.out.println("\n✅ Vetor C (Junção de A e B):");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

