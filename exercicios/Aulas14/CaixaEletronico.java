import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor do saque
        System.out.print("Digite o valor do saque (mínimo R$10 e máximo R$600): ");
        int valorSaque = scanner.nextInt();

        // Verifica se o valor está dentro do intervalo permitido
        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor inválido! O saque deve estar entre R$10 e R$600.");
        } else {
            // Calcula a quantidade de notas
            int notas100 = valorSaque / 100;
            valorSaque %= 100;

            int notas50 = valorSaque / 50;
            valorSaque %= 50;

            int notas10 = valorSaque / 10;
            valorSaque %= 10;

            int notas5 = valorSaque / 5;
            valorSaque %= 5;

            int notas1 = valorSaque; // O restante será em notas de 1

            // Exibe o resultado
            System.out.println("\n📌 Quantidade de notas fornecidas:");
            if (notas100 > 0) System.out.println(notas100 + (notas100 == 1 ? " nota" : " notas") + " de 100 reais");
            if (notas50 > 0) System.out.println(notas50 + (notas50 == 1 ? " nota" : " notas") + " de 50 reais");
            if (notas10 > 0) System.out.println(notas10 + (notas10 == 1 ? " nota" : " notas") + " de 10 reais");
            if (notas5 > 0) System.out.println(notas5 + (notas5 == 1 ? " nota" : " notas") + " de 5 reais");
            if (notas1 > 0) System.out.println(notas1 + (notas1 == 1 ? " nota" : " notas") + " de 1 real");
        }

        scanner.close();
    }
}
