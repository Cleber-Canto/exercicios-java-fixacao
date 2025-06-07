import java.util.Scanner;

public class InvestimentoColecaoCDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de CDs na coleção
        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();

        // Validação para garantir que seja um número positivo
        while (quantidadeCDs <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            quantidadeCDs = scanner.nextInt();
        }

        double somaValores = 0;

        // Entrada dos valores dos CDs
        System.out.println("Digite o valor de cada CD:");
        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Valor do CD " + i + ": R$ ");
            somaValores += scanner.nextDouble();
        }

        // Cálculo da média
        double mediaGasto = somaValores / quantidadeCDs;

        System.out.println("\n✅ Valor total investido na coleção: R$ " + somaValores);
        System.out.println("✅ Valor médio gasto por CD: R$ " + mediaGasto);

        scanner.close();
    }
}

