import java.util.Scanner;

public class EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa contadores de votos
        int votosJose = 0, votosJoao = 0, votosMaria = 0, votosAna = 0;
        int votosNulos = 0, votosBrancos = 0;
        int totalVotos = 0;

        System.out.println("\n✅ Eleição Presidencial - Vote pelo código abaixo:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("\nDigite 0 para finalizar a votação.");

        while (true) {
            System.out.print("Informe o código do voto: ");
            int voto = scanner.nextInt();

            if (voto == 0) {
                break; // Finaliza a votação
            }

            switch (voto) {
                case 1: votosJose++; break;
                case 2: votosJoao++; break;
                case 3: votosMaria++; break;
                case 4: votosAna++; break;
                case 5: votosNulos++; break;
                case 6: votosBrancos++; break;
                default: 
                    System.out.println("❌ Código inválido! Tente novamente.");
                    continue;
            }

            totalVotos++;
        }

        // Calcula porcentagens
        double percentualNulos = (totalVotos > 0) ? (double) votosNulos / totalVotos * 100 : 0;
        double percentualBrancos = (totalVotos > 0) ? (double) votosBrancos / totalVotos * 100 : 0;

        // Exibe os resultados
        System.out.println("\n✅ Resultado da eleição:");
        System.out.println("José: " + votosJose + " votos");
        System.out.println("João: " + votosJoao + " votos");
        System.out.println("Maria: " + votosMaria + " votos");
        System.out.println("Ana: " + votosAna + " votos");
        System.out.println("Votos Nulos: " + votosNulos + " votos (" + percentualNulos + "%)");
        System.out.println("Votos em Branco: " + votosBrancos + " votos (" + percentualBrancos + "%)");

        scanner.close();
    }
}
