import java.util.Scanner;

public class PapoDePescador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double LIMITE_PESO = 50.0;
        final double VALOR_MULTA_POR_KG = 4.0;

        System.out.print("Digite o peso dos peixes em quilos: ");
        String entrada = scanner.next().replace(',', '.'); // Substitui vírgula por ponto

        double peso = 0;
        try {
            peso = Double.parseDouble(entrada); // Converte corretamente para número
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida! Certifique-se de digitar um número (exemplo: 34.5 ou 34,5).");
            return;
        }

        double excesso = 0;
        double multa = 0;

        if (peso > LIMITE_PESO) {
            excesso = peso - LIMITE_PESO;
            multa = excesso * VALOR_MULTA_POR_KG;
        }

        System.out.printf("Excesso de peso: %.2f kg%n", excesso);
        System.out.printf("Valor da multa: R$ %.2f%n", multa);

        scanner.close();
    }
}
