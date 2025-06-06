import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define os preços dos combustíveis
        final double PRECO_ALCOOL = 1.90;
        final double PRECO_GASOLINA = 2.50;

        // Solicita ao usuário o tipo de combustível
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

        // Solicita ao usuário a quantidade de litros
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        double precoLitro = 0, descontoPorLitro = 0;

        // Define os descontos com base no tipo de combustível
        if (tipoCombustivel == 'A') {
            precoLitro = PRECO_ALCOOL;
            descontoPorLitro = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipoCombustivel == 'G') {
            precoLitro = PRECO_GASOLINA;
            descontoPorLitro = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido!");
            scanner.close();
            return;
        }

        // Calcula o valor total e o desconto
        double valorSemDesconto = litros * precoLitro;
        double valorDesconto = litros * precoLitro * descontoPorLitro;
        double valorFinal = valorSemDesconto - valorDesconto;

        // Exibe os resultados
        System.out.println("\n📌 Resumo da Compra:");
        System.out.printf("➡ Tipo de combustível: %s%n", (tipoCombustivel == 'A') ? "Álcool" : "Gasolina");
        System.out.printf("➡ Litros adquiridos: %.2f%n", litros);
        System.out.printf("➡ Preço por litro: R$ %.2f%n", precoLitro);
        System.out.printf("➡ Valor sem desconto: R$ %.2f%n", valorSemDesconto);
        System.out.printf("➡ Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("➡ Valor final a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
