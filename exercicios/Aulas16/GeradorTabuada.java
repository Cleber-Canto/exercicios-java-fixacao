import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número para gerar a tabuada
        System.out.print("Digite um número entre 1 e 10 para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Validação da entrada
        while (numero < 1 || numero > 10) {
            System.out.print("Número inválido! Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
        }

        System.out.println("\n✅ Tabuada de " + numero + ":");
        
        // Loop para gerar a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
