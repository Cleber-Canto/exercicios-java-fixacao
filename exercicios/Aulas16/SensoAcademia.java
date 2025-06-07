import java.util.Scanner;

public class SensoAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = Double.MIN_VALUE, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int quantidadeClientes = 0;

        System.out.println("\n✅ Insira os dados dos clientes (Digite código 0 para encerrar)");

        while (true) {
            // Solicita o código do cliente
            System.out.print("Código do cliente: ");
            int codigo = scanner.nextInt();
            
            if (codigo == 0 && quantidadeClientes > 0) {
                break; // Encerra quando pelo menos um cliente foi registrado
            } else if (codigo == 0) {
                System.out.println("❌ Você deve inserir pelo menos um cliente!");
                continue;
            }

            // Solicita altura e peso
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            somaAlturas += altura;
            somaPesos += peso;
            quantidadeClientes++;

            // Atualiza o cliente mais alto e mais baixo
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            // Atualiza o cliente mais gordo e mais magro
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }
        }

        // Calcula médias
        double mediaAlturas = somaAlturas / quantidadeClientes;
        double mediaPesos = somaPesos / quantidadeClientes;

        // Exibe os resultados
        System.out.println("\n✅ Cliente mais alto: Código " + codigoMaisAlto + " - Altura: " + alturaMaisAlto + "m");
        System.out.println("✅ Cliente mais baixo: Código " + codigoMaisBaixo + " - Altura: " + alturaMaisBaixo + "m");
        System.out.println("✅ Cliente mais gordo: Código " + codigoMaisGordo + " - Peso: " + pesoMaisGordo + "kg");
        System.out.println("✅ Cliente mais magro: Código " + codigoMaisMagro + " - Peso: " + pesoMaisMagro + "kg");
        System.out.printf("\n✅ Média das alturas: %.2f m%n", mediaAlturas);
        System.out.printf("✅ Média dos pesos: %.2f kg%n", mediaPesos);

        scanner.close();
    }
}
