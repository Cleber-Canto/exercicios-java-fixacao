import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Determina os limites do intervalo
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("\n✅ Números inteiros no intervalo entre " + menor + " e " + maior + ":");
        
        // Imprime os números no intervalo
        for (int i = menor + 1; i < maior; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Quebra de linha no final
        scanner.close();
    }
}
