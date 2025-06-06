import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor da hora de trabalho
        System.out.print("Digite o valor da sua hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();

        // Pergunta quantos dias e quantas horas foram trabalhadas separadamente
        System.out.print("Digite a quantidade de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        // Calcula o total de horas trabalhadas (dias * 8 horas + horas extras)
        int horasTrabalhadas = (diasTrabalhados * 8) + horasExtras;
        double mesesTrabalhados = horasTrabalhadas / (8.0 * 22);

        // Calcula o salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Define percentual do IR
        double percentualIR;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        // Calcula descontos e benefícios
        double valorIR = salarioBruto * (percentualIR / 100);
        double valorINSS = salarioBruto * 0.10;
        double valorSindicato = salarioBruto * 0.03;
        double valorFGTS = salarioBruto * 0.11;
        double totalDescontos = valorIR + valorINSS + valorSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        // Exibe os resultados
        System.out.println("\n📌 Folha de Pagamento");
        System.out.printf("Salário Bruto: (%.2f * %d)      : R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("Total de horas trabalhadas      : %d horas%n", horasTrabalhadas);
        System.out.printf("Total de dias trabalhados       : %d dias%n", diasTrabalhados);
        System.out.printf("Horas extras trabalhadas        : %d horas%n", horasExtras);
        System.out.printf("Horas trabalhadas em meses      : %.2f meses%n", mesesTrabalhados);
        System.out.printf("(-) IR (%.0f%%)                 : R$ %.2f%n", percentualIR, valorIR);
        System.out.printf("(-) INSS (10%%)                 : R$ %.2f%n", valorINSS);
        System.out.printf("(-) Sindicato (3%%)             : R$ %.2f%n", valorSindicato);
        System.out.printf("FGTS (11%%)                     : R$ %.2f%n", valorFGTS);
        System.out.printf("Total de descontos              : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido                 : R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
