import java.util.Scanner;

public class BuscaElementoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        boolean encontrado = false;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Solicitando o número a ser pesquisado
        System.out.print("\nDigite o número que deseja buscar no vetor A: ");
        int X = scanner.nextInt();

        // Executando a busca no vetor A
        for (int i = 0; i < 10; i++) {
            if (A[i] == X) {
                encontrado = true;
                System.out.println("\n✅ O número " + X + " está presente no vetor A, na posição " + i + ".");
                break; // Interrompe a busca ao encontrar o número
            }
        }

        // Caso o número não seja encontrado
        if (!encontrado) {
            System.out.println("\n❌ O número " + X + " não foi encontrado no vetor A.");
        }

        scanner.close();
    }
}
