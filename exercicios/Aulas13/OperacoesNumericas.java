import java.util.Scanner;

public class OperacoesNumericas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite um número real: ");
        double numReal = scanner.nextDouble();

        // a. O produto do dobro do primeiro com metade do segundo
        double resultadoA = (2 * num1) * (num2 / 2.0);

        // b. A soma do triplo do primeiro com o terceiro
        double resultadoB = (3 * num1) + numReal;

        // c. O terceiro elevado ao cubo
        double resultadoC = Math.pow(numReal, 3);

        System.out.println("Resultado A (dobro do primeiro * metade do segundo): " + resultadoA);
        System.out.println("Resultado B (triplo do primeiro + terceiro número): " + resultadoB);
        System.out.println("Resultado C (terceiro número elevado ao cubo): " + resultadoC);

        scanner.close();
    }
}
