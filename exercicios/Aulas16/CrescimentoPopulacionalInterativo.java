import java.text.DecimalFormat;
import java.util.Scanner;

public class CrescimentoPopulacionalInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,###");

        while (true) {
            // Entrada de valores personalizados usando `long`
            System.out.print("Digite a população inicial do país A: ");
            long populacaoA = validarEntradaLong(scanner);

            System.out.print("Digite a taxa de crescimento anual do país A (%): ");
            double taxaA = validarEntradaDouble(scanner) / 100;

            System.out.print("Digite a população inicial do país B: ");
            long populacaoB = validarEntradaLong(scanner);

            System.out.print("Digite a taxa de crescimento anual do país B (%): ");
            double taxaB = validarEntradaDouble(scanner) / 100;

            int anos = 0;

            // Exibir tabela de crescimento ano a ano
            System.out.println("\nAno\tPopulação A\tPopulação B");
            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaA;
                populacaoB += populacaoB * taxaB;
                anos++;
                System.out.println(anos + "\t" + formato.format(populacaoA) + "\t\t" + formato.format(populacaoB));
            }

            System.out.println("\n✅ Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");

            // Pergunta ao usuário se deseja repetir o cálculo
            System.out.print("\nDeseja realizar outra simulação? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (!resposta.equals("s")) {
                break;
            }
        }

        scanner.close();
    }

    // Método para validar entrada de números long
    private static long validarEntradaLong(Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.print("Entrada inválida! Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextLong();
    }

    // Método para validar entrada de números double
    private static double validarEntradaDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida! Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
