import java.text.DecimalFormat;
import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,###");

        // Entrada de valores personalizados
        System.out.print("Digite a população inicial do país A: ");
        int populacaoA = scanner.nextInt();
        
        System.out.print("Digite a taxa de crescimento anual do país A (%): ");
        double taxaA = scanner.nextDouble() / 100;

        System.out.print("Digite a população inicial do país B: ");
        int populacaoB = scanner.nextInt();
        
        System.out.print("Digite a taxa de crescimento anual do país B (%): ");
        double taxaB = scanner.nextDouble() / 100;

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
        scanner.close();
    }
}
