import java.util.Scanner;

public class ContagemIntervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contadores para os intervalos
        int cont0_25 = 0, cont26_50 = 0, cont51_75 = 0, cont76_100 = 0;

        System.out.println("✅ Insira números positivos (Digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Interrompe ao encontrar um número negativo
            }

            // Contabiliza os números nos intervalos
            if (numero >= 0 && numero <= 25) {
                cont0_25++;
            } else if (numero >= 26 && numero <= 50) {
                cont26_50++;
            } else if (numero >= 51 && numero <= 75) {
                cont51_75++;
            } else if (numero >= 76 && numero <= 100) {
                cont76_100++;
            }
        }

        // Exibe os resultados
        System.out.println("\n✅ Quantidade de números em cada intervalo:");
        System.out.println("[0-25]: " + cont0_25);
        System.out.println("[26-50]: " + cont26_50);
        System.out.println("[51-75]: " + cont51_75);
        System.out.println("[76-100]: " + cont76_100);

        scanner.close();
    }
}

