import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] A = new double[20];
        double cotacaoDolar;

        // Obtendo a cotação do dólar
        System.out.print("Digite a cotação do dólar (U$1 em R$): ");
        cotacaoDolar = scanner.nextDouble();

        // Preenchendo o vetor A com valores em dólar
        System.out.println("Digite 20 valores em dólar para conversão:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Valor em dólar[" + i + "] = U$ ");
            A[i] = scanner.nextDouble();
        }

        // Exibindo as conversões
        System.out.println("\n📊 Conversões para real:");
        for (int i = 0; i < 20; i++) {
            double valorEmReal = A[i] * cotacaoDolar;
            System.out.printf("U$%.2f → R$%.2f\n", A[i], valorEmReal);
        }

        scanner.close();
    }
}
