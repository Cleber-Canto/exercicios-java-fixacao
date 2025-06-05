import java.util.Scanner;

public class CalculoSalarioReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorHora = 0, horasPorDia = 0;
        int diasTrabalhados = 0;

        while (true) {
            System.out.print("Digite quanto você ganha por hora: ");
            if (scanner.hasNextDouble()) {
                valorHora = scanner.nextDouble();
                break;
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite quantas horas trabalha por dia: ");
            if (scanner.hasNextDouble()) {
                horasPorDia = scanner.nextDouble();
                break;
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite quantos dias trabalhou no mês: ");
            if (scanner.hasNextInt()) {
                diasTrabalhados = scanner.nextInt();
                break;
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }

        double horasMensais = horasPorDia * diasTrabalhados;
        double salarioMensal = valorHora * horasMensais;

        System.out.printf("Você trabalhou %.2f horas no mês.%n", horasMensais);
        System.out.printf("Seu salário no mês é: R$ %.2f%n", salarioMensal);

        scanner.close();
    }
}
