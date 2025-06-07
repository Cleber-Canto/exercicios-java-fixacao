import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int contadorPares = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Contando os números pares no vetor A
        for (int num : A) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibindo o resultado
        System.out.println("\n✅ O vetor A possui " + contadorPares + " números pares.");

        scanner.close();
    }
}
