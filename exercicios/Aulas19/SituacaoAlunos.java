import java.util.Scanner;

public class SituacaoAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] Nota1 = new double[10];
        double[] Nota2 = new double[10];
        double[] Result = new double[10];

        // Preenchendo os vetores Nota1 e Nota2
        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Aluno " + (i + 1) + " - Nota 1: ");
            Nota1[i] = scanner.nextDouble();
            System.out.print("Aluno " + (i + 1) + " - Nota 2: ");
            Nota2[i] = scanner.nextDouble();

            // Calculando a média aritmética
            Result[i] = (Nota1[i] + Nota2[i]) / 2;
        }

        // Exibindo os resultados
        System.out.println("\n📊 Resultados:");
        for (int i = 0; i < 10; i++) {
            String situacao = (Result[i] >= 7) ? "Aprovado" : "Reprovado";
            System.out.printf("Aluno %d - Média: %.2f - Situação: %s\n", (i + 1), Result[i], situacao);
        }

        scanner.close();
    }
}
