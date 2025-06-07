import java.util.Scanner;

public class PedidoLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;

        // Cardápio
        System.out.println("\n✅ Cardápio da Lanchonete:");
        System.out.println("100 - Cachorro Quente   | R$ 1,20");
        System.out.println("101 - Bauru Simples     | R$ 1,30");
        System.out.println("102 - Bauru com ovo     | R$ 1,50");
        System.out.println("103 - Hambúrguer        | R$ 1,20");
        System.out.println("104 - Cheeseburguer     | R$ 1,30");
        System.out.println("105 - Refrigerante      | R$ 1,00");

        System.out.println("\nDigite o código do item e a quantidade desejada (0 para finalizar):");

        while (true) {
            System.out.print("Código do item: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break; // Finaliza a compra
            }

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            double preco = 0;

            switch (codigo) {
                case 100: preco = 1.20; break;
                case 101: preco = 1.30; break;
                case 102: preco = 1.50; break;
                case 103: preco = 1.20; break;
                case 104: preco = 1.30; break;
                case 105: preco = 1.00; break;
                default: System.out.println("❌ Código inválido! Escolha um código válido."); continue;
            }

            double valorItem = preco * quantidade;
            totalCompra += valorItem;
            System.out.printf("✅ %d unidades de código %d: R$ %.2f%n", quantidade, codigo, valorItem);
        }

        System.out.printf("\n✅ Total da compra: R$ %.2f%n", totalCompra);
        scanner.close();
    }
}
