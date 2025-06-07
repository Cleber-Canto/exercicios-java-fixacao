import java.util.Scanner;

public class FatorialFormatado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Validação para garantir que seja um número positivo
        while (numero < 0) {
            System.out.print("❌ Entrada inválida! Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
        }

        long fatorial = 1;
        System.out.print("\n✅ Fatorial de: " + numero);
        System.out.print("\n✅ " + numero + "! = ");

        // Cálculo do fatorial e exibição da sequência
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i + (i > 1 ? " . " : " = "));
        }

        System.out.println(fatorial);
        scanner.close();
    }
}
