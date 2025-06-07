public class PotenciaDeDois {
    public static void main(String[] args) {
        int[] A = new int[11];

        // Preenchendo o vetor A com potências de 2
        for (int i = 0; i <= 10; i++) {
            A[i] = (int) Math.pow(2, i);
        }

        // Exibindo os valores do vetor A
        System.out.println("✅ Vetor A (Potências de 2):");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("A[%d] = %d\n", i, A[i]);
        }
    }
}
