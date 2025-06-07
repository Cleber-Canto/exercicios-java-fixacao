import java.util.Random;

public class PercentualZerosUns {
    public static void main(String[] args) {
        Random random = new Random();
        int[] A = new int[10];
        int qtdZeros = 0, qtdUns = 0;

        // Gerando valores aleatórios 0 ou 1 no vetor A
        System.out.println("✅ Vetor gerado:");
        for (int i = 0; i < 10; i++) {
            A[i] = random.nextInt(2); // Gera 0 ou 1
            System.out.print(A[i] + " ");

            // Contando 0's e 1's
            if (A[i] == 0) {
                qtdZeros++;
            } else {
                qtdUns++;
            }
        }

        // Calculando percentuais
        double percZeros = (qtdZeros / 10.0) * 100;
        double percUns = (qtdUns / 10.0) * 100;

        // Exibindo os resultados
        System.out.printf("\n\n📊 Percentual de números 0: %.2f%%\n", percZeros);
        System.out.printf("📊 Percentual de números 1: %.2f%%\n", percUns);
    }
}
