import java.util.Scanner;

public class TabelaPrecosPaes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço do pão ao usuário
        System.out.print("Digite o preço do pão: R$ ");
        double precoPao = scanner.nextDouble();

        // Validação para garantir que seja um número positivo
        while (precoPao <= 0) {
            System.out.print("❌ Entrada inválida! Digite um preço positivo: R$ ");
            precoPao = scanner.nextDouble();
        }

        System.out.println("\n✅ Panificadora Pão de Ontem - Tabela de preços");

        // Gera e exibe a tabela de preços
        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double total = quantidade * precoPao;
            System.out.printf("%d - R$ %.2f%n", quantidade, total);
        }

        scanner.close();
    }
}
