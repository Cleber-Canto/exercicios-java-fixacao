import java.util.Scanner;

public class ClassificacaoTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de pessoas na turma
        System.out.print("Digite o número de pessoas na turma: ");
        int quantidade = scanner.nextInt();

        // Validação para garantir que seja um número positivo
        while (quantidade <= 0) {
            System.out.print("❌ Entrada inválida! Digite um número positivo: ");
            quantidade = scanner.nextInt();
        }

        int soma = 0;

        // Entrada das idades e cálculo da soma
        System.out.println("Digite as idades:");
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            soma += scanner.nextInt();
        }

        // Cálculo da média
        double media = (double) soma / quantidade;

        // Classificação da turma
        String classificacao;
        if (media >= 0 && media <= 25) {
            classificacao = "Jovem";
        } else if (media <= 60) {
            classificacao = "Adulta";
        } else {
            classificacao = "Idosa";
        }

        System.out.println("\n✅ Média de idade da turma: " + media);
        System.out.println("✅ A turma é classificada como: " + classificacao);

        scanner.close();
    }
}
