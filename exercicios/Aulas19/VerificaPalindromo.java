import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        boolean ehPalindromo = true; // Flag para verificar se o vetor é palíndromo

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Verificando se o vetor é um palíndromo
        for (int i = 0; i < 5; i++) { // Comparação até a metade do vetor
            if (A[i] != A[9 - i]) { // Compara elementos simétricos
                ehPalindromo = false;
                break; // Interrompe ao encontrar uma diferença
            }
        }

        // Exibindo o resultado
        if (ehPalindromo) {
            System.out.println("\n✅ O vetor A é um palíndromo.");
        } else {
            System.out.println("\n❌ O vetor A não é um palíndromo.");
        }

        scanner.close();
    }
}
