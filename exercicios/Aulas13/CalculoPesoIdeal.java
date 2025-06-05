import java.util.Locale;
import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Define o Locale para aceitar ponto decimal
        double altura = 0;

        while (true) {
            System.out.print("Digite sua altura em metros (exemplo: 1.75): ");
            String entrada = scanner.next(); // Lê a entrada como String
            entrada = entrada.replace(',', '.'); // Substitui vírgula por ponto, caso necessário

            try {
                altura = Double.parseDouble(entrada); // Converte para double
                if (altura <= 0) {
                    System.out.println("Por favor, insira uma altura válida maior que zero.");
                } else {
                    break; // Sai do loop se a entrada for válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número (exemplo: 1.75 ou 1,75).");
            }
        }

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Seu peso ideal é: %.2f kg.%n", pesoIdeal);

        scanner.close();
    }
}