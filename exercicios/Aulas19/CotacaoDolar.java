import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] A = new double[20];
        double cotacaoDolar;

        // Obtendo a cotação do dólar
        System.out.print("Digite a cotação do dólar (U$1 em R$): ");
        cotacaoDolar = scanner.nextDouble();

        // Preenchendo o vetor A com valores multiplicados pela cotação do dólar
        for (int i = 1; i <= 20; i++) {
            A[i - 1] = cotacaoDolar * i;
        }

        // Exibindo as conversões
        System.out.println("\n📊 Conversão da cotação do dólar:");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("U$%d → R$%.2f\n", i, A[i - 1]);
        }

        scanner.close();
    }
}
