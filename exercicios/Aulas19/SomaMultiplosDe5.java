import java.util.Scanner;

public class SomaMultiplosDe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Somando os elementos múltiplos de 5
        for (int num : A) {
            if (num % 5 == 0) {
                soma += num;
            }
        }

        // Exibindo o resultado
        System.out.println("\n✅ A soma dos elementos múltiplos de 5 no vetor A é: " + soma);

        scanner.close();
    }
}

