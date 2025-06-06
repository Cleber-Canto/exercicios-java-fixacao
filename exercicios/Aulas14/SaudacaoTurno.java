import java.util.Scanner;

public class SaudacaoTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o turno
        System.out.print("Digite o turno em que estuda (M-matutino, V-vespertino, N-noturno): ");
        char turno = scanner.next().toUpperCase().charAt(0); // Converte para maiúscula

        // Exibe a saudação correspondente
        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
                break;
        }

        scanner.close();
    }
}
