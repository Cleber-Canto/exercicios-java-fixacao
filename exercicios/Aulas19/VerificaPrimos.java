import java.util.Scanner;

public class VerificaPrimos {
    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Verificando cada número e imprimindo se é primo ou não
        System.out.println("\n📊 Resultados:");
        for (int i = 0; i < 10; i++) {
            String mensagem = ehPrimo(A[i]) ? "é primo ✅" : "não é primo ❌";
            System.out.printf("A[%d] = %d → %s\n", i, A[i], mensagem);
        }

        scanner.close();
    }
}

