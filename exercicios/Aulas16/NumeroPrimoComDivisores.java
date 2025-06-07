import java.util.Scanner;
import java.util.ArrayList;

public class NumeroPrimoComDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número inteiro
        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Determina se o número é primo e identifica os divisores
        boolean ehPrimo = true;
        ArrayList<Integer> divisores = new ArrayList<>();

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) { // Testa divisibilidade até metade do número
                if (numero % i == 0) {
                    ehPrimo = false;
                    divisores.add(i);
                }
            }
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println("✅ O número " + numero + " é primo.");
        } else {
            System.out.println("❌ O número " + numero + " não é primo.");
            System.out.print("Ele é divisível por: 1, " + numero);
            for (int divisor : divisores) {
                System.out.print(", " + divisor);
            }
            System.out.println(".");
        }

        scanner.close();
    }
}
