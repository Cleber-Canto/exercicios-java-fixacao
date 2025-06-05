import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double COBERTURA_POR_LITRO = 3.0; // Cada litro cobre 3 m²
        final int CAPACIDADE_LATA = 18; // Cada lata tem 18 litros
        final double PRECO_LATA = 80.0; // Preço por lata

        // Solicita o tamanho da área
        System.out.print("Digite o tamanho da área a ser pintada (m²): ");
        double area = scanner.nextDouble();

        // Calcula a quantidade necessária de tinta e latas
        double litrosNecessarios = area / COBERTURA_POR_LITRO;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / CAPACIDADE_LATA);
        double precoTotal = latasNecessarias * PRECO_LATA;

        // Exibe os resultados
        System.out.printf("\nQuantidade de latas necessárias: %d%n", latasNecessarias);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}
