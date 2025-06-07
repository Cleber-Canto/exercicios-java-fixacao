import java.util.Scanner;

public class VerificaTodosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        boolean todosPares = true; // Flag para verificar se todos são pares

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Verifica se o número é ímpar e interrompe o processo
            if (A[i] % 2 != 0) {
                todosPares = false;
                break; // Interrompe ao encontrar um número ímpar
            }
        }

        // Exibindo o resultado
        if (todosPares) {
            System.out.println("\n✅ Todos os elementos do vetor A são pares.");
        } else {
            System.out.println("\n❌ Nem todos os elementos do vetor A são pares.");
        }

        scanner.close();
    }
}
