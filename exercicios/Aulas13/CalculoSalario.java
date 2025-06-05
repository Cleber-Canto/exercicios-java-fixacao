import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TAXA_IR = 0.11;   // 11% Imposto de Renda
        final double TAXA_INSS = 0.08; // 8% INSS
        final double TAXA_SINDICATO = 0.05; // 5% Sindicato

        // Solicita os dados ao usuário
        System.out.print("Digite quanto você ganha por hora: R$ ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite quantas horas trabalha por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Digite quantos dias trabalhou no mês: ");
        int diasTrabalhados = scanner.nextInt();

        // Cálculo do salário
        double horasMensais = horasPorDia * diasTrabalhados;
        double salarioBruto = valorHora * horasMensais;
        double descontoIR = salarioBruto * TAXA_IR;
        double descontoINSS = salarioBruto * TAXA_INSS;
        double descontoSindicato = salarioBruto * TAXA_SINDICATO;
        double salarioLiquido = salarioBruto - (descontoIR + descontoINSS + descontoSindicato);

        // Exibe resultados
        System.out.println("\nResumo do Salário:");
        System.out.printf("Salário Bruto     : R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto de Renda (11%%): R$ %.2f%n", descontoIR);
        System.out.printf("INSS (8%%)        : R$ %.2f%n", descontoINSS);
        System.out.printf("Sindicato (5%%)   : R$ %.2f%n", descontoSindicato);
        System.out.printf("Salário Líquido   : R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}
