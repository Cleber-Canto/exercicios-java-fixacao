import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int numero;

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();

            // Atualiza o maior número
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\n✅ O maior número informado foi: " + maior);
        scanner.close();
    }
}
