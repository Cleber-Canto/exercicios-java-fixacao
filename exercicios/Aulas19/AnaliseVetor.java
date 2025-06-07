import java.util.Scanner;

public class AnaliseVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int somaMenores = 0, quantidadeIguais = 0, somaMaiores = 0, quantidadeMaiores = 0;

        // Preenchendo o vetor A
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Verifica e contabiliza os valores
            if (A[i] < 15) {
                somaMenores += A[i]; // Soma dos menores que 15
            } else if (A[i] == 15) {
                quantidadeIguais++; // Contagem dos iguais a 15
            } else {
                somaMaiores += A[i]; // Soma dos maiores que 15
                quantidadeMaiores++;
            }
        }

        // Calculando a média dos números maiores que 15
        double mediaMaiores = (quantidadeMaiores > 0) ? (double) somaMaiores / quantidadeMaiores : 0;

        // Exibindo os resultados
        System.out.println("\n📊 Resultados:");
        System.out.println("✅ Soma dos elementos menores que 15: " + somaMenores);
        System.out.println("✅ Quantidade de elementos iguais a 15: " + quantidadeIguais);
        System.out.printf("✅ Média dos elementos maiores que 15: %.2f\n", mediaMaiores);

        scanner.close();
    }
}

