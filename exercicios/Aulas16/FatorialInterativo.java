import java.util.Scanner;

public class FatorialInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicita um número ao usuário com restrição de intervalo
            System.out.print("\nDigite um número inteiro positivo (menor que 16) para calcular o fatorial: ");
            int numero = scanner.nextInt();

            while (numero <= 0 || numero >= 16) {
                System.out.print("❌ Entrada inválida! Digite um número entre 1 e 15: ");
                numero = scanner.nextInt();
            }

            // Inicializa o cálculo do fatorial
            long fatorial = 1;
            System.out.print(numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                System.out.print(i + (i > 1 ? " x " : " = "));
            }

            System.out.println(fatorial);

            // Pergunta ao usuário se deseja repetir a operação
            System.out.print("\nDeseja calcular outro fatorial? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (!resposta.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
