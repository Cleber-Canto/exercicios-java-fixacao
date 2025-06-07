import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de notas
        System.out.print("Digite a quantidade de notas que deseja inserir: ");
        int quantidade = scanner.nextInt();

        // Validação para garantir que seja um número positivo
        while (quantidade <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            quantidade = scanner.nextInt();
        }

        double soma = 0;

        // Entrada das notas e cálculo da soma
        System.out.println("Digite as " + quantidade + " notas:");
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        // Cálculo da média
        double media = soma / quantidade;

        System.out.println("\n✅ A média aritmética das notas é: " + media);

        scanner.close();
    }
}
