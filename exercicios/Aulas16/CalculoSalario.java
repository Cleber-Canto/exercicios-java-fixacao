import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário inicial ao usuário
        System.out.print("Digite o salário inicial do funcionário: R$ ");
        double salario = scanner.nextDouble();

        int anoInicial = 1995;
        int anoAtual = java.time.Year.now().getValue();
        double percentualAumento = 1.5 / 100; // Aumento inicial de 1.5%

        // Calcula o salário ao longo dos anos
        for (int ano = anoInicial + 1; ano <= anoAtual; ano++) {
            salario += salario * percentualAumento;
            percentualAumento *= 2; // O percentual dobra a cada ano
        }

        // Exibe o salário atualizado
        System.out.printf("\n✅ O salário do funcionário em %d será: R$ %.2f%n", anoAtual, salario);

        scanner.close();
    }
}
