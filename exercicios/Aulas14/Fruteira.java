import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos produtos
        final double PRECO_MORANGO_ATE_5KG = 2.50;
        final double PRECO_MORANGO_ACIMA_5KG = 2.20;
        final double PRECO_MACA_ATE_5KG = 1.80;
        final double PRECO_MACA_ACIMA_5KG = 1.50;

        // Solicita ao usuário a quantidade de morangos e maçãs compradas
        System.out.print("Digite a quantidade de morangos (Kg): ");
        double kgMorango = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs (Kg): ");
        double kgMaca = scanner.nextDouble();

        // Determina o preço baseado na quantidade comprada
        double precoMorango = (kgMorango > 5) ? PRECO_MORANGO_ACIMA_5KG : PRECO_MORANGO_ATE_5KG;
        double precoMaca = (kgMaca > 5) ? PRECO_MACA_ACIMA_5KG : PRECO_MACA_ATE_5KG;

        // Calcula o valor total da compra
        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;

        // Verifica se há desconto adicional
        boolean aplicaDesconto = kgMorango + kgMaca > 8 || totalCompra > 25;
        if (aplicaDesconto) {
            totalCompra *= 0.90; // Aplica 10% de desconto
        }

        // Exibe os resultados
        System.out.println("\n📌 Resumo da Compra:");
        System.out.printf("➡ Morango: %.2f Kg | Preço: R$ %.2f%n", kgMorango, totalMorango);
        System.out.printf("➡ Maçã: %.2f Kg | Preço: R$ %.2f%n", kgMaca, totalMaca);
        if (aplicaDesconto) {
            System.out.println("➡ Desconto aplicado: 10%");
        }
        System.out.printf("➡ Valor final a pagar: R$ %.2f%n", totalCompra);

        scanner.close();
    }
}
