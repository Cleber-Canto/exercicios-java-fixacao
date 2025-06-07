import java.util.Scanner;

public class AnaliseTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        System.out.println("✅ Insira as temperaturas (digite 0 para finalizar):");

        while (true) {
            System.out.print("Temperatura " + (quantidade + 1) + ": ");
            double temperatura = scanner.nextDouble();

            if (temperatura == 0 && quantidade > 0) {
                break; // Encerra quando já há pelo menos uma temperatura registrada
            } else if (temperatura == 0) {
                System.out.println("❌ Você deve inserir pelo menos uma temperatura!");
                continue;
            }

            soma += temperatura;
            quantidade++;

            if (temperatura < menor) menor = temperatura;
            if (temperatura > maior) maior = temperatura;
        }

        double media = soma / quantidade;

        // Exibe os resultados
        System.out.printf("\n✅ Menor temperatura registrada: %.2f°C%n", menor);
        System.out.printf("✅ Maior temperatura registrada: %.2f°C%n", maior);
        System.out.printf("✅ Média das temperaturas: %.2f°C%n", media);

        scanner.close();
    }
}
