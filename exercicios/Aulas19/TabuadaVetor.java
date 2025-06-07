import java.util.Scanner;

public class TabuadaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];

        // Preenchendo o vetor A
        System.out.println("Digite 5 números inteiros para gerar a tabuada:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Gerando e imprimindo a tabuada de cada número
        System.out.println("\n📊 Tabuadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n🔹 Tabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", A[i], j, A[i] * j);
            }
        }

        scanner.close();
    }
}
