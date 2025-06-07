import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro positivo ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        while (numero < 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            numero = scanner.nextInt();
        }

        // Converte o número para String e inverte
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        // Exibe o número invertido
        System.out.println("✅ Número invertido: " + numeroInvertido);

        scanner.close();
    }
}
