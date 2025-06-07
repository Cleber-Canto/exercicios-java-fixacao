import java.util.Scanner;

public class TabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número da tabuada
        System.out.print("Digite o número para montar a tabuada: ");
        int numero = scanner.nextInt();

        // Solicita o valor inicial e final
        System.out.print("Digite o valor inicial da tabuada: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final da tabuada: ");
        int fim = scanner.nextInt();

        // Garante que o valor final seja maior ou igual ao inicial
        while (fim < inicio) {
            System.out.print("❌ Valor final inválido! Digite um número maior ou igual ao inicial: ");
            fim = scanner.nextInt();
        }

        // Exibe a tabuada
        System.out.println("\n✅ Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");
        
        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

