import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        // Loop até que o usuário informe um valor válido
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida registrada: " + nota);
        scanner.close();
    }
}
