import java.util.Scanner;

public class IntervaloNumerosComSoma {
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
        int soma = 0;

        System.out.println("\n✅ Números inteiros no intervalo entre " + menor + " e " + maior + ":");
        
        // Imprime os números no intervalo e calcula a soma
        for (int i = menor + 1; i < maior; i++) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\n\n✅ A soma dos números no intervalo é: " + soma);
        scanner.close();
    }
}
