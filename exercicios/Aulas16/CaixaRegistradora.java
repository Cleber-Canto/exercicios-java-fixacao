import java.util.Scanner;

public class CaixaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double totalCompra = 0;
            int quantidadeProdutos = 0;

            System.out.println("\n✅ Lojas Tabajara - Registro de compras");

            // Recebe os preços dos produtos até que o operador informe 0
            while (true) {
                System.out.print("Produto " + (quantidadeProdutos + 1) + ": R$ ");
                double preco = scanner.nextDouble();

                if (preco == 0) {
                    break;
                }

                totalCompra += preco;
                quantidadeProdutos++;
            }

            // Exibe o total de itens e o valor da compra
            System.out.printf("\n✅ Quantidade total de produtos: %d%n", quantidadeProdutos);
            System.out.printf("✅ Total da compra: R$ %.2f%n", totalCompra);

            // Solicita o pagamento
            System.out.print("Digite o valor em dinheiro fornecido pelo cliente: R$ ");
            double dinheiro = scanner.nextDouble();

            while (dinheiro < totalCompra) {
                System.out.print("❌ Valor insuficiente! Digite um valor maior ou igual ao total da compra: R$ ");
                dinheiro = scanner.nextDouble();
            }

            // Calcula e exibe o troco
            double troco = dinheiro - totalCompra;
            System.out.printf("✅ Troco: R$ %.2f%n", troco);

            // Pergunta ao operador se deseja registrar outra compra
            System.out.print("\nDeseja iniciar uma nova compra? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (!resposta.equals("s")) {
                break;
            }
        }

        scanner.close();
    }
}
