import java.util.Scanner;

public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F.");

        scanner.close();
    }
}
