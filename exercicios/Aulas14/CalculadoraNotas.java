import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário as três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2 + nota3) / 3;
        String resultado;

        // Determina o status do aluno
        if (media == 10) {
            resultado = "Aprovado com Distinção!";
        } else if (media >= 7) {
            resultado = "Aprovado!";
        } else {
            resultado = "Reprovado!";
        }

        // Exibe os resultados
        System.out.println("\n📌 Resultado do Aluno:");
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Nota 3: %.2f%n", nota3);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + resultado);

        scanner.close();
    }
}
