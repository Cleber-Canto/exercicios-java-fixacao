import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número de 1 a 7 para ver o dia da semana: ");
        int numero = scanner.nextInt();

        // Verifica o dia correspondente
        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Valor inválido!";
                break;
        }

        // Exibe o resultado
        System.out.println("Dia correspondente: " + diaSemana);

        scanner.close();
    }
}
