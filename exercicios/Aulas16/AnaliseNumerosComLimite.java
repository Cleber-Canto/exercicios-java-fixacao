import java.util.Scanner;

public class AnaliseNumerosComLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de números ao usuário
        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quantidade = scanner.nextInt();

        // Inicializa variáveis
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        // Leitura dos números com validação
        System.out.println("Digite os números (somente entre 0 e 1000):");
        for (int i = 0; i < quantidade; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                if (numero < 0 || numero > 1000) {
                    System.out.println("❌ Número inválido! Digite um número entre 0 e 1000.");
                }
            } while (numero < 0 || numero > 1000);

            soma += numero;
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        // Exibir resultados
        System.out.println("\n✅ Menor valor: " + menor);
        System.out.println("✅ Maior valor: " + maior);
        System.out.println("✅ Soma dos valores: " + soma);

        scanner.close();
    }
}

