import java.util.Scanner;

public class VerificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os três lados do triângulo
        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        // Verifica se os lados podem formar um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Determina o tipo de triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um Triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Os lados formam um Triângulo Isósceles.");
            } else {
                System.out.println("Os lados formam um Triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        scanner.close();
    }
}
