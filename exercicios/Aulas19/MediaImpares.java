import java.util.Scanner;

public class MediaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int somaImpares = 0;
        int quantidadeImpares = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Verifica se o número é ímpar
            if (A[i] % 2 != 0) {
                somaImpares += A[i];
                quantidadeImpares++;
            }
        }

        // Calculando a média aritmética dos números ímpares
        double mediaImpares = (quantidadeImpares > 0) ? (double) somaImpares / quantidadeImpares : 0;

        // Exibindo o resultado
        System.out.println("\n✅ A média aritmética dos números ímpares no vetor A é: " + mediaImpares);

        scanner.close();
    }
}

