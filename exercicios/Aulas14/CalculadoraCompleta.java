import java.util.Scanner;

public class CalculadoraCompleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Exibe as opções de operação
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int opcao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        // Executa a operação escolhida
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Opção inválida! Escolha entre 1 e 4.");
                operacaoValida = false;
        }

        // Se a operação foi válida, verifica as características do resultado
        if (operacaoValida) {
            String paridade = (resultado % 2 == 0) ? "par" : "ímpar";
            String positivoNegativo = (resultado >= 0) ? "positivo" : "negativo";
            String tipoNumero = (resultado == Math.floor(resultado)) ? "inteiro" : "decimal";

            // Exibe o resultado e suas características
            System.out.printf("\n📌 Resultado da Operação: %.2f%n", resultado);
            System.out.println("➡ O número é " + paridade + ".");
            System.out.println("➡ O número é " + positivoNegativo + ".");
            System.out.println("➡ O número é " + tipoNumero + ".");
        }

        scanner.close();
    }
}
