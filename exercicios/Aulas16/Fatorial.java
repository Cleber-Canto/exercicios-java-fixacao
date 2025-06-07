import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Inicializa o resultado do fatorial
        long fatorial = 1;

        System.out.print(numero + "! = ");
        
        // Calcula o fatorial e exibe o processo de multiplicação
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i + (i > 1 ? " x " : " = "));
        }

        System.out.println(fatorial);
        scanner.close();
    }
}

