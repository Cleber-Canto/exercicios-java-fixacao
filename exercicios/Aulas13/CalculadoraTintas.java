import java.util.Scanner;

public class CalculadoraTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double COBERTURA_POR_LITRO = 6.0; // Cada litro cobre 6 m²
        final double FOLGA = 1.1; // 10% de folga
        final int CAPACIDADE_LATA = 18; // Cada lata tem 18 litros
        final double PRECO_LATA = 80.0; // Preço por lata
        final double CAPACIDADE_GALAO = 3.6; // Cada galão tem 3.6 litros
        final double PRECO_GALAO = 25.0; // Preço por galão

        // Solicita o tamanho da área
        System.out.print("Digite o tamanho da área a ser pintada (m²): ");
        double area = scanner.nextDouble();

        // Calcula a quantidade necessária de tinta com folga
        double litrosNecessarios = (area / COBERTURA_POR_LITRO) * FOLGA;

        // Opção 1: Apenas latas de 18 litros
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / CAPACIDADE_LATA);
        double precoTotalLatas = latasNecessarias * PRECO_LATA;

        // Opção 2: Apenas galões de 3.6 litros
        int galoesNecessarios = (int) Math.ceil(litrosNecessarios / CAPACIDADE_GALAO);
        double precoTotalGaloes = galoesNecessarios * PRECO_GALAO;

        // Opção 3: Mistura de latas e galões para minimizar custo
        int latasMistura = (int) (litrosNecessarios / CAPACIDADE_LATA);
        double restanteTinta = litrosNecessarios % CAPACIDADE_LATA;
        int galoesMistura = (int) Math.ceil(restanteTinta / CAPACIDADE_GALAO);
        double precoTotalMistura = (latasMistura * PRECO_LATA) + (galoesMistura * PRECO_GALAO);

        // Exibe os resultados
        System.out.println("\nOpções de compra:");
        System.out.printf("1) Apenas latas de 18 litros: %d latas - Preço total: R$ %.2f%n", latasNecessarias, precoTotalLatas);
        System.out.printf("2) Apenas galões de 3.6 litros: %d galões - Preço total: R$ %.2f%n", galoesNecessarios, precoTotalGaloes);
        System.out.printf("3) Mistura otimizada: %d latas + %d galões - Preço total: R$ %.2f%n", latasMistura, galoesMistura, precoTotalMistura);

        scanner.close();
    }
}
