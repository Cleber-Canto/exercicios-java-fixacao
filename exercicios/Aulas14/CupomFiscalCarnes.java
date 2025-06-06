import java.util.Scanner;

public class CupomFiscalCarnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços da promoção
        final double PRECO_FILE_ATÉ_5KG = 4.90;
        final double PRECO_FILE_ACIMA_5KG = 5.80;
        final double PRECO_ALCATRA_ATÉ_5KG = 5.90;
        final double PRECO_ALCATRA_ACIMA_5KG = 6.80;
        final double PRECO_PICANHA_ATÉ_5KG = 6.90;
        final double PRECO_PICANHA_ACIMA_5KG = 7.80;

        // Solicita ao usuário o tipo de carne
        System.out.println("Escolha o tipo de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o número da opção desejada: ");
        int tipoCarne = scanner.nextInt();

        // Solicita a quantidade em kg
        System.out.print("Digite a quantidade de carne (Kg): ");
        double quantidade = scanner.nextDouble();

        // Solicita o tipo de pagamento
        System.out.print("A compra será feita com cartão Tabajara? (S/N): ");
        char pagamentoCartao = scanner.next().toUpperCase().charAt(0);

        // Determina o preço por kg baseado na quantidade
        double precoPorKg = 0;
        String nomeCarne = "";
        if (tipoCarne == 1) {
            nomeCarne = "File Duplo";
            precoPorKg = (quantidade > 5) ? PRECO_FILE_ACIMA_5KG : PRECO_FILE_ATÉ_5KG;
        } else if (tipoCarne == 2) {
            nomeCarne = "Alcatra";
            precoPorKg = (quantidade > 5) ? PRECO_ALCATRA_ACIMA_5KG : PRECO_ALCATRA_ATÉ_5KG;
        } else if (tipoCarne == 3) {
            nomeCarne = "Picanha";
            precoPorKg = (quantidade > 5) ? PRECO_PICANHA_ACIMA_5KG : PRECO_PICANHA_ATÉ_5KG;
        } else {
            System.out.println("Tipo de carne inválido!");
            scanner.close();
            return;
        }

        // Calcula valores
        double valorTotal = quantidade * precoPorKg;
        double desconto = (pagamentoCartao == 'S') ? valorTotal * 0.05 : 0;
        double valorFinal = valorTotal - desconto;

        // Exibe o cupom fiscal
        System.out.println("\n📌 CUPOM FISCAL");
        System.out.printf("➡ Tipo de carne: %s%n", nomeCarne);
        System.out.printf("➡ Quantidade: %.2f Kg%n", quantidade);
        System.out.printf("➡ Preço por Kg: R$ %.2f%n", precoPorKg);
        System.out.printf("➡ Valor total: R$ %.2f%n", valorTotal);
        System.out.printf("➡ Tipo de pagamento: %s%n", (pagamentoCartao == 'S') ? "Cartão Tabajara" : "Outro");
        System.out.printf("➡ Desconto aplicado: R$ %.2f%n", desconto);
        System.out.printf("➡ Valor a pagar: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
