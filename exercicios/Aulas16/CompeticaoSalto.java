import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompeticaoSalto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicita o nome do atleta
            System.out.print("\nDigite o nome do atleta (ou pressione Enter para sair): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isEmpty()) {
                break; // Encerra quando não há nome informado
            }

            ArrayList<Double> saltos = new ArrayList<>();

            // Solicita as cinco distâncias dos saltos
            for (int i = 1; i <= 5; i++) {
                System.out.print("Distância do salto " + i + " (em metros): ");
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }
            scanner.nextLine(); // Limpa o buffer após a entrada numérica

            // Determina o melhor e pior salto
            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            // Remove o melhor e pior salto da lista
            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);

            // Calcula a média dos três saltos restantes
            double soma = 0;
            for (double salto : saltos) {
                soma += salto;
            }
            double media = soma / saltos.size();

            // Exibe o resultado
            System.out.println("\n✅ Resultado da competição:");
            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.printf("Média dos demais saltos: %.1f m%n", media);
            System.out.printf("\nResultado final:\n%s: %.1f m%n", nomeAtleta, media);
        }

        scanner.close();
    }
}

