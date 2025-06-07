import java.util.Scanner;

public class IdadesAcimaDe35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int contador = 0;

        // Preenchendo o vetor A com as idades
        System.out.println("Digite 10 idades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade[" + i + "] = ");
            A[i] = scanner.nextInt();

            // Contando idades acima de 35 anos
            if (A[i] > 35) {
                contador++;
            }
        }

        // Exibindo o resultado
        System.out.println("\n✅ Quantidade de pessoas com mais de 35 anos: " + contador);

        scanner.close();
    }
}
