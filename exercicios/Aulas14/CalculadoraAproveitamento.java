import java.util.Scanner;

public class CalculadoraAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário as duas notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;
        String conceito, resultado;

        // Define o conceito e a situação do aluno
        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            resultado = "APROVADO";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            resultado = "APROVADO";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            resultado = "APROVADO";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            resultado = "REPROVADO";
        } else {
            conceito = "E";
            resultado = "REPROVADO";
        }

        // Exibe os resultados
        System.out.println("\n📌 Resultado do Aluno:");
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + resultado);

        scanner.close();
    }
}
