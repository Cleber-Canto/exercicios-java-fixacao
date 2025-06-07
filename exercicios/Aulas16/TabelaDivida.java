import java.util.Scanner;

public class TabelaDivida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor da dívida ao usuário
        System.out.print("Digite o valor inicial da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        // Define as opções de parcelamento e juros
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 0.10, 0.15, 0.20, 0.25};

        // Exibe cabeçalho da tabela
        System.out.println("\n✅ Tabela de Parcelamento");
        System.out.printf("%-15s %-15s %-20s %-15s%n", "Valor da Dívida", "Valor dos Juros", "Quantidade de Parcelas", "Valor da Parcela");
        System.out.println("----------------------------------------------------------------------------");

        // Calcula e exibe os valores na tabela
        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = valorDivida * juros[i];
            double valorTotal = valorDivida + valorJuros;
            double valorParcela = valorTotal / parcelas[i];

            System.out.printf("R$ %-12.2f R$ %-12.2f %-20d R$ %-12.2f%n", valorTotal, valorJuros, parcelas[i], valorParcela);
        }

        scanner.close();
    }
}
