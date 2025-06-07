import java.util.Scanner;

public class SistemaNotasProva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gabarito fixo da prova
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};
        int maiorAcerto = Integer.MIN_VALUE, menorAcerto = Integer.MAX_VALUE;
        int totalAlunos = 0, somaNotas = 0;

        System.out.println("✅ Sistema de Prova - Responda às 10 questões");

        while (true) {
            int acertos = 0;
            System.out.println("\nAluno " + (totalAlunos + 1) + " - Insira suas respostas:");
            
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                char resposta = scanner.next().toUpperCase().charAt(0);

                if (resposta == gabarito[i]) {
                    acertos++;
                }
            }

            // Atualiza estatísticas
            somaNotas += acertos;
            if (acertos > maiorAcerto) maiorAcerto = acertos;
            if (acertos < menorAcerto) menorAcerto = acertos;

            System.out.println("✅ Total de acertos: " + acertos);
            System.out.print("\nOutro aluno vai utilizar o sistema? (s/n): ");
            String resposta = scanner.next().toLowerCase();

            totalAlunos++;

            if (!resposta.equals("s")) {
                break;
            }
        }

        // Calcula e exibe estatísticas finais
        double mediaNotas = (double) somaNotas / totalAlunos;
        System.out.println("\n✅ Maior acerto: " + maiorAcerto);
        System.out.println("✅ Menor acerto: " + menorAcerto);
        System.out.println("✅ Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.printf("✅ Média das notas da turma: %.2f%n", mediaNotas);

        scanner.close();
    }
}
