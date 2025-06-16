import java.util.Random;

public class MatrizLinhaColunaExtremos {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        // Preencher e imprimir a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(10); // valores entre 0 e 9
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Linha 5 (índice 4)
        int maiorLinha5 = matriz[4][0];
        int menorLinha5 = matriz[4][0];
        for (int j = 1; j < 10; j++) {
            if (matriz[4][j] > maiorLinha5) maiorLinha5 = matriz[4][j];
            if (matriz[4][j] < menorLinha5) menorLinha5 = matriz[4][j];
        }

        // Coluna 7 (índice 6)
        int maiorColuna7 = matriz[0][6];
        int menorColuna7 = matriz[0][6];
        for (int i = 1; i < 10; i++) {
            if (matriz[i][6] > maiorColuna7) maiorColuna7 = matriz[i][6];
            if (matriz[i][6] < menorColuna7) menorColuna7 = matriz[i][6];
        }

        System.out.println("\nLinha 5 (índice 4):");
        System.out.println("Maior valor: " + maiorLinha5);
        System.out.println("Menor valor: " + menorLinha5);

        System.out.println("\nColuna 7 (índice 6):");
        System.out.println("Maior valor: " + maiorColuna7);
        System.out.println("Menor valor: " + menorColuna7);
    }
}
