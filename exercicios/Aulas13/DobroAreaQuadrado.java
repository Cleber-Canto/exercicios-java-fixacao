import java.util.Scanner;

public class DobroAreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double dobroArea = area * 2;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área é: " + dobroArea);

        scanner.close();
    }
}
