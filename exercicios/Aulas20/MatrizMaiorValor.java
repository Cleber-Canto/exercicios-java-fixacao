import java.util.Random;

public class MatrizMaiorValor {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        int maior = Integer.MIN_VALUE;
        int linhaMaior = -1;
        int colunaMaior = -1;

        System.out.println("Matriz gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10); // Gera número entre 0 e 9
                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
            System.out.println();
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Posição: Linha " + linhaMaior + " | Coluna " + colunaMaior);
    }
}
