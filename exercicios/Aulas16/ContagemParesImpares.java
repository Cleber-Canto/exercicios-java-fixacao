import java.util.Scanner;

public class ContagemParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n✅ Quantidade de números pares: " + pares);
        System.out.println("✅ Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
