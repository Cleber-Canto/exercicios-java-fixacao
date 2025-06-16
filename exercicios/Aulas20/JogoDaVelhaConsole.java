import java.util.Scanner;

public class JogoDaVelhaConsole {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';
        int jogadas = 0;
        Scanner scanner = new Scanner(System.in);

        // Inicializa o tabuleiro com espaços vazios
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                tabuleiro[i][j] = ' ';

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", informe linha e coluna (0-2):");

            int linha, coluna;

            while (true) {
                System.out.print("Linha: ");
                linha = scanner.nextInt();
                System.out.print("Coluna: ");
                coluna = scanner.nextInt();

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                    if (tabuleiro[linha][coluna] == ' ') {
                        tabuleiro[linha][coluna] = jogadorAtual;
                        jogadas++;
                        break;
                    } else {
                        System.out.println("❌ Posição já ocupada. Escolha outra.");
                    }
                } else {
                    System.out.println("❌ Posição inválida. Informe valores entre 0 e 2.");
                }
            }

            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("🎉 Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (jogadas == 9) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("⚖️ Empate!");
                jogoAtivo = false;
            } else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i);
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j]);
                if (j < 2) System.out.print(" |");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    public static boolean verificarVitoria(char[][] tab, char jogador) {
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == jogador && tab[i][1] == jogador && tab[i][2] == jogador) return true;
            if (tab[0][i] == jogador && tab[1][i] == jogador && tab[2][i] == jogador) return true;
        }
        return (tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) ||
               (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador);
    }
}
