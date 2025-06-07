import java.util.Scanner;

public class PotenciaManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a base e o expoente ao usuário
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        // Calcula a potência manualmente usando multiplicações sucessivas
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("\n✅ " + base + " elevado a " + expoente + " é igual a: " + resultado);

        scanner.close();
    }
}
