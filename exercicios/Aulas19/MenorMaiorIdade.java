import java.util.Scanner;

public class MenorMaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int menorIdade, maiorIdade;
        int posicaoMenor = 0, posicaoMaior = 0;

        // Preenchendo o vetor A com as idades
        System.out.println("Digite 10 idades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        // Inicializando menor e maior idade com o primeiro elemento
        menorIdade = A[0];
        maiorIdade = A[0];

        // Percorrendo o vetor para encontrar menor e maior idade
        for (int i = 1; i < 10; i++) {
            if (A[i] < menorIdade) {
                menorIdade = A[i];
                posicaoMenor = i;
            }
            if (A[i] > maiorIdade) {
                maiorIdade = A[i];
                posicaoMaior = i;
            }
        }

        // Exibindo os resultados
        System.out.println("\n📊 Resultados:");
        System.out.println("✅ Menor idade: " + menorIdade + " (Posição: " + posicaoMenor + ")");
        System.out.println("✅ Maior idade: " + maiorIdade + " (Posição: " + posicaoMaior + ")");

        scanner.close();
    }
}
