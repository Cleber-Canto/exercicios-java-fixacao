import java.util.Scanner;

public class AlunoMaisAltoMaisBaixo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMaisAlto = 0, numeroMaisBaixo = 0;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;

        System.out.println("\n✅ Insira os dados de 10 alunos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nNúmero do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();

            System.out.print("Altura do aluno (cm): ");
            double altura = scanner.nextDouble();

            // Verifica o aluno mais alto e mais baixo
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                numeroMaisAlto = numeroAluno;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                numeroMaisBaixo = numeroAluno;
            }
        }

        // Exibe os resultados
        System.out.println("\n✅ Aluno mais alto: Número " + numeroMaisAlto + " - Altura: " + alturaMaisAlto + " cm");
        System.out.println("✅ Aluno mais baixo: Número " + numeroMaisBaixo + " - Altura: " + alturaMaisBaixo + " cm");

        scanner.close();
    }
}

