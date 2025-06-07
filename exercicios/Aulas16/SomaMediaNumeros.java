import java.util.Scanner;

public class SomaMediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 5; // Número total de entradas

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Número " + i + ": ");
            soma += scanner.nextInt();
        }

        // Cálculo da média
        double media = (double) soma / quantidade;

        System.out.println("\n✅ Soma dos números: " + soma);
        System.out.println("✅ Média dos números: " + media);

        scanner.close();
    }
}
