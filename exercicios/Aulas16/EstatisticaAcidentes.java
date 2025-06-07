import java.util.Scanner;

public class EstatisticaAcidentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaiorIndice = 0, codigoMenorIndice = 0;
        int maiorIndice = Integer.MIN_VALUE, menorIndice = Integer.MAX_VALUE;
        int somaVeiculos = 0, somaAcidentesMenos2000 = 0, contadorMenos2000 = 0;

        System.out.println("\n✅ Insira os dados de 5 cidades:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nCódigo da cidade " + i + ": ");
            int codigoCidade = scanner.nextInt();

            System.out.print("Número de veículos de passeio (em 1999): ");
            int numeroVeiculos = scanner.nextInt();

            System.out.print("Número de acidentes com vítimas (em 1999): ");
            int numeroAcidentes = scanner.nextInt();

            // Atualiza maior e menor índice de acidentes
            if (numeroAcidentes > maiorIndice) {
                maiorIndice = numeroAcidentes;
                codigoMaiorIndice = codigoCidade;
            }
            if (numeroAcidentes < menorIndice) {
                menorIndice = numeroAcidentes;
                codigoMenorIndice = codigoCidade;
            }

            // Soma total de veículos
            somaVeiculos += numeroVeiculos;

            // Soma acidentes nas cidades com menos de 2.000 veículos
            if (numeroVeiculos < 2000) {
                somaAcidentesMenos2000 += numeroAcidentes;
                contadorMenos2000++;
            }
        }

        // Calcula médias
        double mediaVeiculos = somaVeiculos / 5.0;
        double mediaAcidentesMenos2000 = (contadorMenos2000 > 0) ? (double) somaAcidentesMenos2000 / contadorMenos2000 : 0;

        // Exibe os resultados
        System.out.println("\n✅ Cidade com maior índice de acidentes: Código " + codigoMaiorIndice + " - " + maiorIndice + " acidentes");
        System.out.println("✅ Cidade com menor índice de acidentes: Código " + codigoMenorIndice + " - " + menorIndice + " acidentes");
        System.out.printf("\n✅ Média de veículos nas cinco cidades: %.2f%n", mediaVeiculos);
        System.out.printf("✅ Média de acidentes nas cidades com menos de 2.000 veículos: %.2f%n", mediaAcidentesMenos2000);

        scanner.close();
    }
}
