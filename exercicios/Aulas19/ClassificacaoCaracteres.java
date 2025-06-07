import java.util.Scanner;

public class ClassificacaoCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        char[] B = new char[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Definindo os valores do vetor B conforme as regras
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else {
                B[i] = 'e';
            }
        }

        // Exibindo os vetores
        System.out.println("\n✅ Vetor A:");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\n✅ Vetor B (Classificação de A[i]):");
        for (char ch : B) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}
