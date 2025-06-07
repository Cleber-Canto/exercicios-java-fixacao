import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Inicializa contadores de votos
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;

        // Entrada dos votos
        System.out.println("Escolha um candidato para votar (1, 2 ou 3):");
        for (int i = 1; i <= totalEleitores; i++) {
            int voto;
            do {
                System.out.print("Eleitor " + i + ", seu voto: ");
                voto = scanner.nextInt();
                if (voto < 1 || voto > 3) {
                    System.out.println("❌ Voto inválido! Escolha um candidato válido (1, 2 ou 3).");
                }
            } while (voto < 1 || voto > 3);

            // Registra voto
            if (voto == 1) votosCandidato1++;
            else if (voto == 2) votosCandidato2++;
            else votosCandidato3++;
        }

        // Exibe a contagem final de votos
        System.out.println("\n✅ Resultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        scanner.close();
    }
}
