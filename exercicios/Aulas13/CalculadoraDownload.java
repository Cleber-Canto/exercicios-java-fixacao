import java.util.Scanner;

public class CalculadoraDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do arquivo em MB
        System.out.print("Digite o tamanho do arquivo para download (MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        // Solicita a velocidade da internet em Mbps
        System.out.print("Digite a velocidade do link de Internet (Mbps): ");
        double velocidadeMbps = scanner.nextDouble();

        // Convertendo Mbps para MBps (1 Mbps = 0.125 MBps)
        double velocidadeMBps = velocidadeMbps * 0.125;

        // Calcula o tempo aproximado em minutos
        double tempoSegundos = tamanhoArquivoMB / velocidadeMBps;
        double tempoMinutos = tempoSegundos / 60;

        // Exibe resultado
        System.out.printf("Tempo aproximado de download: %.2f minutos%n", tempoMinutos);

        scanner.close();
    }
}
