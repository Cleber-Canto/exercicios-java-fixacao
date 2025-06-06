import java.util.Scanner;

public class CalculadoraReajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário atual
        System.out.print("Digite o salário do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();
        double percentualAumento, valorAumento, novoSalario;

        // Define o percentual de aumento com base no salário
        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        // Calcula o valor do aumento e o novo salário
        valorAumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        // Exibe os resultados
        System.out.println("\n📌 Detalhes do Reajuste:");
        System.out.println("➡ Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("➡ Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("➡ Valor do aumento: R$ " + valorAumento);
        System.out.println("➡ Novo salário após o reajuste: R$ " + novoSalario);

        scanner.close();
    }
}
