import java.util.Scanner;

public class EscolhaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os preços dos três produtos
        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();

        // Identifica o produto mais barato
        double menorPreco = preco1;
        int produtoEscolhido = 1;

        if (preco2 < menorPreco) {
            menorPreco = preco2;
            produtoEscolhido = 2;
        }
        if (preco3 < menorPreco) {
            menorPreco = preco3;
            produtoEscolhido = 3;
        }

        // Exibe o resultado
        System.out.println("Você deve comprar o produto " + produtoEscolhido + ", que custa R$" + menorPreco);

        scanner.close();
    }
}
