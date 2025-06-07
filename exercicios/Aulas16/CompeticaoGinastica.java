import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompeticaoGinastica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicita o nome do atleta
            System.out.print("\nDigite o nome do atleta (ou pressione Enter para sair): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isEmpty()) {
                break; // Encerra quando não há nome informado
            }

            ArrayList<Double> notas = new ArrayList<>();

            // Solicita as sete notas dos jurados
            for (int i = 1; i <= 7; i++) {
                System.out.print("Nota " + i + ": ");
                double nota = scanner.nextDouble();
                notas.add(nota);
            }
            scanner.nextLine(); // Limpa o buffer após entrada numérica

            // Determina a melhor e pior nota
            double melhorNota = Collections.max(notas);
            double piorNota = Collections.min(notas);

            // Remove a melhor e pior nota da lista
            notas.remove(melhorNota);
            notas.remove(piorNota);

            // Calcula a média das cinco notas restantes
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.size();

            // Exibe o resultado
            System.out.println("\n✅ Resultado final:");
            System.out.println("Atleta: " + nomeAtleta);
            System.out.println("Melhor nota: " + melhorNota);
            System.out.println("Pior nota: " + piorNota);
            System.out.printf("Média: %.2f%n", media);
        }

        scanner.close();
    }
}

