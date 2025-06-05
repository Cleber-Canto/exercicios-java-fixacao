import java.util.Scanner;

public class ConversorFahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println(fahrenheit + "°F equivalem a " + celsius + "°C.");

        scanner.close();
    }
}
