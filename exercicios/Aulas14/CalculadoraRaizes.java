import java.util.Scanner;

public class CalculadoraRaizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os coeficientes da equação
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        // Verifica se a equação é do segundo grau
        if (a == 0) {
            System.out.println("O valor de A não pode ser zero. A equação não é do segundo grau.");
            return; // Encerra o programa
        }

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        // Calcula o delta
        double delta = (b * b) - (4 * a * c);

        // Verifica as condições para determinar as raízes
        if (delta < 0) {
            System.out.println("O delta é negativo. A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("O delta é zero. A equação possui apenas uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O delta é positivo. A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}
