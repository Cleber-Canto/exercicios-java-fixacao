import java.util.Scanner;

public class MediaAlunosPorTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de turmas
        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        // Validação para garantir que seja um número positivo
        while (quantidadeTurmas <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            quantidadeTurmas = scanner.nextInt();
        }

        int somaAlunos = 0;

        // Entrada do número de alunos por turma com validação
        for (int i = 1; i <= quantidadeTurmas; i++) {
            int alunos;
            do {
                System.out.print("Digite a quantidade de alunos da turma " + i + " (máximo 40): ");
                alunos = scanner.nextInt();
                if (alunos < 1 || alunos > 40) {
                    System.out.println("❌ Entrada inválida! Digite um número entre 1 e 40.");
                }
            } while (alunos < 1 || alunos > 40);

            somaAlunos += alunos;
        }

        // Cálculo da média
        double media = (double) somaAlunos / quantidadeTurmas;

        System.out.println("\n✅ O número médio de alunos por turma é: " + media);

        scanner.close();
    }
}
